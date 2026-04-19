import java.util.Scanner;
class four_swap
{
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vaue of a ");
        a = sc.nextInt();
        System.out.println("enter the value of b");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a=a-b;
        System.out.println("the value of a is " + a);
        System.out.println("the value of b is" + b);
    }
}
