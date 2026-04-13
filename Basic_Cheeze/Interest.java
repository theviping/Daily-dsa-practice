package Basic_Cheeze;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
        double p, r, t;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of P:");
        p = sc.nextDouble();
        System.out.print("Enter Value of r:");
        r = sc.nextDouble();
        System.out.print("Enter Value of t:");
        t = sc.nextDouble();
        double interest=(p*r*t)/100;
        System.out.println("The interest is:"+interest);
    }
}
