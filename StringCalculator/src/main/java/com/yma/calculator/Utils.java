package com.yma.calculator;

import java.util.Arrays;

public class Utils {

    private Utils() {
        // private constructor
    }

    /**
     * Sum numbers of the given array
     *
     * @param ints
     * @return
     */
    public static int sum(int[] ints) {
        return Arrays.stream(ints).sum();
    }

    /**
     * Extract numbers separated by delimiter from the given string
     *
     * @param strings
     * @param delimiter
     * @return
     */
    public static String[] explode(String strings, String delimiter) {
        return strings.split(delimiter);
    }

    /**
     * Convert the given string array to int array
     *
     * @param numbers
     * @return
     */
    public static int[] convert(String[] numbers) {
        return Arrays.stream(numbers)
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

    /**
     * Sum numbers separated by the given delimiter contained in the given numbersArray
     *
     * @param numbersArray
     * @param delimiter
     * @return
     */
    public static int sumMultiLine(String[] numbersArray, String delimiter) {
        int Sum = 0;
        for (String strings : numbersArray) {
            int[] ints = convert(explode(strings, delimiter));
            Sum += sum(ints);
        }
        return Sum;
    }

}
