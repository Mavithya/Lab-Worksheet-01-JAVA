import java.util.Scanner;
class Circle {
    private double radius;

    // Constructor to set the radius
    public Circle(double radius) {
        this.radius = radius;
    }
    // if you want to update the radius after creating the object(optional use karnne )
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Q05 {
    public static void main(String[] args) {
        System.out.println("Enter the inner radius: ");
        Scanner scanner = new Scanner(System.in);
        double ri = scanner.nextDouble();

        System.out.println("Enter the outer radius: ");
        Scanner scanner1 = new Scanner(System.in);
        double ro = scanner1.nextDouble();



        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();


        double shadeArea = outerArea - innerArea;

        double innerCircumference = innerCircle.computeCircumference();
        double outerCircumference = outerCircle.computeCircumference();

        System.out.println("Circumference of inner circle: " + String.format("%.2f", innerCircumference));
        System.out.println("Circumference of outer circle: " + String.format("%.2f", outerCircumference));
        System.out.println("Area of inner circle: " + String.format("%.2f", innerArea));
        System.out.println("Area of outer circle: " + String.format("%.2f", outerArea));
        System.out.println("Area of circular region: " + String.format("%.2f", shadeArea));
        System.out.println();
        innerCircle.setRadius(7);
        outerCircle.setRadius(10);
         innerArea = innerCircle.computeArea();
         outerArea = outerCircle.computeArea();
         shadeArea = outerArea - innerArea;
         innerCircumference = innerCircle.computeCircumference();
         outerCircumference = outerCircle.computeCircumference();

        System.out.println("Circumference of inner circle: " + String.format("%.2f", innerCircumference));
        System.out.println("Circumference of outer circle: " + String.format("%.2f", outerCircumference));
        System.out.println("Area of inner circle: " + String.format("%.2f", innerArea));
        System.out.println("Area of outer circle: " + String.format("%.2f", outerArea));
        System.out.println("Area of circular region: " + String.format("%.2f", shadeArea));
    }
}
