package if_else;

import java.util.Scanner;

public class integerOrNot {
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextDouble();
        int x =(int)n;
        if(n-x>0){
            System.out.println("Not an Integer");
        }else {
            System.out.println("Integer");
        }
    }
}
