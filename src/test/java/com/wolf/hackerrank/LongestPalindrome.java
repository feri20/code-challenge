package com.wolf.hackerrank;


import org.junit.jupiter.api.Test;

class LongestPalindrome {

    @Test
    void palindromeFinder() {
        String input = "abaxyzzyxf";
        int start = 0, end = 0;
        for (int i = 0; i < input.length(); i++) {
            int evenSubLength = palindrome(input, i, i);
            int oddSubLength = palindrome(input, i, i + 1);
            int longest = Math.max(evenSubLength, oddSubLength);

            if (longest > end - start) {
                start = i - (longest - 1) / 2;
                end = i + longest / 2;
            }
        }
        System.out.println(input.substring(start, end + 1));
    }

    private int palindrome(String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
