package ReversePolishNotation;

import java.util.*;

public class ReversePolishCalculator
{
  private final Deque<Integer> stack = new ArrayDeque<>();

  public void push(int n) {
    stack.addLast(n); //This is O(1)
  }

  public void plus() { //T(3) = O(1)
    stack.addLast(stack.removeLast() + stack.removeLast()); //1 + 1 + 1
  }

  public void minus() { //T(4) = O(1)
    stack.addLast(- stack.removeLast() + stack.removeLast()); //1 + 1 + 1 + 1
  }

  public void times() { //T(3) = O(1)
    stack.addLast(stack.removeLast() * stack.removeLast()); //1 + 1 + 1
  }

  public int read() {
    return stack.peekLast(); //This is O(1)
  }
}
