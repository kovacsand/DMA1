package maze;

import java.util.ArrayDeque;
import java.util.Deque;

public class Maze
{
  public int shortestPath(char[][] maze)
  {
    int height = maze.length;
    int width = maze[0].length;

    class Vertex
    {
      int x, y;
      int status; //1/2/3 = unvisited/discovered/finished = white/grey/black
      int distance; //distance from [1][1]
      Vertex parent;

      public Vertex()
      {
        this.x = -1;
        this.y = -1;
        status = 1;
        distance = Integer.MAX_VALUE;
        parent = null;
      }
    }

    //We start at maze[1][1], and want to get to maze[height - 2][width - 2]
    //We want a breath-first search, because that is how we can find the shortest path


    //Based on pseudocode from Richard Brooks - Graphs (can be found on itslearning)

    //init
    Vertex[][] vertexes = new Vertex[height][width];
    for (int i = 0; i < height; i++)
      for (int j = 0; j < width; j++)
      {
        vertexes[i][j] = new Vertex();
        vertexes[i][j].x = i;
        vertexes[i][j].y = j;
      }


    vertexes[1][1].status = 2;
    vertexes[1][1].distance = 0;

    Deque<Vertex> queue = new ArrayDeque<>();
    queue.addLast(vertexes[1][1]);

    while (queue.size() != 0)
    {
      Vertex u = queue.removeFirst();

      //Go through all the neighbours
      Vertex v = vertexes[u.x - 1][u.y]; //Neighbour to the top
      if (v.status == 1 && maze[v.x][v.y] == '.')
      {
        v.status = 2;
        v.distance = u.distance + 1;
        v.parent = u;
        queue.addLast(v);
      }
      v = vertexes[u.x][u.y + 1]; //Neighbour to the right
      if (v.status == 1 && maze[v.x][v.y] == '.')
      {
        v.status = 2;
        v.distance = u.distance + 1;
        v.parent = u;
        queue.addLast(v);
      }
      v = vertexes[u.x + 1][u.y]; //Neighbour to the bottom
      if (v.status == 1 && maze[v.x][v.y] == '.')
      {
        v.status = 2;
        v.distance = u.distance + 1;
        v.parent = u;
        queue.addLast(v);
      }
      v = vertexes[u.x][u.y - 1]; //Neighbour to the left
      if (v.status == 1 && maze[v.x][v.y] == '.')
      {
        v.status = 2;
        v.distance = u.distance + 1;
        v.parent = u;
        queue.addLast(v);
      }
      u.status = 3;
    }
    return vertexes[height - 2][width - 2].distance;
  }
}
