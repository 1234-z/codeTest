package com.my.code;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String EMPTY = "";

    /**
     * Determines the string representation of a given number according to FizzBuzz rules.
     * 1. For multiples of three return “Fizz” instead of the number
     * 2. For the multiples of five return “Buzz”
     * 3. For numbers that are multiples of both three and five return “FizzBuzz”.
     *
     * @param number The number to be judged, which can be any integer including 0.
     * @return The corresponding FizzBuzz string according to the rules.
     */
    public static String fizzBuzz(int number) {
        // Check if the number is 0 or not divisible by either 3 or 5
        if (number == 0 || (number % 3 != 0 && number % 5 != 0)) {
            // For numbers that are not multiples of both three and five
            return EMPTY;
        } else if (number % 3 == 0) {
            // Check if the number is divisible by 5 in addition to 3
            if (number % 5 == 0) {
                // For numbers that are multiples of both three and five
                return FIZZBUZZ;
            }
            //    For multiples of three return “Fizz”
            return FIZZ;
        } else {
            //    For multiples of five return “Buzz”
            return BUZZ;
        }
    }

}
