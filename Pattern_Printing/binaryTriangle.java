package Pattern_Printing;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of triangle: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if(i==j || (i+j)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
