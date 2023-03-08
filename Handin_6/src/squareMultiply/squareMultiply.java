package squareMultiply;

import java.util.ArrayList;

public class squareMultiply
{
  public int modExpoCalculator(int base, int exponent, int modulo)  //O((log n) * (log m) * (log m))
      //Where n is the exponent and m is the modulo
  {
    int exponentLengthInBinary = (int) (Math.floor(Math.log(exponent)) + 1); //it is int, but still have to cast
//    int x = 1;
//    int power = base % modulo;
//    for (int i = 0; i < exponentLengthInBinary-1; i++)
//    {
//      if (exponent % 2 == 1)
//        x = (x*power) % modulo;
//      power = (power * power) % modulo;
//      exponent = Math.floorDiv(exponent, 2);
//    }
    //for some reason, this method throws an error at test5 (only test5), so let's do a less efficient method (but same big O)


    ArrayList<Boolean> exponentInBinary = new ArrayList<>(exponentLengthInBinary);
    while (exponent > 0)  //This is O(log exponent), because of line 30, where we halve the exponent
    {
      if (exponent % 2 == 1)
        exponentInBinary.add(0, true);
      else
        exponentInBinary.add(0, false);
      exponent = Math.floorDiv(exponent, 2);
      //everything besides the last line is O(1)
    }

    int x = base; //O(1)
    //Only this is important for complexity
    for (int i = 1; i < exponentInBinary.size(); i++)  //This is O(log exponent)
      if (exponentInBinary.get(i))
        x = (int) ((Math.pow(x, 2) * base) % modulo); //This is O(log modulo) (Montgomery reduction)
      else
        x = (int) (Math.pow(x, 2) % modulo);  //This is also O(log modulo) (Montgomery reduction)
    return x;
  }
}
