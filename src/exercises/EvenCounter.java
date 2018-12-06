package exercises;

import java.util.ArrayList;
import java.util.Arrays;


public class EvenCounter {
    public static void main(String[] args) {
        Double evenSum = 0.0;
        ArrayList<Double> numbers = new ArrayList<>(
                Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)
        );


        for (Double number: numbers) {
            if (number % 2 == 0){
                evenSum += number;
            }
        }
        System.out.println("the sum is:" + evenSum);
    }
}