package IfElseProgram;

import java.util.Scanner;

public class FactorsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count = count + 1;
            }
        }
        System.out.print(count);
    }
}

