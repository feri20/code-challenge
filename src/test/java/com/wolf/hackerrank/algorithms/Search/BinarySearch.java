package com.wolf.hackerrank.algorithms.Search;

import org.junit.jupiter.api.Test;

// worst case : o(log n)
// best case : o(1)
// average case : o(log n)
// the data is sorted by default for this search
class BinarySearch {

    @Test
    public void binarySearch() {
        int target = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int low = 0 ;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // solution for Integer Overflow Protection
            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else if (target == arr[mid]) {
                System.out.println("element found at : " + mid);
                break;
            }
        }
    }

}
