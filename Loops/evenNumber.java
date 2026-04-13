package Loops;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i=i+2){
            System.out.println(i);
        }
    }
}
