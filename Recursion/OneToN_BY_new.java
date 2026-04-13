package Recursion;

import java.util.Scanner;

public class OneToN_BY_new {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0){//base case
            return;
        }
        print(n-1);//call
        System.out.println(n);//work
    }
}
