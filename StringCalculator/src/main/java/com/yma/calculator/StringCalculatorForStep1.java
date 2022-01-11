package com.yma.calculator;

import java.util.Arrays;

public class StringCalculatorForStep1 implements StringCalculator {
    /**
     * Sum two numbers  separated by commas contained in the given numbers
     *
     * @param numbers
     * @return
     */
    @Override
    public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            return 0;
        }
        return Arrays.stream(numbersArray)
                .map(String::trim).mapToInt(Integer::parseInt).sum();

    }
}
