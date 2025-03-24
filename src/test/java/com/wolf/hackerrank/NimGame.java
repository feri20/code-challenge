package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class NimGame {

    @Test
    public void test() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 4 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
