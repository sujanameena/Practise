package arrays;

import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] a = new int[5];
        a[0] = 6;
        a[1] = 5;
        a[2] = 3;
        a[3] = 1;
        a[4] = 4;
        int minimumNumber = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minimumNumber) {
                minimumNumber = a[i];
            }
        }
        System.out.println(minimumNumber);
    }
}