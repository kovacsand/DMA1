package GCD;

public class GCD
{
  // Euclidean algorithm is the simplest to implement

  public int findGCD1(int a, int b) //O(n)
  {
    //It checks for every number smaller than the smaller if it's divisible by them
    for (int i = Math.min(a, b); i >= 2; i--)  //This is O(n), where n is the smaller number of the two
      if (a % i == 0 && b % i == 0) //This is O(5), which is O(1)
        return i; //This is O(1)
    return 1; //This is O(1)
  }

  public int findGCD2(int a, int b) //O(n)
  {
    //This method uses repeated subtraction to find the GCD of the two numbers
    while (a != b)  //Worst case, i.e. if one of them is one, then the program has to do n iterations, thus O(n)
      if (a > b)    //O(1)
        a -= b;     //O(2)
      else
        b -= a;     //O(2)
    return a;       //O(1)
  }

  public int findGCD3(int a, int b) //O(log n)
  {
    //This method uses the Euclidean algorithm with recursive calls
    if (a % b == 0)  //This is O(2)
      return b;     //This is O(1)
    return findGCD3(b % a, a);
    //This is O(1) + the recursive call, worst case scenario, b only gets halved, so that means the method will call itself log(2,n) times, where n is the smaller of the two numbers
  }
}
