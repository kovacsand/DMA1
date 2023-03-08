public class RSA
{
  public static void main(String[] args)
  {
    //VARIABLES
    final int p = 991, //large primes
              q = 997,
              n = p * q,
              e = 7, //public key
              M = 55; //message

    //Finding d - inverse of e
    //Using Euler's Theorem
    int d = MyMath.inverse(e, MyMath.phi(n));

    int c = MyMath.squareAndMultiply(M, e, n);

    int decryptedM = MyMath.squareAndMultiply(c, d, n);

    System.out.println("The encrypted message is : " + c);
    System.out.println("The decrypted message is: " + decryptedM);

    //System.out.println(MyMath.gcd(81, 3));
    //System.out.println(MyMath.phi(240));
    //System.out.println(MyMath.phi(160));
    //System.out.println(Math.pow(3, 63));
    //System.out.println(MyMath.inverse(3, 160));

    //System.out.println(MyMath.decToBinaryStr(400));
    //System.out.println(MyMath.squareAndMultiply(7, 245, 11));

  }
}
