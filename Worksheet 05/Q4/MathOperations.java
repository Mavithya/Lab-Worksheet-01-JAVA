package Q4;

public class MathOperations {
    static double pi = 3.14159;


    static double calculateCircleArea(double radius){
        double area = pi * radius * radius;
//        System.out.printf("Circle Area is: %.2f", area);
        return area;
    }

    static double calculateSquareArea(double side){
        double area = side * side;
        return area;
    }


}
