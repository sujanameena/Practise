package arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter numbers");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = 0;
        int average=0;
        System.out.println("entered numbers");
        for (int i = 0; i < 10; i++) {
            sum = sum + a[i];
        }
        average = sum / 10;
        System.out.println(average);
    }
}
