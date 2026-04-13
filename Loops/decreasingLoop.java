package Loops;

import java.util.Scanner;

public class decreasingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i= num; i>=1; i--){
            System.out.println(i);
        }
    }
}
