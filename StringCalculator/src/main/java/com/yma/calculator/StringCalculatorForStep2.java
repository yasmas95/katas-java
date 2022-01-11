package com.yma.calculator;

public class StringCalculatorForStep2 implements StringCalculator {

    /**
     * Sum numbers separated by commas contained in the given numbers
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
        if (numbersArray.length > 2) {
            return 0;
        }
        int[] intsArray = Utils.convert(numbersArray);
        return Utils.sum(intsArray);
    }
}
