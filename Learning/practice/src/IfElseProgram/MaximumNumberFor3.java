package IfElseProgram;

import java.util.Scanner;

public class MaximumNumberFor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else if (c > a) {
            System.out.println(c);
        }
    }
}