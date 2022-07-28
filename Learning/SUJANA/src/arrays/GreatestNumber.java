package arrays;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter numbers");
        int big = 0;
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
            if (big < a[i]) {
                big = a[i];
            }
        }
        System.out.println("Greater number"+" "+big);
    }
}