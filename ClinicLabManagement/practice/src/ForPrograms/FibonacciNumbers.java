package ForPrograms;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 1; i <= 20; i++) {
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.print(thirdNumber + " ");
        }
    }
}