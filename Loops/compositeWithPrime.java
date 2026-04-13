package Loops;

import java.util.Scanner;

public class compositeWithPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean flag = false; // false means prime and true means composite
        for (int i = 2; i <= Math.sqrt(n); i++) {//sqrt isliye use kiye hai taki faltu ka iteration na krna pde dubara
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Composite number");
        } else {
            System.out.println("Prime number");
        }
    }
}