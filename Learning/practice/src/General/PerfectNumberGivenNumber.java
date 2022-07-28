package General;

import java.util.Scanner;

public class PerfectNumberGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (number % i == 0) {
                sum=sum+i;
                System.out.print(sum);
            }
        }
    }
}