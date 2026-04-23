import java.util.Scanner;
class sixteen_quadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        double a, b, c, r1, r2;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        r1 = (-b-Math.sqrt((b * b - 4 * a * c)) )/ (2 * a);
        r2 = (-b+Math.sqrt((b * b - 4 * a * c))) / (2 * a);
        System.out.println("root 1 is " + r1);
        System.out.println("root 2 is " + r2);
    }
}

