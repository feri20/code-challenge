package com.wolf.hackerrank.algorithms;

public class CountingSort {
      @Test
    public void countingSort() {

        int maxValue = 100;
        int[] scores = {85, 92, 78, 92, 85, 67, 78, 85};
        int[] count = new int[maxValue + 1]; // +1 because of 0 index
        for (int num : scores) {
            count[num]++;
        }
        for (int i = 1; i <= maxValue; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[scores.length];
        for (int i = scores.length - 1; i >= 0; i--) {
            int num = scores[i];
            output[count[num] - 1] = num;
            count[num]--;
        }
        System.out.println(Arrays.toString(output));
    }
}
