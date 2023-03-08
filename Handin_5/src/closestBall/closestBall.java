package closestBall;
import java.util.*;

public class closestBall
{
  public int computeClosest(ArrayList<Integer> players,
      ArrayList<Integer> balls)
  {
    Collections.sort(players);
    Collections.sort(balls);
    int smallestDif = Math.abs(players.get(0) - balls.get(0));
    int i = 0, j = 0;

    while (i < players.size() && j < balls.size())
    {
      if (Math.abs(players.get(i) - balls.get(j)) < smallestDif)
        smallestDif = Math.abs(players.get(i) - balls.get(j));
      else
      {
        if ((players.get(i)) < balls.get(j))
          i++;
        else
          j++;
      }
    }
    return smallestDif;
  }
}
