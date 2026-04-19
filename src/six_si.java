import java.util.Scanner;
 class six_si {
     public static void main(String args[]) {
         double p, r, t, si, ci;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the principle amount ");
         p = sc.nextDouble();
         System.out.println("enter the rate");
         r = sc.nextDouble();
         System.out.println("enter the time ");
         t = sc.nextDouble();
         si = (p * r * t) / 100;
         ci = (p * Math.pow((1 + r / 100), t)) - p;
         System.out.println("the simple intrest is =" + si);
         System.out.println("the compound intrest is =" + ci);
     }

 }

