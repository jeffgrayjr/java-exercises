package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius;
        Double area;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a Radius");
            radius = in.nextDouble();
        } while (radius <= 0);
        area = 3.14 * radius * radius;
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
