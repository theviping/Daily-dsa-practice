package if_else;

import java.util.Scanner;

public class fourDigitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if(n>999 && n<10000){
            System.out.println("4 digit number");
        }else {
            System.out.println("Not a 4 digit number");
        }
    }
}
