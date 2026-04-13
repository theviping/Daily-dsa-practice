package Loops;

import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int num=0;
        while(n!=0){
            num=num*10;
            num = num+n%10;
            n/=10;
        }
        System.out.println(num);
    }
}
