package com.yma.calculator;

public class StringCalculatorForStep3 implements StringCalculator {

    /**
     * Sum numbers separated by commas contained in the given numbers
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

        String[] numbersArray = Utils.explode(numbers, ",");
        int[] intsArray = Utils.convert(numbersArray);
        return Utils.sum(intsArray);
    }
}
