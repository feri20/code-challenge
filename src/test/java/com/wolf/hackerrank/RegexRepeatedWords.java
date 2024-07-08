package com.wolf.hackerrank;

import org.springframework.boot.SpringApplication;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexRepeatedWords {

    public static void main(String[] args) {
        SpringApplication.run(HackerrankApplication.class, args);
        try (Scanner scanner = new Scanner(System.in)) {
            int number = Integer.parseInt(scanner.nextLine());
            for (int i = 1;i<=number;i++) {
                String input = scanner.nextLine();
                String regex = "\\b(\\w+)(\\s+\\1)+\\b";
                Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    input = input.replaceAll(matcher.group(0), matcher.group(1));
                }
                System.out.println(input);
            }
        }
    }

}
