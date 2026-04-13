package if_else;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        int x= (a>=0)? 100:0;
        System.out.println(x);
    }
}
