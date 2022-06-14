package IfElseProgram;

import java.util.Scanner;

public class EvenNumberGiven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is not even number");
        }
    }
}
