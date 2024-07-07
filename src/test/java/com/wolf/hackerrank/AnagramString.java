package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class AnagramString {


    @Test
    void AnagramChecker() {
            String a = "anagram";
            String b = "marganam";
            if (a.length() == b.length()) {
                Map<String, Integer> firstString = new HashMap<>();
                Map<String, Integer> secondString = new HashMap<>();
                for (int i = 0; i <= a.length() - 1; i++) {
                    String tempa = String.valueOf(a.charAt(i));
                    String tempb = String.valueOf(b.charAt(i));
                    int counta = 1;
                    int countb = 1;
                    for (int j = i + 1; j <= a.length() - 1; j++) {
                        if (tempa.equalsIgnoreCase(String.valueOf(a.charAt(j)))) {
                            counta++;}
                        if (tempb.equalsIgnoreCase(String.valueOf(b.charAt(j)))) {
                            countb++;}
                    }
                    firstString.putIfAbsent(tempa.toLowerCase(), counta);
                    secondString.putIfAbsent(tempb.toLowerCase(), countb);
                }
                if (firstString.equals(secondString)) {
                    System.out.println("Anagrams");
                } else {
                    System.out.println("Not Anagrams");}
            } else {
                System.out.println("Not Anagrams");}

    }

}
