package eu.trumm;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(pigLatinStream("!"));
    }


    public static String pigLatinStream(String sentence) {

        String changedSentence = Arrays.stream(sentence.split(" "))
                .map(word -> word.substring(1, word.length()).concat(word.substring(0, 1)))
                .map(word -> word.concat("ay"))
                .collect(Collectors.joining(" "));
        return changedSentence;
    }

}
