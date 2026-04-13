package Recursion;

import java.util.Scanner;

public class Linear_power {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        return a*pow(a, b-1);
    }
}
