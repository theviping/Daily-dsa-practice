package Loops;

import java.util.Scanner;

public class continueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
            if(i==5){// jaise hi 5 aayega niche ka line skip ho jayega
                continue;
            }
            System.out.println("Good Morning");
        }
    }
}
