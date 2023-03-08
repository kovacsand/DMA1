package inversions;

import java.util.ArrayList;

public class Inversions
{
  public int countInversions(ArrayList<Integer> input) {
    return mergeSort(input.toArray(new Integer[input.size()]), 0, input.size() - 1);
  }

  private static int mergeSort(Integer[] array, int left, int right)
  {
    //Regular mergeSort, just added counter
    int counter = 0;
    if (left < right)
    {
      int middle = (left + right) / 2;
      counter += mergeSort(array, left, middle);
      counter += mergeSort(array, middle + 1, right);
      counter += merge(array, left, middle, right);
    }
    return counter;
  }

  private static int merge(Integer[] array, int left, int middle, int right)
  {
    //init the two array
    Integer[] leftArray = new Integer[middle + 1 - left];
    Integer[] rightArray = new Integer[right - middle];

    for (int i = 0; i < leftArray.length; i++)
      leftArray[i] = array[left + i];
    for (int i = 0; i < rightArray.length; i++)
      rightArray[i] = array[middle + 1 + i];

    //Regular merge
    int i = 0, j = 0, k = left, counter = 0;
    while (i < leftArray.length && j < rightArray.length)
    {
      if (leftArray[i] <= rightArray[j])
        array[k++] = leftArray[i++];
      else
      {
        array[k++] = rightArray[j++];
        counter += (middle + 1) - (left + i);
        //This is the only special thing, we add the number of swaps to the counter
        //First index of rightArray - number of elements of leftArray that were not changed
      }
    }

    //Finish merging
    while (i < leftArray.length)
      array[k++] = leftArray[i++];
    while (j < rightArray.length)
      array[k++] = rightArray[j++];

    return counter;
  }
}

