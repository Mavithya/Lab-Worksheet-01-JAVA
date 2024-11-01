public class Q1 {
    static int  j=0;
    public static void main(String[] args) {
        for (int i=10;i<50;i++){
            System.out.print(i +" ");
            j++;
           if (j==10) {
               System.out.println();
               j=0;
           }
        }
    }
}
