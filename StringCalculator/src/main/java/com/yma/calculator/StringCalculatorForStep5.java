package com.yma.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculatorForStep5 implements StringCalculator {

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

        if (numbers.isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("-[0-9]?");
        Matcher matcher = pattern.matcher(numbers);

        List<Integer> negatives = new ArrayList<>(0);
        while (matcher.find()) {
            negatives.add(Integer.parseInt(matcher.group()));
        }

        if (!negatives.isEmpty()) {
            throw new CalculatorException(String.format("Negatives values %s not allowed", negatives));
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
