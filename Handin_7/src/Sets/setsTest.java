package Sets;

import java.util.HashSet;

public class setsTest
{
  public static void main(String[] args)
  {
    test1();
    test2();
    test3();
    System.out.println("------------------------------------------");
    test4();
    test5();
    test6();
    System.out.println("------------------------------------------");
    test7();
    test8();
    test9();
    System.out.println("------------------------------------------");
    test10();
    test11();
    test12();
    System.out.println("------------------------------------------");
    test13();
    test14();
    test15();
    test16();
    test17();
    System.out.println("------------------------------------------");
  }

  private static void test1()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set2.add("John");
    set2.add("James");

    resultSet.add("John");
    resultSet.add("Jim");
    resultSet.add("James");

    runTestUnion(set1, set2, resultSet, "test1 - union");
  }

  private static void test2()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    resultSet.add("John");
    resultSet.add("Jim");
    resultSet.add("James");
    resultSet.add("Susanna");

    runTestUnion(set1, set2, resultSet, "test2 - union");
  }

  private static void test3()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set1.add("Susanna");
    set1.add("James");
    set2.add("John");
    set2.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    resultSet.add("John");
    resultSet.add("Jim");
    resultSet.add("James");
    resultSet.add("Susanna");

    runTestUnion(set1, set2, resultSet, "test3 - union");
  }

  private static void runTestUnion(HashSet<String> set1, HashSet<String> set2,
      HashSet<String> resultSet, String testName)
  {
    sets s1 = new sets();

    HashSet<String> set1Temp = new HashSet<>(set1);
    HashSet<String> set2Temp = new HashSet<>(set2);

    HashSet<String> set;
    try
    {
      set = s1.union(set1, set2);
    }
    catch (Exception e)
    {
      outputFail(testName, "Failed with exception: " + e);
      return;
    }

    if (!set1.equals(set1Temp))
    {
      outputFail(testName,
          "set1 has changed from: " + set1Temp.toString() + " to: "
              + set1.toString());
    }
    else if (!set2.equals(set2Temp))
    {
      outputFail(testName,
          "set2 has changed from: " + set2Temp.toString() + " to: "
              + set2.toString());
    }
    else if (!set.equals(resultSet))
      outputFail(testName,
          "Expected output " + resultSet.toString() + " but got "
              + set.toString());
    else
    {
      outputPass(testName);
      System.out.println(
          "Output " + resultSet.toString() + " input 1 " + set1.toString()
              + " input 2 " + set2.toString());
    }
  }

  //////////

  private static void test4()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set2.add("John");
    set2.add("James");

    resultSet.add("John");

    runTestInter(set1, set2, resultSet, "test1 - intersection");
  }

  private static void test5()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    runTestInter(set1, set2, resultSet, "test2 - intersection");
  }

  private static void test6()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set1.add("Susanna");
    set1.add("James");
    set2.add("John");
    set2.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    resultSet.add("John");
    resultSet.add("Jim");
    resultSet.add("James");
    resultSet.add("Susanna");

    runTestInter(set1, set2, resultSet, "test3 - intersection");
  }

  private static void runTestInter(HashSet<String> set1, HashSet<String> set2,
      HashSet<String> resultSet, String testName)
  {
    sets i = new sets();
    HashSet<String> set1Temp = new HashSet<>(set1);
    HashSet<String> set2Temp = new HashSet<>(set2);

    HashSet<String> set;
    try
    {
      set = i.intersection(set1, set2);
    }
    catch (Exception e)
    {
      outputFail(testName, "Failed with exception: " + e);
      return;
    }

    if (!set1.equals(set1Temp))
    {
      outputFail(testName,
          "set1 has changed from: " + set1Temp.toString() + " to: "
              + set1.toString());
    }
    else if (!set2.equals(set2Temp))
    {
      outputFail(testName,
          "set2 has changed from: " + set2Temp.toString() + " to: "
              + set2.toString());
    }
    else if (!set.equals(resultSet))
      outputFail(testName,
          "Expected output " + resultSet.toString() + " but got "
              + set.toString());
    else
    {
      outputPass(testName);
      System.out.println(
          "Output " + resultSet.toString() + " input 1 " + set1.toString()
              + " input 2 " + set2.toString());
    }
  }

  ////////////////////

  private static void test7()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set2.add("John");
    set2.add("James");

    resultSet.add("Jim");

    runTestrc(set1, set2, resultSet, "test1 - rc");
  }

  private static void test8()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    resultSet.add("John");
    resultSet.add("Jim");

    runTestrc(set1, set2, resultSet, "test2 - rc");
  }

  private static void test9()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    HashSet<String> resultSet = new HashSet<>();

    set1.add("John");
    set1.add("Jim");
    set1.add("Susanna");
    set1.add("James");
    set2.add("John");
    set2.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    runTestrc(set1, set2, resultSet, "test3 - rc");
  }

  private static void runTestrc(HashSet<String> set1, HashSet<String> set2,
      HashSet<String> resultSet, String testName)
  {
    sets rc = new sets();

    HashSet<String> set;
    try
    {
      set = sets.relativeComplement(set1, set2);
    }
    catch (Exception e)
    {
      outputFail(testName, "Failed with exception: " + e);
      return;
    }
    if (!set.equals(resultSet))
      outputFail(testName,
          "Expected output " + resultSet.toString() + " but got "
              + set.toString());
    else
    {
      outputPass(testName);
      System.out.println(
          "Output " + resultSet.toString() + " input 1 " + set1.toString()
              + " input 2 " + set2.toString());
    }
  }

  ////////////////////////
  private static void test10()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAsubSet = false;

    set1.add("John");
    set1.add("Jim");
    set2.add("John");
    set2.add("James");

    runTestsubset(set1, set2, isAsubSet, "test1 - sub");
  }

  private static void test11()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAsubSet = true;

    set1.add("John");
    set1.add("Jim");
    set2.add("Susanna");
    set2.add("James");
    set2.add("John");
    set2.add("Jim");

    runTestsubset(set1, set2, isAsubSet, "test2 - sub");
  }

  private static void test12()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAsubSet = true;

    set1.add("John");
    set1.add("Jim");
    set1.add("Susanna");
    set1.add("James");

    set2.add("John");
    set2.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    runTestsubset(set1, set2, isAsubSet, "test3 - sub");
  }

  private static void runTestsubset(HashSet<String> set1, HashSet<String> set2,
      boolean isAsubSet, String testName)
  {
    sets s = new sets();
    HashSet<String> set1Temp = new HashSet<>(set1);
    HashSet<String> set2Temp = new HashSet<>(set2);

    boolean result;
    try
    {
      result = s.isASubSet(set1, set2);
    }
    catch (Exception e)
    {
      outputFail(testName, "Failed with exception: " + e);
      return;
    }

    if (!set1.equals(set1Temp))
    {
      outputFail(testName,
          "set1 has changed from: " + set1Temp.toString() + " to: "
              + set1.toString());
    }
    else if (!set2.equals(set2Temp))
    {
      outputFail(testName,
          "set2 has changed from: " + set2Temp.toString() + " to: "
              + set2.toString());
    }
    else if (result != isAsubSet)
      outputFail(testName,
          "Expected output " + isAsubSet + " but got " + result);
    else
    {
      outputPass(testName);
      System.out.println("Output " + isAsubSet + " and got " + result);
    }
  }

  //////////////////////////////

  private static void test13()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAproperSubSet = false;

    set1.add("John");
    set1.add("Jim");
    set2.add("John");
    set2.add("James");

    runTestProperSubSet(set1, set2, isAproperSubSet, "test1 -ProperSubSet");
  }

  private static void test14()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAproperSubSet = true;

    set1.add("John");
    set1.add("Jim");
    set2.add("Susanna");
    set2.add("James");
    set2.add("John");
    set2.add("Jim");

    runTestProperSubSet(set1, set2, isAproperSubSet, "test2 -ProperSubSet");
  }

  private static void test15()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAproperSubSet = false;

    set1.add("John");
    set1.add("Jim");
    set1.add("Susanna");
    set1.add("James");

    set2.add("John");
    set2.add("Jim");
    set2.add("Susanna");
    set2.add("James");

    runTestProperSubSet(set1, set2, isAproperSubSet, "test3 -ProperSubSet");
  }

  private static void test16()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAproperSubSet = false;

    set1.add("John");
    set1.add("Jim");
    set1.add("Susanna");
    set1.add("James");

    set2.add("Susanna");
    set2.add("James");

    runTestProperSubSet(set1, set2, isAproperSubSet, "test4 -ProperSubSet");
  }

  private static void test17()
  {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    boolean isAproperSubSet = false;

    set1.add("Anne");
    set1.add("Susanna");
    set1.add("James");

    set2.add("Susanna");
    set2.add("James");
    set2.add("John");
    set2.add("Jim");

    runTestProperSubSet(set1, set2, isAproperSubSet, "test5 -ProperSubSet");
  }

  private static void runTestProperSubSet(HashSet<String> set1, HashSet<String> set2,
      boolean isAsubSet, String testName)
  {
    sets ps = new sets();
    HashSet<String> set1Temp = new HashSet<>(set1);
    HashSet<String> set2Temp = new HashSet<>(set2);

    boolean result;
    try
    {
      result = ps.isProperSubSet(set1, set2);
    }
    catch (Exception e)
    {
      outputFail(testName, "Failed with exception: " + e);
      return;
    }

    if (!set1.equals(set1Temp))
    {
      outputFail(testName,
          "set1 has changed from: " + set1Temp.toString() + " to: "
              + set1.toString());
    }
    else if (!set2.equals(set2Temp))
    {
      outputFail(testName,
          "set2 has changed from: " + set2Temp.toString() + " to: "
              + set2.toString());
    }
    else if (result != isAsubSet)
      outputFail(testName,
          "Expected output " + isAsubSet + " but got " + result);
    else
    {
      outputPass(testName);
      System.out.println("Output " + isAsubSet + " and got " + result);
    }
  }

  /////////////////////////
  private static void outputPass(String testName)
  {
    System.out.println("[Pass " + testName + "]");
  }

  private static void outputFail(String testName, String message)
  {
    System.out.println("[FAIL " + testName + "] " + message);
  }

}
