import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in centimeters: ");
        double centimeters = scanner.nextDouble();
        scanner.close();



        // Convert centimeters to inches
        double totalInches = centimeters / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12.0);
        double inches = totalInches % 12.0;


        System.out.println(centimeters + " cm is equal to " + feet + " feet and " + String.format("%.2f", inches) + " inches.");
    }
    }

