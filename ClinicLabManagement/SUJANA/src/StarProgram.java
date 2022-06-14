import java.util.Scanner;

public class StarProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int k = 1; k <= 5; k++) {
            for (int i = 1; i <= k; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}