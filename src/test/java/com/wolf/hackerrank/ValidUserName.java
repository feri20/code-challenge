package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class ValidUserName {

    @Test
    void validityCheck(){
        String userName = "_julia456123";
        if(userName.length()<8|userName.length()>30){
            System.out.println("Invalid");
        }else if (!Pattern.matches("^[a-zA-Z][a-zA-Z0-9_]*$",userName)){
            System.out.println("Valid");
        }
    }
}
