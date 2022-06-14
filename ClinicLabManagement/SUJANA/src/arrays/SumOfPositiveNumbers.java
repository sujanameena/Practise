package arrays;

import java.util.Scanner;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter numbers");
        int sum = 0;
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > 0) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}