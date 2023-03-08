package extendedEA;

import java.util.Arrays;
import java.util.Scanner;


public class extendedEA
{
  public static int[] EAA(int a, int b) { //O(log n)
    // Return x and y in form a*x + b*y = gcd(a,b)
    // x is the inverse of a
    // There is only an inverse if gcd(a,b) == 1

    //initialization is O(1)
    int oldR = a, r = b;  //remainders
    int oldX = 1, x = 0;  //coefficient
    int oldY = 0, y = 1;  //coefficient

    while (r != 0)  //the remainder is always getting smaller, gcd(a,b) is oldR
                    //it works as GCD (although more data process, but that's only O(1)
                    //worst case = r only gets halved, so it iterates log(2, n) times
    {
      int quotient = Math.floorDiv(oldR, r);

      //everything after this is O(1)

      int temp = r;
      r = oldR - quotient * temp;
      oldR = temp;

      temp = x;
      x = oldX - quotient * x;
      oldX = temp;

      temp = y;
      y = oldY - quotient * y;
      oldY = temp;
    }

    return new int[]{oldX, oldY};
  }



  // Do not change methods below;

  private static int mod(int a, int b) {
    return ((a%b)+b) % b;
  }

  public static int moduloInverse(int a, int b) {
    int[] result = EAA(a, b);
    return mod(result[0], b);
  }
  public static void main(String[] args)
  {
    // input
    System.out.println("Extended Euclidean Algorithm");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Expression calculator for gcd(a, b)");
    System.out.print("Give value for a: ");
    int a = scanner.nextInt();
    System.out.print("Give value for b: ");
    int b = scanner.nextInt();
    System.out.println();
    System.out.println(Arrays.toString(EAA(a,b)));
    System.out.println(GCD.findGCD(a,b) + " = " + a + "(" + EAA(a,b)[0] + ")"
        + ((b < 0) ? " - " : " + ")
        + Math.abs(b) + "(" + EAA(a,b)[1] + ")");
    System.out.println((GCD.findGCD(a,b) != 1 ? "No inverse exists" : "The inverse of "
        + a + " mod " + b + " is " + EAA(a,b)[0]));

  }
}
