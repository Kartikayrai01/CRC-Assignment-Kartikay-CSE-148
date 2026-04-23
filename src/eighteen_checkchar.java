import java.util.Scanner;
 class eighteen_checkchar {
     public static void main(String args[]) {
         char a;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the character to test");
         a = sc.next().charAt(0);
         if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
             System.out.println("It is an Alphabet");
         } else if (a >= '0' && a <= '9') {
             System.out.println("It is a digit");
         } else {
             System.out.println("It is a special character");
         }
     }
 }
