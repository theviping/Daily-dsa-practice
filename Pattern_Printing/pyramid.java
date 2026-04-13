package Pattern_Printing;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pyramid : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Method 02.");

        int nsp=n-1, nst=1;
        for (int i=1; i<=n; i++) {
            for(int j = 1; j <=nsp; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <=nst; k++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

    }
}
