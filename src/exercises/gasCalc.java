package exercises;

import java.util.Scanner;

public class gasCalc {
    public static void main(String[] args) {
        Double milage;
        Double gallons;
        Double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        milage = in.nextDouble();
        System.out.println("How much gas have you used?");
        gallons = in.nextDouble();
        mpg = milage/gallons;
        System.out.println("Fuel efficiency is:" + mpg + " miles per gallon");
    }
}
