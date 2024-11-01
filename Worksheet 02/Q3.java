import java.util.Scanner;

public class Q3 {
    public void print(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of rows in the pyramid :");
            int value = in.nextInt();
            Q3 q3 = new Q3();
            q3.print(value);

        }

}