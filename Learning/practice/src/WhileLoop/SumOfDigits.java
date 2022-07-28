package WhileLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        int lastDigit;
        int sum = 0;
        int firstNumber=0;
        while (number > 0) {
            lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}