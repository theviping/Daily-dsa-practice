package Methods;

import java.util.Scanner;

public class arguments {
    public static void sum(int a, int b) {
        System.out.println("Sum is: " + (a+b));
    }

    public static void max(int a, int b, int c) {
        if (a>=b && a>=c) {
            System.out.println("Max is: " + a);
        }else if (b>=a && b>=c) {
            System.out.println("Max is: " + b);
        }else {
            System.out.println("Max is: " + c);
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        sum(a, b);
        max(a, b, c);
    }
}
