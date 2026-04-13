package Pattern_Printing;

import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=1; i<=2*n-1; i++){// uper wale line ke liye
            System.out.print("* ");
        }
        System.out.println();
        int nsp=1;
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){//phle wale triangle
                System.out.print("* ");
            }
            for(int j=1; j<=nsp; j++){//bich wala spaces
                System.out.print("  ");
            }
            nsp=nsp+2;
            for(int j=n-i; j>0; j--){//last wale triangle
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
