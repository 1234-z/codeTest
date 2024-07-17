package com.my.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the fizzBuzz function. This class contains several test.csv cases to ensure
 * that the fizzBuzz function behaves as expected for various input values.
 */
public class FizzBuzzTest {

    /**
     * Tests the fizzBuzz function with a number divisible by both 3 and 5.
     * According to the FizzBuzz game, the function should return "FizzBuzz" for such numbers.
     */
    @Test
    public void testFizzBuzzForNumberDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(-15));
    }

    /**
     * Tests the fizzBuzz function with a number divisible by 3 but not by 5.
     * According to the FizzBuzz game, the function should return "Fizz" for such numbers.
     */
    @Test
    public void testFizzForNumberDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(-3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(-9));
    }

    /**
     * Tests the fizzBuzz function with a number divisible by 5 but not by 3.
     * According to the FizzBuzz game, the function should return "Buzz" for such numbers.
     */
    @Test
    public void testBuzzForNumberDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(-5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(-10));
    }

    /**
     * Tests the fizzBuzz function with a number not divisible by either 3 or 5.
     * According to the FizzBuzz game, the function should return an empty string for such numbers.
     */
    @Test
    public void testEmptyStringForNumberNotDivisibleByThreeOrFive() {
        assertEquals("", FizzBuzz.fizzBuzz(7));
        assertEquals("", FizzBuzz.fizzBuzz(-7));
    }

    /**
     * Tests the fizzBuzz function with zero as input.
     * According to the FizzBuzz game, the function should return an empty string for zero.
     */
    @Test
    public void testZeroInput() {
        assertEquals("", FizzBuzz.fizzBuzz(0));
    }
}
