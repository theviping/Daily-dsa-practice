package if_else;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if(n>=0){
            System.out.println(n);
        }else {
            System.out.println(-n);
        }
    }
}
