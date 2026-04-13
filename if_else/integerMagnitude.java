package if_else;

import java.util.Scanner;

public class integerMagnitude {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<0){
            n=-n;
        }
        if(n<69){
            System.out.println("Number is smaller than 69");
        }else {
            System.out.println("Number is larger than 69");
        }
    }
}
