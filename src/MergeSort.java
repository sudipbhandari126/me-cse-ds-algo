public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {2, 5, 9, 1};
    printArray(arr);
    mergeSort(arr, arr.length);
    printArray(arr);
  }

  private static void mergeSort(int[] a, int n) {
    if (n < 2) {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(a, l, r, mid, n - mid);
  }


  private static void merge(
      int[] a, int[] l, int[] r, int left, int right) {
    printArray(a);
    printArray(l);
    printArray(r);
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
      if (l[i] <= r[j]) {
        a[k++] = l[i++];
      } else {
        a[k++] = r[j++];
      }
    }
    while (i < left) {
      a[k++] = l[i++];
    }
    while (j < right) {
      a[k++] = r[j++];
    }
  }

  private static void  printArray(int[] arr){
    for (int i : arr) {
      System.out.print(i);
    }
    System.out.println();
  }
}


