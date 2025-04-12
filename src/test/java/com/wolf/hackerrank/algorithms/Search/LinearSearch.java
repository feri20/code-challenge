package com.wolf.hackerrank.algorithms.Search;

import org.junit.jupiter.api.Test;

// worst case : o(n)
// best case : o(1)
// average case : o(n)
class LinearSearch {

    @Test
    public void linearSearch() {
        int x = 6;
        int[] arr = {1, 4, 8, 7, 5, 6, 2, 9, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println(x + " is found at index " + i);
            }
        }
    }
}
