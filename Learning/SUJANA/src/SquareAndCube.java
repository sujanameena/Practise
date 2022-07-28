import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number");
        int number = scanner.nextInt();

        int square = number * number;
        int cube = square * number;
        System.out.println("square=" + square);
        System.out.println("cube=" + cube);
    }
}
