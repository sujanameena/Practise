package arrays;

import java.util.Scanner;

public class SumIsThere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = new int[5];
        int[] result = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int resultIndex = 0;
        for (int j = 0; j < a.length; j++) {
            int maxNumber = a[0];
            int maxNumberIndex = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > maxNumber) {
                    maxNumber = a[i];
                    maxNumberIndex = i;
                }
            }
            a[maxNumberIndex] = -1;
            result[resultIndex] = maxNumber;
            resultIndex++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }
}
