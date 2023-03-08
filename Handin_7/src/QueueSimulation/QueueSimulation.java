package QueueSimulation;

import java.util.*;

public class QueueSimulation
{
  public int simulate(ArrayList<Integer> input) //T(1 + n * 1 + n * 3 + 1) = O(n), where n is the size of the input
  {
    Deque<Integer> queue = new ArrayDeque<>(); //1

    //This runs at n times, where n is the size of the input
    for (Integer integer : input)
      queue.addLast(integer); //1

    while (queue.size() > 1) //With every run, the size of the queue decrements by one, so it will run n times
    {
      queue.removeFirst(); //1
      queue.addLast(queue.removeFirst()); //1 + 1
    }

    return queue.getFirst(); //1
  }
}
