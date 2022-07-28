package ForPrograms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //looping 1 to 100 numbers
        for (int i = 1; i <= 100; i++) {
            int factorCount = 0;
            //calculating number of factors
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factorCount++;
                }
            }
            //to check for exactly two factors
            if (factorCount == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
