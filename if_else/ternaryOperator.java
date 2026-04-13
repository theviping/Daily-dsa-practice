package if_else;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        //ternary operator
        // condition? sach : jhoot
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        a=sc.nextInt();
        System.out.println((a%2==0)? "Even" : "Odd");
    }
}

