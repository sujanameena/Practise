package CarShowroom;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Car i20 = new Car("red", "i20", 600000);
        Car audi = new Car("blue", "AUDI", 900000);
        Car kia = new Car("white", "KIA", 800000);
        //while (true) {
            System.out.println("Available Cars List:");
            System.out.println("1.i20");
            System.out.println("2.AUDI");
            System.out.println("3.KIA");
            Scanner scanner = new Scanner(System.in);
            int selected = scanner.nextInt();


            if (selected == 1) {
                System.out.println("Available i20 stock is:" + i20.stock);
                System.out.println("Press 1 to buy or 0 to exit");
                int selected2 = scanner.nextInt();
                if (selected2 == 1) {
                    i20.buy(1);
                }
            }
            if (selected == 2) {
                System.out.println("Available AUDI stock is:" + audi.stock);
                System.out.println("press 1 to buy or 0 to exit");
                int selected3 = scanner.nextInt();
                if (selected3 == 1) {
                    audi.buy(1);
                }
            }
            if (selected == 3) {
                System.out.println("Available AUDI stock is:" + kia.stock);
                System.out.println("press 1 to buy or 0 to exit");
                int selected4 = scanner.nextInt();
                if (selected4 == 1) {
                    kia.buy(1);
                }
            }
        }
    }