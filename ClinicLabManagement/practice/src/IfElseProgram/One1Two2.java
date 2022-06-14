package IfElseProgram;

import java.util.Scanner;

public class One1Two2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number;
        number = scanner.nextInt();

        if (number > 3) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        } else if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        }
    }
}