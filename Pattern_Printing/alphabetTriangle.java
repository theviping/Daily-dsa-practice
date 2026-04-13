package Pattern_Printing;

import java.util.Scanner;

public class alphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }

        System.out.println("Lets see other one.");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i+64) + " ");
            }
            System.out.println();
        }

        // A BB CCC .....
        System.out.println("Lets see other one. for A BB CCC .....");
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char) (i+65) + " ");
            }
            System.out.println();
        }

        //this is for opposite triangle
        System.out.println("for ulta triangle method 01");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }

        System.out.println("For ulta triangle 'a' method 02 .");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char) (j+96) + " ");
            }
            System.out.println();
        }
    }
}
