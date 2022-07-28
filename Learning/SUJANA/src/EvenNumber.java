import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Given Number Is Even Number");
        } else {
            System.out.println("Given Number Is Not Even Number");
        }
    }
}
