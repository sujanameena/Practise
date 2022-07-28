package WhileLoop;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
    }
}