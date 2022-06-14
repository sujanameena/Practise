package General;

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int square = number * number;
        int cube = number * square;
        System.out.println("square of the number is: " + " " + square);
        System.out.println("cube of the number is: " + " " + cube);
    }
}