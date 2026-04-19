import java.util.Scanner;
 class seven_circle {
     public static void main(String args[]) {
         double r, a, c;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the radius ");
         r = sc.nextDouble();
         a = 3.14 * r * r;
         c = 2 * 3.14 * r ;
         System.out.println("the area is " + a);
         System.out.println("the circumference is " + c);
     }
 }