package exercises;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        String userName;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name?");
        userName = in.nextLine();
        System.out.println("Hello, " + userName);
    }
}
