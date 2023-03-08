import java.text.DecimalFormat;

public class TimeComplexities
{
  public static void main(String[] args)
  {
    DecimalFormat bigOFormatter = new DecimalFormat("###,###,###,###,###");
    final long n = 300;
    System.out.println("n = " + n);

    //Exercise 5.1.
    long sum = 0;
    long startTime = System.nanoTime();
    for (long i = 0; i < n; i++)
      sum++;
    long elapsedTime = System.nanoTime() - startTime;
    System.out.print("Exercise 5.1.");
    System.out.printf("%10s", "(O(n)): ");
    System.out.printf("%20s\n", bigOFormatter.format(elapsedTime));

    //Exercise 5.2.
    sum = 0;
    startTime = System.nanoTime();
    for (long i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        sum++;
    elapsedTime = System.nanoTime() - startTime;
    System.out.print("Exercise 5.2.");
    System.out.printf("%10s", "(O(n^2)): ");
    System.out.printf("%20s\n", bigOFormatter.format(elapsedTime));

    //Exercise 5.3.
    sum = 0;
    startTime = System.nanoTime();
    for (long i = 0; i < n; i++)
      for (long j = 0; j < n * n; j++)
        sum++;
    elapsedTime = System.nanoTime() - startTime;
    System.out.print("Exercise 5.3.");
    System.out.printf("%10s", "(O(n^3)): ");
    System.out.printf("%20s\n", bigOFormatter.format(elapsedTime));

    //Exercise 5.4.
    sum = 0;
    startTime = System.nanoTime();
    for (long i = 0; i < n; i++)
      for (long j = 0; j < i; j++)
        sum++;
    elapsedTime = System.nanoTime() - startTime;
    System.out.print("Exercise 5.4.");
    System.out.printf("%10s", "(O(n^2)): ");
    System.out.printf("%20s\n", bigOFormatter.format(elapsedTime));

    //Exercise 5.5.
    //Slower than you'd think!!!
    sum = 0;
    startTime = System.nanoTime();
    for (long i = 0; i < n; i++)
      for (int j = 0; j < i * i; j++)
        for (long k = 0; k < j; k++)
          sum++;
    elapsedTime = System.nanoTime() - startTime;
    System.out.print("Exercise 5.5.");
    System.out.printf("%10s", "(O(n^5)): ");
    System.out.printf("%20s\n", bigOFormatter.format(elapsedTime));

    //Exercise 5.6.
    sum = 0;
    startTime = System.nanoTime();
    for (long i = 0; i < n; i++)
      for (int j = 0; j < i * i; j++)
        if (j % i == 0)
          for (int k = 0; k < j; k++)
            sum++;
    elapsedTime = System.nanoTime() - startTime;
    System.out.print("Exercise 5.6.");
    System.out.printf("%10s", "(O(n^4)): ");
    System.out.printf("%20s\n", bigOFormatter.format(elapsedTime));

  }
}
