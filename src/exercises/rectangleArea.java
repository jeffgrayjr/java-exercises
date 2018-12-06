package exercises;

import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Double height;
        Double width;
        Double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Height: ");
        height = in.nextDouble();
        System.out.println("Width: ");
        width = in.nextDouble();
        area = height * width;
        System.out.println("Total area is " + area);
    }
}
