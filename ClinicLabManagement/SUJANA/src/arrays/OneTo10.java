package arrays;

import java.util.Scanner;

public class OneTo10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Numbers");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Entered Numbers");
        for (int i =  0; i < 10; i++) {
            System.out.print(a[i]);
        }
    }
}