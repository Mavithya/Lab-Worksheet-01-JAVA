import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word: ");
        String text = scanner.nextLine();
//        scanner.close();
        int length = text.length();
       while (length % 2 == 0) {
              System.out.println("Please enter an odd-length word:");
               String text1 = scanner.nextLine();
            length = text1.length();
    }
        int middleIndex = length / 2;
        System.out.println("Middle character: " + text.charAt(middleIndex));
}
}
