import java.util.Scanner;

public class GivenNumberPrimeOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Given number is prime number");
        } else if (count != 2) {
            System.out.println("Given number is not a prime " +
                    "number");
        }
    }
}

