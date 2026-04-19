import java.util.Scanner;
class nine_bitwiseoddeven {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be checked even or odd using bitwise operator");
        n=sc.nextInt();
                if ((n & 1) == 0) {
            System.out.println("Even number ");
        } else {
            System.out.println("odd number");
        }
    }
}


