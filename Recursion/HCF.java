package Recursion;

import java.util.Scanner;

public class HCF {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        int c=Math.min(a,b);
        int max=-1;
        for (int i = 2; i <=c; i++) {
            if(a%i==0&&b%i==0){
                max=i;
            }
        }
        System.out.println(max);
    }
}
