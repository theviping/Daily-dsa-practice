package if_else;

import java.util.Scanner;

public class divisibleBy5OrNot {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if(n%5==0){
            System.out.println("The number is divisible by 5");
        }else {
            System.out.println("The number is not divisible by 5");
        }
    }
}
