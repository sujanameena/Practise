import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int remainder = 0;
        int sum = 0;
        while (number > 0) {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println(sum);
    }
}