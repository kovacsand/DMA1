package dodgeBall;

import java.util.TreeSet;

public class dodgeBall
{
  TreeSet<Integer> players = new TreeSet<>();
  public void addPlayer(int x) {  //O(log n)
    players.add(x); //Since we use a balanced binary search tree, this is O(log n)
  }

  public int throwBall(int x) { //Even after adding together everything it is only O(log n)
    if (players.contains(x))  //This is to cut out the easy cases, it is O(log n)
    {
      players.remove(x);  //Search is O(log n)
      return 0;           //This is O(1)
    }

    if (players.floor(x) == null) //A bit longer than the one above, it is O(log n)
    {
      int temp = players.ceiling(x);  //O(1) + O(log n)
      players.remove(temp);           //O(log n)
      players.add(x);                 //O(log n)
      return temp - x;                //O(2)
    }

    if (players.ceiling(x) == null) //Same as above, O(log n)
    {
      int temp = players.floor(x);
      players.remove(players.floor(x));
      players.add(x);
      return x -temp;
    }

    int closest;  //O(1)
    if ( (x - players.floor(x)) <= (players.ceiling(x) - x) ) //O(2 * (log n) + 3)
      closest = players.floor(x);                             //O(1 + (log n))
    else
      closest = players.ceiling(x);                           //O(1 + (log n))
    players.remove(closest);                                  //O(log n)
    players.add(x);                                           //O(log n)
    return Math.abs(x - closest);                             //O(3) Depends on Math.abs, but constant
  }
}
