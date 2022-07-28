package SuperMarket;

import java.util.Scanner;

public class StationaryList {
    public static void main(String[] args) {
        Pen bluePen = new Pen(15, 5);
        Pen redPen = new Pen(15, 5);
        Eraser penEraser = new Eraser(3, 5);
        Eraser pencilEraser = new Eraser(3, 5);
        Book singleRule = new Book(30, 5);
        Book doubleRule = new Book(30, 15);

        while (true) {
        System.out.println("1.Available Pens");
        System.out.println("2.Available Erasers");
        System.out.println("3.Available Books");
        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();


        if (selected == 1) {
            System.out.println("Choose your option:");
            System.out.println("1.Blue Pen:" + bluePen.stock);
            System.out.println("2.Red Pen:" + redPen.stock);
            System.out.println("Press 1 & 2 to buy or 0 to exit");
            int selected1 = scanner.nextInt();
            if (selected1 == 1) {
                bluePen.buy(1);
            } else if (selected1 == 2) {
                redPen.buy(1);
            }
        }

        if (selected == 2) {
            System.out.println("Choose your option:");
            System.out.println("1.Pen Eraser:" + penEraser.stock);
            System.out.println("2.Pencil Eraser:" + pencilEraser.stock);
            System.out.println("Press 1 & 2 to buy or 0 to exit");
            int selected2 = scanner.nextInt();
            if (selected2 == 1) {
                bluePen.buy(1);
            } else if (selected2 == 2) {
                redPen.buy(1);
            }
        }

        if (selected == 3) {
            System.out.println("Choose your option:");
            System.out.println("1.Single Rule:" + singleRule.stock);
            System.out.println("2.Double Rule:" + doubleRule.stock);
            System.out.println("Press 1 & 2 to buy or 0 to exit");
            int selected3 = scanner.nextInt();
            if (selected3 == 1) {
                bluePen.buy(1);
            } else if (selected3 == 2) {
                redPen.buy(1);
            }
        }
    }
}
}