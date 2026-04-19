import java.util.Scanner;
 class three_swap
{
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = sc.nextInt();
        System.out.println("enter the value of b");
        b = sc.nextInt();
        c = a;
        a = b;
        b=c;
        System.out.println("value of a =" + a);
        System.out.println("value of b=" + b);
    }
}
