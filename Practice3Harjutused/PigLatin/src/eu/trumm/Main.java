package eu.trumm;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(pigLatinStream("!"));
    }


    public static String pigLatinStream(String sentence) {

        String changedSentence = Arrays.stream(sentence.split(" ")) // https://www.geeksforgeeks.org/arrays-stream-method-in-java/
                .map(word -> word.substring(1).concat(word.substring(0, 1)))// https://dzone.com/articles/how-to-use-map-filter-collect-of-stream-in-java-8
                .map(word -> word.concat("ay"))
                .collect(Collectors.joining(" ")); //https://www.baeldung.com/java-8-collectors
        return changedSentence;
    }

}
