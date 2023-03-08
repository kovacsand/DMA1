package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  public boolean checkParentheses(ArrayList<Character> input) //T(  1 + n * 8 + 1) = O(n), where n is the size of the input
  {
    Deque<Character> stack = new ArrayDeque<>(); //1
    for (int i = 0; i < input.size(); i++)  //This runs n times, where n is the size of the input
    {
      if (input.get(i) == '(' || input.get(i) == '[')  //1 + 1 + 1 probability of this is 50%
        stack.addLast(input.get(i)); //1
      if (stack.isEmpty()) //1, we can't know how often this is true
        return false; //1

      if (input.get(i) == ')' && stack.removeLast() == '[') //1 + 1 + 1 + 1, probability of this is 25%
        return false; //1
      if (input.get(i) == ']' && stack.removeLast() == '(') //1 + 1 + 1 + 1, this is the last 25%
        return false; //1
    }
    return stack.isEmpty(); //1
  }
}
