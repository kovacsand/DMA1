package median;

import java.util.Collections;
import java.util.PriorityQueue;

public class
Median {

    //Two heaps, one of them containing all the small numbers, the other containing all the large ones
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //The root is the smallest element
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //The root is the largest element

    public void add(int x) {
        //maxHeap has n elements, minHeap has n or n+1 elements
        if (minHeap.size() == maxHeap.size()) //If they're the same size
        {
            maxHeap.add(x); //Add new element to maxHeap //adding is O(log n)
            minHeap.add(maxHeap.poll()); //Remove the smallest of maxHeap, and add it to minHeap //removing is O(log n)
        }
        else //If they're not the same size
        {
            minHeap.add(x); //Add new element to minHeap, now it has n+2 elements, and  maxHeap only has n
            maxHeap.add(minHeap.poll()); //Remove the largest element of minHeap, and add it to maxHeap
        }
    }

    public int median() {
        return minHeap.peek();
    }
}
    