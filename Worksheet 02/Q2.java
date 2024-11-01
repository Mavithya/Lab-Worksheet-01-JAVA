import java.util.Scanner;

public class Q2 {
   public static int digitcount(int x){
       if (x < 0) {
           System.exit(0);
       }
    String s =  String.valueOf(x);
   int length = s.length();

    return length;
}
    public static void main(String[] args) {
        int value = 0;
        while (value >= 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the int value :");
            value = in.nextInt();
            System.out.println(digitcount(value));


        }
    }
}