package eu.trumm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    static List<Integer> fibonacciRecursion(int numbersInSequence) {
        if (numbersInSequence == 1) {
            return Collections.singletonList(0);
        } else if (numbersInSequence == 2) {
            return Arrays.asList(0, 1);
        } else {
            List<Integer> fibonacciNumbers = new ArrayList<>(fibonacciRecursion(numbersInSequence-1));
            fibonacciNumbers.add(fibonacciNumbers.get(fibonacciNumbers.size() - 1) + fibonacciNumbers.get(fibonacciNumbers.size() - 2));
            return fibonacciNumbers;
        }
    }

    public static List<Integer> fibonacciForLoop(int numbersInSequence) {
        if (numbersInSequence == 1) {
            return Collections.singletonList(0);
        } else if (numbersInSequence == 2) {
            return Arrays.asList(0, 1);
        } else {
            List<Integer> fibonacciNumbers = new ArrayList<>(Arrays.asList(0, 1));
            for (int i = 2; i < numbersInSequence; i++) {
                fibonacciNumbers.add(fibonacciNumbers.get(fibonacciNumbers.size() - 1) + fibonacciNumbers.get(fibonacciNumbers.size() - 2));
            }
            return fibonacciNumbers;
        }
    }
}
