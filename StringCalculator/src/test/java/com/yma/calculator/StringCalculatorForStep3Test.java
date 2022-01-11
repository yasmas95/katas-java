package com.yma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorForStep3Test {

    @Test
    public void addLatestVersionTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep3();
        assertEquals(0, stringCalculator.Add(""));
        assertEquals(2, stringCalculator.Add("2"));
        assertEquals(7, stringCalculator.Add("1,6"));
        assertEquals(10, stringCalculator.Add("2,3,5"));
    }

    @Test
    public void addTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep3();
        assertEquals(6, stringCalculator.Add("1\n2,3"));
    }

    @Test
    public void addWhenNotOkTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep3();
        Exception exception = assertThrows(CalculatorException.class, () -> {
            stringCalculator.Add("1,\n2");
        });

        assertEquals("The 1,\n2 is not ok", exception.getMessage());
    }
}
