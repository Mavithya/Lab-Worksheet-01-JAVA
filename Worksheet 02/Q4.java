//import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Five Integers :");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
//        for (int num : arr) {
//            System.out.println(num);
//        }
        int max = arr[0];
        int maxindex = 0;
//        int min = arr[0];
//        int max = Arrays.stream(arr).max().getAsInt();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxindex = i;
            }
        }

//        System.out.println("The maximum number is : " + max);
//        System.out.println("The index of the maximum number is : " + maxindex);
        int arr1[] = new int[5];
        for (int i = 0; i < 5; i++) {

            arr1[i] = max - arr[i];

        }
//        System.out.println("The new array is : ");
//        for (int num : arr1) {
//            System.out.println(num);
//        }


        int secondmin = Integer.MAX_VALUE;
        int secondminindex = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0 && arr1[i] < secondmin) {
                secondmin = arr1[i];
                secondminindex = i;
            }

        }
        System.out.println("The second maximum number is : " + arr[secondminindex]);

    }
}