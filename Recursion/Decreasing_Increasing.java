package Recursion;

import java.util.Scanner;

public class Decreasing_Increasing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print(n);//5 4 3 2 1 1 2 3 4 5
        ulta(n);//5 4 3 2 1 2 3 4 5
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
    public static void ulta(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        ulta(n-1);
        System.out.println(n);
    }
}
