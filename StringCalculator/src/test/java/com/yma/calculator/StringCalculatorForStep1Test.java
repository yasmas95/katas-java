package com.yma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorForStep1Test {
    @Test
    public void addWithEmptyTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep1();
        assertEquals(0, stringCalculator.Add(""));
    }

    @Test
    public void addWithOneNumbersTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep1();
        assertEquals(2, stringCalculator.Add("2"));
    }

    @Test
    public void addTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep1();
        assertEquals(7, stringCalculator.Add("1,6"));
    }

    @Test
    public void addWithThreeNumbersTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep1();
        assertEquals(0, stringCalculator.Add("2,3,5"));
    }
}
