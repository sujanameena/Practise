package IfElseProgram;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Remainder");

        System.out.println("Enter Operation");
        int operation = scanner.nextInt();
        System.out.println("Enter First Number");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        if (operation > 5) {
            System.out.println("INVALID INPUT");
            System.exit(0);

        } else if (operation == 1) {
            operation = a + b;
            System.out.println("Addition:" + " " + operation);
        } else if (operation == 2) {
            operation = a - b;
            System.out.println("Subtraction:" + " " + operation);
        } else if (operation == 3) {
            operation = a * b;
            System.out.println("Multiplication:" + " " + operation);
        } else if (operation == 4) {
            operation = a / b;
            System.out.println("Division:" + " " + operation);
        } else if (operation == 5) {
            operation = a % b;
            System.out.println("Remainder:" + " " + operation);
        }
    }
}
