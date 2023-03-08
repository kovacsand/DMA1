package maxSubSum;

import java.util.*;

public class maxSubSum
{
  public int findMaxSubSum(ArrayList<Integer> input)
  {
    int biggestSum = 0, currentSum = 0;

    for (Integer integer : input)
    {
      currentSum += integer;
      if (currentSum < 0)
        currentSum = 0;
      if (currentSum > biggestSum)
        biggestSum = currentSum;
    }
    return biggestSum;
  }
}
