package com.yma.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorForStep4Test {

    @Test
    public void addLatestVersionTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep4();
        assertEquals(0, stringCalculator.Add(""));
        assertEquals(2, stringCalculator.Add("2"));
        assertEquals(7, stringCalculator.Add("1,6"));
        assertEquals(10, stringCalculator.Add("2,3,5"));
        assertEquals(6, stringCalculator.Add("1\n2,3"));
        assertThrows(CalculatorException.class, () -> stringCalculator.Add("1,\n2"));
    }

    @Test
    public void addWithDelimiterInFirstLineTest() {
        StringCalculator stringCalculator = new StringCalculatorForStep4();
        assertEquals(3, stringCalculator.Add("//;\n1;2"));
        assertEquals(14, stringCalculator.Add("//:\n2\n5:4:1\n2"));
    }
}
