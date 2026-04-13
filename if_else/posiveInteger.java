package if_else;

import java.util.Scanner;

public class posiveInteger {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();

        if(n%5==0 && n%3==0){
            System.out.println("Number is divisible by 3 and 5\n Apurva");
        }
        else if(n%3==0){
            System.out.println("Number is divisible by 3\n Riya");
        }
        else if(n%5==0){
            System.out.println("Number is divisible by 5\n Banu");
        }

        else{
            System.out.println("Number is not divisible by 3 or 5\n Isha");
        }
    }
}
