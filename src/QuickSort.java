import java.util.PriorityQueue;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr={4,6,2,1};
    Common.printArray(arr);
    quickSort(arr,0,arr.length-1);
    Common.printArray(arr);

  }

  private static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(arr, begin, end);

      quickSort(arr, begin, partitionIndex-1);
      quickSort(arr, partitionIndex+1, end);
    }
  }

  private static int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;

        int swapTemp = arr[i];
        arr[i] = arr[j];
        arr[j] = swapTemp;
      }
    }

    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;

    return i+1;
  }

}
