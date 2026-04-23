import  java.util.Scanner;
class twelve_ASCII {
    public static void main(String args[]) {
        char a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        a = sc.next().charAt(0);
        b = a;
        System.out.println("The ASCII value of a character is " + b);
    }
}