package Loops;

import java.util.Scanner;

public class countDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n==0){
            n=1;// koi bhi digit likh skte hai 1 digit ka
        }
        int count = 0;
        while(n!=0){// n>0 bs positive number ke liye hai
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
