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

        if (numbers.contains(",\n")) {
            throw new CalculatorException(String.format("The %s is not ok", numbers));
        }
        String[] numbersArray = Utils.explode(numbers, "\n");

        int Sum = 0;
        for (String strings : numbersArray) {
            int[] ints = Utils.convert(Utils.explode(strings, ","));
            Sum += Utils.sum(ints);
        }

        return Sum;
    }
}
