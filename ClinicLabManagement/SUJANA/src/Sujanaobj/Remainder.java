package Sujanaobj;

public class Remainder {
    int firstNumber;
    int secondNumber;

    public Remainder(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int remainder() {
        return firstNumber % secondNumber;
    }
}
