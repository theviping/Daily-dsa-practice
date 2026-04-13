package if_else;

import java.util.Scanner;

public class sideOfTraingle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("this is correct side of triangle");
        }else {
            System.out.println("this is incorrect side of triangle");
        }
    }
}
