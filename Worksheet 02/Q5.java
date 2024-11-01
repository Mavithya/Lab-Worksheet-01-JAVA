import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public  static boolean isPalindrome(String sentence){
        int i = 0;
        int j = sentence.length() - 1;
        while (i < j) {
            if (sentence.charAt(i) != sentence.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence to check if it's a palindrome:");
        String sentence = in.nextLine();


        String cleanSentence = "";
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:'");

        while (tokenizer.hasMoreTokens()) {
            cleanSentence += tokenizer.nextToken().toLowerCase();
        }
//        System.out.println(cleanSentence);
        if (isPalindrome(cleanSentence)) {
            System.out.println("The sentence is a palindrome");
        } else {
            System.out.println("The sentence is not a palindrome");
        }

            }

}
