public class Sequences
{
  public static void main(String[] args)
  {
//    System.out.println("First exercise:");
//    float sum = 0;
//    for (int i = 0; i <= 100000; i++)
//    {
//      sum += (4 * Math.pow(-1, i) ) / (float) (2 * i + 1);
//      //System.out.printf("\nThe %dth element is: %f", i, (4 * Math.pow(-1, i) ) / (float) (2 * i + 1) );
//    }
//    System.out.println(sum);
//
//    System.out.println("Second exercise:");
//    sum = 0;
//    for (int i = 0; i <= 1000; i++)
//    {
//      float factorial = 0;
//      for (int j = 0; j <= i; j++)
//      {
//        if (j == 0)
//        {
//          factorial = 1;
//        }
//        else
//        {
//          factorial *= j;
//        }
//      }
//      //System.out.printf("\nThe %dth element is: %f", i, factorial);
//      sum += (float) 1 / factorial;
//    }
//    System.out.println(sum);


    //HAND IN 4
    System.out.println("Hand in 4:");
    double sum = 0;
    System.out.println("Exercise 3.c,");
    for (int i = 0; i <= 600; i++)
      sum += Math.pow(((double)2/3), i);
    System.out.println(sum);

    sum = 0;
    System.out.println("Exercise 3.d,");
    for (int i = 0; i <= 600; i++)
      sum += (Math.pow(3, i) - Math.pow(2, i)) / (Math.pow(6, i));
    System.out.println(sum);

  }
}
