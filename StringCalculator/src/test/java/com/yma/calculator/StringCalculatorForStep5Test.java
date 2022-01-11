package com.yma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorForStep5Test {

    @Test
    public void addLatestVersionTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep5();
        assertEquals(0, stringCalculator.Add(""));
        assertEquals(2, stringCalculator.Add("2"));
        assertEquals(7, stringCalculator.Add("1,6"));
        assertEquals(10, stringCalculator.Add("2,3,5"));
        assertEquals(6, stringCalculator.Add("1\n2,3"));
        assertThrows(CalculatorException.class, () -> stringCalculator.Add("1,\n2"));

        assertEquals(3, stringCalculator.Add("//;\n1;2"));
        assertEquals(14, stringCalculator.Add("//:\n2\n5:4:1\n2"));
    }

    @Test
    public void addWithNegativeTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep5();
        Exception exception = assertThrows(CalculatorException.class, () -> stringCalculator.Add("//;\n-2\n5;-4;-1\n2"));
        assertEquals("Negatives values [-2, -4, -1] not allowed", exception.getMessage());
    }
}
