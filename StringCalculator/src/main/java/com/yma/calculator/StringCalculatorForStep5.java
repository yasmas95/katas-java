package com.yma.calculator;

public class StringCalculatorForStep5 extends StringCalculatorForStep4 {

    /**
     * Sum numbers separated by delimiter in the first line contained in the given numbers
     * - The given string contains multiline
     * - With a negative numbers will throw an exception
     *
     * @param numbers
     * @return
     */
    @Override
    public int Add(String numbers) {
        if (!Utils.getNegativeNumbers(numbers).isEmpty()) {
            throw new CalculatorException(String.format("Negatives values %s not allowed", Utils.getNegativeNumbers(numbers)));
        }

        return super.Add(numbers);
    }
}
