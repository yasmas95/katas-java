package com.yma.calculator;

import java.util.Arrays;

public class StringCalculatorForStep4 implements StringCalculator {

    /**
     * Sum numbers separated by delimiter in the first line contained in the given numbers
     * -The given string contains multiline
     *
     * @param numbers
     * @return
     */
    @Override
    public int Add(String numbers) {

        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.contains(",\n")) {
            throw new CalculatorException(String.format("The %s is not ok", numbers));
        }
        String delimiter = ",";
        String[] numbersArray = Utils.explode(numbers, "\n");

        if (numbersArray[0].contains("//")) {
            delimiter = String.valueOf(numbersArray[0].charAt(numbersArray[0].length() - 1));
            numbersArray = Arrays.copyOfRange(numbersArray, 1, numbersArray.length);
        }

        return Utils.sumMultiLine(numbersArray, delimiter);
    }


}
