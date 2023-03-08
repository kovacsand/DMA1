import java.util.ArrayList;

public class MyMath
{
  public static void main(String[] args)
  {
    System.out.println(modExpoCalculator(72, 143, 114));
  }

  //The Euclidean Algorithm
  public static int gcd(int a, int b)
  {
    if (a % b == 0)
    {
      return b;
    }
    else {
      return gcd(b,  a % b);
    }
  }

  //Euler's Phi function
  public static int phi(int m)
  {
    //The long way, finding all co-primes
    //I should use Euler's Phi function, but this is easier
    int counter = 0;
    for (int i = 1; i <= m; i++)
    {
      if (gcd(i, m) == 1)
      {
        counter++;
      }
    }
    return counter;
  }

  //Finding inverse using Euler's Theorem
  public static int inverse(int a, int n) //a*x = b mod n
  {
    if (gcd(a, n) == 1 && n >= 2)
    {
      //return Math.pow(a, phi(n)-1)  % n;
      return squareAndMultiply(a, phi(n)-1, n);
    }
    else
    {
      return 0;
    }
  }

  //Square and multiply algorithm
  public static int squareAndMultiply(int base, int exponent, int mod)
  {
    double x = base;
    for (int i = 1; i < decToBinaryStr(exponent).length(); i++)
    {
      if (decToBinaryStr(exponent).charAt(i) == '1')
      {
        x = (Math.pow(x, 2) * base) % mod;
      }
      else if (decToBinaryStr(exponent).charAt(i) == '0')
      {
        x = Math.pow(x, 2) % mod;
      }
    }
    return (int) x;
  }

  public static int modExpoCalculator(int base, int exponent, int modulo)
  {


    int exponentLengthInBinary = (int) Math.floor(Math.log(exponent)) + 1; //it is int, but still have to cast



    ArrayList<Boolean> exponentInBinary = new ArrayList<>(exponentLengthInBinary);
    while (exponent > 0)
    {
      if (exponent % 2 == 1)
        exponentInBinary.add(0, true);
      else
        exponentInBinary.add(0, false);
      exponent = Math.floorDiv(exponent, 2);
    }

    for (Boolean bool : exponentInBinary)
      if (bool)
        System.out.print(1);
      else
        System.out.print(0);



    //    int x = 1;
    //    int power = base % modulo;
    //    for (int i = 0; i < exponentLengthInBinary-1; i++)
    //    {
    //      if (exponent % 2 == 1)
    //        x = (x*power) % modulo;
    //      power = (power * power) % modulo;
    //      exponent = Math.floorDiv(exponent, 2);
    //    }

    int x = base;
    for (int i = 1; i < exponentLengthInBinary; i++)
    {
      if (exponent % 2 == 1)
        x = (int) ((Math.pow(x, 2) * base) % modulo);
      x = (int) (Math.pow(x, 2) % modulo);
      exponent = Math.floorDiv(exponent, 2);
    }

    return 999;
  }

  //Gives back a String in binary
  public static String decToBinaryStr(int x)
  {
    String str = "";
    while (x >= 1)
    {
      str = x % 2 + str;
      x /= 2;
    }
    return str;
  }

  //Gives back an integer in binary
  public static int decToBinaryInt(String str)
  {
    int binary = 0;
    for (int i = str.length()-1; i >= 0; i--)
    {
      if (str.charAt(i) == '1')
      {
        binary += Math.pow(10, str.length()-i-1);
      }
    }
    return binary;
  }
}
