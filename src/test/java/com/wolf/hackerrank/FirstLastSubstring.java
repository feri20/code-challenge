package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class FirstLastSubstring {


    @Test
    void firstLastSub(){
        String input = "HhelloMyNameisfrozen";
        int number = 3;
        char[] inputChar = input.toCharArray();
        int pivot = partition(inputChar, 0, inputChar.length - 1);
        sort(inputChar, 0,pivot);
        sort(inputChar, pivot +1, inputChar.length -1);

        List<Integer> firstCharIndexes = new ArrayList<>();
        List<Integer> lastCharIndexes = new ArrayList<>();
        for(int i = 0; i <=input.length()-1;i++) {
            if (inputChar[0] == input.charAt(i) && i <= input.length() - number) {
                firstCharIndexes.add(i);
            }
            if (inputChar[inputChar.length - 1] == input.charAt(i) && i <= input.length() - number) {
                lastCharIndexes.add(i);
            }
        }
        if(!firstCharIndexes.isEmpty()) {
            String firstSubstring = input.substring(firstCharIndexes.get(0), firstCharIndexes.get(0) + number);
            for (Integer firstCharIndex : firstCharIndexes) {
                String temp = input.substring(firstCharIndex, firstCharIndex + number);
                if (temp.compareTo(firstSubstring) < 0) {
                    firstSubstring = temp;
                }
            }
            System.out.println(firstSubstring);
        }
        if(!lastCharIndexes.isEmpty()) {
            String lastSubstring = input.substring(lastCharIndexes.get(0), lastCharIndexes.get(0) + number);
            for (Integer lastCharIndex : lastCharIndexes) {
                String temp = input.substring(lastCharIndex, lastCharIndex + number);
                if (temp.compareTo(lastSubstring) > 0) {
                    lastSubstring = temp;
                }
            }
            System.out.println(lastSubstring);}
        if(input.length()==number) {
            System.out.println(input);
        }
    }

    private int partition(char[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    private void sort(char[] arr, int low, int high) {
        if (low < high) {
            // Partition the array around the pivot element
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

}
