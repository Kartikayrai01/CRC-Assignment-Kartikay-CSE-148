import java.util.Scanner;
class eleven_time {
    public static void main(String args[]) {
        System.out.println("enter the number of days");
        Scanner sc = new Scanner(System.in);
        int n,y,w,m;
        int d=0;
        n = sc.nextInt();
        y = n / 365;
        d=n%365;
        w=d/7;
        d=d%7;
        System.out.println("number of years= " +y+ " and reamining "+w+" weeks and " +d+ " days remaining ");

    }
}


