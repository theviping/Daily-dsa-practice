package if_else;

import java.util.Scanner;

public class oddEvenInTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();
        int i = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(i);
    }
}
