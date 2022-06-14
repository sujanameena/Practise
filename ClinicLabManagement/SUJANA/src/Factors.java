import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int number = scanner.nextInt();

        int factor = 0;
        for (int i = 1; i <= number; i++) {
            factor = number % i;
        }
        if (factor == 0) {
            System.out.println(factor);
        }
    }
}
