import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;

        while (thirdNumber < 8) {
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.print(thirdNumber + " ");
        }
    }
}