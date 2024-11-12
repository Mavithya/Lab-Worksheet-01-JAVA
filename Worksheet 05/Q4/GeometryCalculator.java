package Q4;

import static Q4.MathOperations.* ;

public class GeometryCalculator {


    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        System.out.println(mathOperations.pi);
        System.out.printf("Area of circle :%.2f",calculateCircleArea(5));
        System.out.println();
        System.out.println("Area of square :" + calculateSquareArea(4));
    }

}