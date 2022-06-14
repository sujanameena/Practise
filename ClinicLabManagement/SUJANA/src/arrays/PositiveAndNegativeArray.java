package arrays;

import java.util.Scanner;

public class PositiveAndNegativeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter numbers");
        int p = 0;
        int q = 0;
        int[] a = new int[4];
        int[] positive = new int[4];
        int[] negative = new int[4];

        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > 0) {
                positive[p] = a[i];
                p++;
            } else {
                negative[q] = a[i];
                q++;
            }
        }
        System.out.println(p);
        System.out.println(q);
    }
}
