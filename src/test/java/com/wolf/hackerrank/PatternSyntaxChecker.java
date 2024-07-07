package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;


public class PatternSyntaxChecker {

    @Test
    void patternChecker() {
        String input = "[AZ[a-z](a-z)";
        for (int i = 1; i <= 2; i++) {

            boolean exception = false;
            try {
                Pattern.compile(input);
            } catch (Exception e) {
                exception = true;
            }
            if (exception) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        }
    }



}
