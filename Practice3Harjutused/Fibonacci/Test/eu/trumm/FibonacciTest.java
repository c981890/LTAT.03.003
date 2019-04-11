package eu.trumm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void fibonacciRecursion1NumberTest() {
        assertEquals(Collections.singletonList(0), Fibonacci.fibonacciRecursion(1));
    }

    @Test
    public void fibonacciRecursion2NumbersTest() {
        assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacciRecursion(2));
    }

    @Test
    public void fibonacciRecursionManyNumbersTest() {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacciRecursion(100));
    }

    @Test
    public void fibonacciForLoop1NumberTest() {
        assertEquals(Collections.singletonList(0), Fibonacci.fibonacciForLoop(1));
    }

    @Test
    public void fibonacciForLoop2NumbersTest() {
        assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacciForLoop(2));
    }

    @Test
    public void fibonacciForLoopManyNumbersTest() {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacciForLoop(7));
    }

    @Test
    public void fibonacciWhileLoop1NumberTest() {
        assertEquals(Collections.singletonList(0), Fibonacci.fibonacciWhileLoop(1));
    }

    @Test
    public void fibonacciWhileLoop2NumbersTest() {
        assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacciWhileLoop(2));
    }

    @Test
    public void fibonacciWhileLoopManyNumbersTest() {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacciWhileLoop(7));
    }


}