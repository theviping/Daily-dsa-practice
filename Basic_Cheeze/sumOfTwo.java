package Basic_Cheeze;

import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is:"+sum);
    }
}
