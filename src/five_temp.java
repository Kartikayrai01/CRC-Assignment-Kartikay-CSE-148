import java.util.Scanner;
class five_temp {
    public static void main(String args[]) {
        double a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice of conversion 1 for celcius and 0 for farenheight");
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("enter the temprature in celcius to be coverted to farenheight");
            b = sc.nextDouble();
            c = (b * 9 / 5) + 32;
            System.out.println("the coversion from celcius to farenheight is= " + c);
        } else {
            System.out.println("enter the temperature in farenheight to be converted into celcius");
            d = sc.nextDouble();
            e = (d - 32) * 5 / 9;
            System.out.println("The conversion from farenheight to celcius is=" + e);
        }
    }
}