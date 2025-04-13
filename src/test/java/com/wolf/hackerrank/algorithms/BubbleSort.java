package com.wolf.hackerrank.algorithms;

// worst case : o(n^2)
// best case : o(n) already sorted
// average case : o(n^2)
public class BubbleSort {
  @Test
    public void bubbleSort() {
        int[] arr = {2, 25, 22, 40, 8, 36, 1, 6, 3, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
