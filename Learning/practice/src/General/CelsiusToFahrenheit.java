package General;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number in celsius");
        int number=scanner.nextInt();

        int temp1=number*9/5;
        int fahrenheit=temp1+32;
        System.out.println("Fahrenheit value is"+" "+fahrenheit);
    }
}