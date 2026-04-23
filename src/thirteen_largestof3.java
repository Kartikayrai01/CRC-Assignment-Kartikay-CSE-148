import java.util.Scanner;
class thirteen_largestof3 {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 (a,b and c) numbers to find the greatest ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a==b && b==c)  {
            System.out.println("all are equal");
        } else if (b >= c && b >= a) {
            System.out.println("b is the greatest ");
        } else if (a >=b && a >= c) {
            System.out.println("a is the greatest ");
        }
        else {
            System.out.println("c is the greatest");
        }
        }
    }

