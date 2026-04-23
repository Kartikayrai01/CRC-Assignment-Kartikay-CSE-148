import java.util.Scanner;
 class fifteen_vowel {
  public static void main(String args[]) {
   char c;
   Scanner SC = new Scanner(System.in);
   System.out.println("Enter the character to check vowel or consonant");
   c = SC.next().charAt(0);
   if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
    System.out.println("vowel");
   } else {
    System.out.println("Consonant");
   }
  }
 }

