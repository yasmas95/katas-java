package com.yma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorForStep2Test {

    @Test
    public void addLatestVersionTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep2();
        assertEquals(0, stringCalculator.Add(""));
        assertEquals(2, stringCalculator.Add("2"));
        assertEquals(7, stringCalculator.Add("1,6"));
    }

    @Test
    public void addWithThreeNumbersTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep2();
        assertEquals(10, stringCalculator.Add("2,3,5"));
    }
}
