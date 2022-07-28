package Area;

import java.util.Scanner;

public class GetArea {
    public static void main(String[] args) {
        System.out.println("Enter the length");
        System.out.println("Enter the breadth");
        Scanner scanner = new Scanner(System.in);



        Area areaObj = new Area(length, breadth);
        int areaResult = areaObj.SetDimension;
        System.out.println("Area Of Rectangle=" + areaResult);
    }
}
