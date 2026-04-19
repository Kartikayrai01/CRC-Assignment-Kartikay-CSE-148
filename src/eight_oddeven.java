import java.util.Scanner;
 class eight_oddeven {
     public static void main(String args[]) {
         int n;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number to be checked even or odd");
         n = sc.nextInt();
         if (n % 2 == 0) {
             System.out.println("even");
         } else {
             System.out.println("odd");
         }
     }
 }

