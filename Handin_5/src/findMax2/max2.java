package findMax2;

public class max2
{
  public int findMax2(int[] input)
  {
    int maxPosition = 0;
    for (int i = 1; i < input.length; i++)
      if (input[i] > input[maxPosition])
        maxPosition = i;
    return input[maxPosition];
  }
}
