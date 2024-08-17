import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();
        scanner.close();

        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];
            String middleInitial = middleName.substring(0, 1);

            System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
        } else {
            System.out.println("Please enter a valid full name in the format: first middle last");
        }
    }
}

