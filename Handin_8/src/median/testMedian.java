package median;

public class testMedian
{
  public static void testAll()
  {
    testSingle();
    test1();
    test2();
    test3();
    test4();
    test5();
    test6();
    test7();
    test8();
    test9();
    test10();
    test11();
    test12();
    test13();
    test14();
    testQuadraticTime();
  }

  public static void testSingle()
  {
    int[] input = {1};
    int correctAnswer = 1;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("testSingle",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("testSingle");
  }

  public static void test1()
  {
    int[] input = {2, 5, 3, 7};
    int correctAnswer = 5;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("test1",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("test1");
  }

  public static void test2()
  {
    int[] input = {1, 7, 2, 3, 5};
    int correctAnswer = 3;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("test2",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("test2");
  }

  public static void test3()
  {
    int[] input = {2, 4, 7, 9, 3};
    int correctAnswer = 4;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("test3",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("test3");
  }

  public static void test4()
  {
    int[] input = {32, 59, 32673, 58586, 14162, 288, 411};
    int correctAnswer = 411;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("test4",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("test4");
  }

  public static void test5()
  {
    int[] input = {3, 7, 2, 1, 5};
    int correctAnswer = 3;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("test5",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("test5");
  }

  public static void test6()
  {
    int[] input = {3, 2};
    int correctAnswer = 3;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("test6",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("test6");
  }

  public static void test7()
  {
    int correctAnswer = 4;
    Median m = new Median();
    m.add(1);
    m.add(2);
    m.add(3);
    m.add(4);
    m.add(5);
    m.add(6);
    m.add(7);

    // Try calling median() many times
    for (int i = 1; i <= 10; i++)
    {
      int output = m.median();
      if (output != correctAnswer)
      {
        outputFail("test7",
            "Expected output " + correctAnswer + " in iteration " + i
                + " but got " + output);
        return;
      }
    }
    outputPass("test7");
  }

  public static void test8()
  {
    int[] input = {3, 1, 2};
    int correctAnswer = 2;

    Median m = new Median();
    for (int i : input)
      m.add(i);

    int output = m.median();

    if (output != correctAnswer)
      outputFail("test8",
          "Expected output " + correctAnswer + " but got " + output);
    else
      outputPass("test8");
  }

  public static void test9()
  {
    int[] input = {3, 1, 2};
    int[] correctAnswers = {3, 3, 2};

    Median m = new Median();
    for (int i = 0; i < input.length; i++)
    {
      m.add(input[i]);

      int output = m.median();
      int correctAnswer = correctAnswers[i];

      if (output != correctAnswer)
      {
        outputFail("test9",
            "After inserting " + (i + 1) + " element(s): " + "Expected output "
                + correctAnswer + " but got " + output);
        return;
      }
    }
    outputPass("test9");
  }

  public static void test10()
  {
    int[] input = {1, 3, 2};
    int[] correctAnswers = {1, 3, 2};

    Median m = new Median();
    for (int i = 0; i < input.length; i++)
    {
      m.add(input[i]);

      int output = m.median();
      int correctAnswer = correctAnswers[i];

      if (output != correctAnswer)
      {
        outputFail("test10",
            "After inserting " + (i + 1) + " element(s): " + "Expected output "
                + correctAnswer + " but got " + output);
        return;
      }
    }
    outputPass("test10");
  }

  public static void test11()
  {
    int[] input = {2, 3, 4, 5, 15, 7, 9, 11, 6, 14, 8, 10, 12, 13, 1};
    int[] correctAnswers = {2, 3, 3, 4, 4, 5, 5, 7, 6, 7, 7, 8, 8, 9, 8};

    Median m = new Median();
    for (int i = 0; i < input.length; i++)
    {
      m.add(input[i]);

      int output = m.median();
      int correctAnswer = correctAnswers[i];

      if (output != correctAnswer)
      {
        outputFail("test11",
            "After inserting " + (i + 1) + " element(s): " + "Expected output "
                + correctAnswer + " but got " + output);
        return;
      }
    }
    outputPass("test11");
  }

  public static void test12()
  {
    int[] input = {1, 5, 7, 3, 9, 4, 6, 8};
    int[] correctAnswers = {1, 5, 5, 5, 5, 5, 5, 6};

    Median m = new Median();
    for (int i = 0; i < input.length; i++)
    {
      m.add(input[i]);

      int output = m.median();
      int correctAnswer = correctAnswers[i];

      if (output != correctAnswer)
      {
        outputFail("test12",
            "After inserting " + (i + 1) + " element(s): " + "Expected output "
                + correctAnswer + " but got " + output);
        return;
      }
    }
    outputPass("test12");
  }

  public static void test13()
  {
    int[] input = {10, 1, 2, 3, 4};
    int[] correctAnswers = {10, 10, 2, 3, 3};

    Median m = new Median();
    for (int i = 0; i < input.length; i++)
    {
      m.add(input[i]);

      int output = m.median();
      int correctAnswer = correctAnswers[i];

      if (output != correctAnswer)
      {
        outputFail("test13",
            "After inserting " + (i + 1) + " element(s): " + "Expected output "
                + correctAnswer + " but got " + output);
        return;
      }
    }
    outputPass("test13");
  }

  public static void test14()
  {
    int[] input = {98, 5, 9, 10, 20, 39, 29};
    int[] correctAnswers = {98, 98, 9, 10, 10, 20, 20};

    Median m = new Median();
    for (int i = 0; i < input.length; i++)
    {
      m.add(input[i]);

      int output = m.median();
      int correctAnswer = correctAnswers[i];

      if (output != correctAnswer)
      {
        outputFail("test14",
            "After inserting " + (i + 1) + " element(s): " + "Expected output "
                + correctAnswer + " but got " + output);
        return;
      }
    }
    outputPass("test14");
  }

  public static void testQuadraticTime() {
    int n1 = 10000;
    int n2 = 30000;
    long t11 = timeTest(n1);
    long t12 = timeTest(n1);
    long t13 = timeTest(n1);
    long t14 = timeTest(n1);
    long t15 = timeTest(n1);
    long t1 = Math.min(Math.min(Math.min(Math.min(t11, t12), t13), t14), t15);
    System.out.println("");
    System.out.println("Testing time complexity.");
    System.out.println("Elapsed time on input size n1 = " + n1 + ": t1 = " + t1);
    long t21 = timeTest(n2);
    long t22 = timeTest(n2);
    long t23 = timeTest(n2);
    long t2 = Math.min(Math.min(t21, t22), t23);
    System.out.println("Elapsed time on input size n2 = " + n2 + ": t2 = " + t2);
    double slowdown = ((double) t2) / t1;
    double linearSlowdown = ((double) n2) / n1;
    System.out.println("Expected slowdown (for linear time): n2 / n1 = " + linearSlowdown);
    System.out.println("Measured slowdown: t2 / t1 = " + slowdown);
    if (slowdown > Math.pow(linearSlowdown, 1.2))
      System.out.println("That's not log N --> 1 point if all above tests are passed");
    else
      System.out.println("Wow! That really is log N time --> 1 additional point if all above tests are passed");
  }

  private static long timeTest(int n) {
    long t1 = System.nanoTime();
    Median m = new Median();
    for (int i = 0; i < n; ++i) {
      m.add((int) (i * 982451653L % 413158511L));
    }
    m.median();
    long t2 = System.nanoTime();
    // For debugging, output the individual times:
    // System.out.println(n + " " + (t2 - t1));
    return t2 - t1;
  }



  private static void clearTerminal()
  {
    System.out.print('\u000C');
  }

  private static void outputPass(String testName)
  {
    System.out.println("[Pass " + testName + "]");
  }

  private static void outputFail(String testName, String message)
  {
    System.out.println("[FAIL " + testName + "] " + message);
  }

  public static void main(String[] args)
  {
    testAll();
  }
}
