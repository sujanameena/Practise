 package Cooking;

import java.util.Scanner;

public class Dish {
    public static void main(String[] args) {
        Food biryani = new Food("Biryani", 300, "rice", "ghee", "water", "vegetables");
        Food chicken = new Food("ChickenCurry", 150, "chicken", "masala", "oil", "water");
        Food mutton = new Food("MuttonCurry", 200, "mutton", "SpicyMasala", "coconut", "water");
        Food paneer = new Food("PaneerCurry", 100, "paneer", "curd", "water", "ghee");

        System.out.println("Enter the Ingredient name");
        Scanner scanner = new Scanner(System.in);
        String selected1 = scanner.nextLine();
        if (biryani.contains(selected1)) {
            System.out.println("biryani");
        }
        if (chicken.contains(selected1)) {
            System.out.println("chicken");
        }
        if (mutton.contains(selected1)) {
            System.out.println("mutton");
        }
        if (paneer.contains(selected1)) {
            System.out.println("paneer");
        }else{
            System.out.println("unknown ingredient");
            System.exit(0);
        }


        System.out.println("Available Dishes");
        System.out.println("1.Biryani");
        System.out.println("2.Chicken Curry");
        System.out.println("3.Mutton Curry");
        System.out.println("4.Mutton Curry");
        int selected2 = scanner.nextInt();

        if (selected2 == 1) {
            System.out.println("Name: " + biryani.name);
            System.out.println("Price: " + biryani.price);
            System.out.println("Ingredients: ");
            biryani.show();
        }


        if (selected2 == 2) {
            System.out.println("Name: " + chicken.name);
            System.out.println("Price: " + chicken.price);
            System.out.println("Ingredients: ");
            chicken.show();
        }

        if (selected2 == 3) {
            System.out.println("Name: " + mutton.name);
            System.out.println("Price: " + mutton.price);
            System.out.println("Ingredients: ");
            mutton.show();
        }

        if (selected2 == 4) {
            System.out.println("Name: " + paneer.name);
            System.out.println("Price: " + paneer.price);
            System.out.println("Ingredients: ");
            paneer.show();
        }
    }
}
