package Sujanaobj;

public class Calculator {
    public static void main(String[] args) {

        Addition additionObj = new Addition(1, 2);
        int additionResult = additionObj.addition();
        System.out.println("Addition=" + additionResult);

        Subraction subractionObj = new Subraction(3, 2);
        int subractionResult = subractionObj.subraction();
        System.out.println("Subraction=" + subractionResult);

        Multiplication multiplicationObj = new Multiplication(5, 6);
        int multiplicationResult = multiplicationObj.multiplication();
        System.out.println("Multiplication=" + multiplicationResult);

        Division divisionObj = new Division(6, 3);
        int divisionResult = divisionObj.division();
        System.out.println("Division=" + divisionResult);

        Remainder remainderObj = new Remainder(6, 2);
        int remainderResult = remainderObj.remainder();
        System.out.println("Remainder=" + remainderResult);
    }
}