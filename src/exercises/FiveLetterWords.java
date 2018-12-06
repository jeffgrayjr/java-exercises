package exercises;

import java.util.ArrayList;
import java.util.Arrays;


public class FiveLetterWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("Hello", "Five","Juice", "Eleven", "Derps")
        );

        System.out.println("Five letter words:");
        for (String word: words) {
            if (word.length() == 5){
                System.out.println(word);
            }
        }

    }
}