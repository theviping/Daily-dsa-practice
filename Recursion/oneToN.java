package Recursion;

import java.util.Scanner;

public class oneToN {
    static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(1,n);
    }
    static void print(int x,int n){
        if(x>n){
            return;
        }
        System.out.println(x);
        print(x+1,n);
    }
}
