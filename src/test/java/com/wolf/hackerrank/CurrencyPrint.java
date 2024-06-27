package com.wolf.hackerrank;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

@SpringBootTest
class CurrencyPrint{
    @Test
    void printCurrencies(){
        double amount = 1234.123;
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        DecimalFormatSymbols symbols = ((java.text.DecimalFormat) chinaFormatter).getDecimalFormatSymbols();
        symbols.setPatternSeparator(' ');
        ((java.text.DecimalFormat) chinaFormatter).setDecimalFormatSymbols(symbols);
        String china = chinaFormatter.format(amount);
        System.out.println("China: " + china);
    }

}
