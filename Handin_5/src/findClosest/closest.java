package findClosest;

import java.util.*;

public class closest
{

  public int findClosest(ArrayList<Integer> input)
  {
    Collections.sort(input);
    int smallestDif = input.get(1) - input.get(0);
    for (int i = 1; i < input.size()-1; i++)
      if (input.get(i+1) - input.get(i) < smallestDif)
        smallestDif = input.get(i+1) - input.get(i);
    return smallestDif;
  }

}