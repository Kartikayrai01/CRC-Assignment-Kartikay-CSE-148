import java.util.Scanner;
 class seventeen_calculator {
     public static void main(String args[]) {
         double a, b, c;
         char o;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the operator");
         o = sc.next().charAt(0);
         System.out.println("enter the first number");
         a = sc.nextDouble();
         System.out.println("enter the second number");
         b = sc.nextDouble();
         switch (o) {
             case '+':
                 c = a + b;
                 System.out.println("sum is =" + c);
                 break;
             case '-':
                 c = a - b;
                 System.out.println("difference is =" + c);
                 break;
             case '*':
                 c = a * b;
                 System.out.println("product is = " + c);
                 break;
             case '/':
                 c = a / b;
                 System.out.println("freaction is = " + c);
                 break;
             default:
                 System.out.println("Invalid operator");
         }
     }
 }







