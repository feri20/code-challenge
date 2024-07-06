package com.wolf.hackerrank;


import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

class Ipv4Regex {

    @Test
    void ipRegex(){
        String ipAddress = "000.257.36.211";
        if (Pattern.matches("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$", ipAddress)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
