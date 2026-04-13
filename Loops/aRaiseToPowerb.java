package Loops;

import java.util.Scanner;

public class aRaiseToPowerb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a=sc.nextInt();
        System.out.print("Enter a second number: ");
        int b=sc.nextInt();
        int pow=0;
        int result=1;
        while(pow<b){
            result=result*a;
            pow++;
        }
        System.out.println("Power raise to is =: "+ result);
    }
}
