package General;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number in Fahrenheit");
        int number=scanner.nextInt();

        int tempt1=number-32;
        int celsius=tempt1*5/9;
        System.out.println("Celsius value is"+" "+celsius);
    }
}