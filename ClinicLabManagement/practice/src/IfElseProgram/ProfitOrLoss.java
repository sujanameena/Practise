package IfElseProgram;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Cost Price");
        float cp = scanner.nextFloat();
        System.out.println("Enter the Selling Price");
        float sp = scanner.nextFloat();

        if (cp > sp) {
            float profit;
            profit = cp - sp;
            System.out.println("PROFIT" + " " + profit);
        } else if (cp == sp) {
            System.out.println("Neither Profit Nor Loss");
        } else {
            float loss;
            loss = sp - cp;
            System.out.println("LOSS" + " " + loss);
        }
    }
}
