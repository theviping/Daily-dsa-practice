package Loops;

import java.util.Scanner;

public class compositeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 2; i <= num-1; i++) {
            if(num%i==0){
                System.out.println("This ths composite number");
                break;
            }
        }
    }
}
