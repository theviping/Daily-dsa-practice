package if_else;

import java.util.Scanner;

public class oddOrEven {
    public  static void main(String[] args) {
        int n;
        System.out.print("Enter number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
