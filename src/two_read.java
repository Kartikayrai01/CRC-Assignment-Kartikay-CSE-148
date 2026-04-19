import java.util.Scanner;
class two_read {
    public static void main(String args[]) {
        int a;
        float b;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the interger value");
        a = sc.nextInt();
        System.out.println("enter the float value");
        b = sc.nextFloat();
        System.out.println("enter the char value");
        c = sc.next().charAt(0);
        System.out.println("the integer value is ="+a);
        System.out.println("the float value is="+b);
        System.out.println("the char vaule is="+c);
    }
}
