package Loops;

import java.util.Scanner;

public class tableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=n; i<=n*10; i=i+n){
            System.out.println(i);
        }
        System.out.println("OR");
        for (int i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
}
