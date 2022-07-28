import java.util.Scanner;

public class TwoTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        for (int i = 1; i <= 10; i++) {
            number = 2 * i;
            System.out.println("2X" + i + "=" + number);
        }
    }
}