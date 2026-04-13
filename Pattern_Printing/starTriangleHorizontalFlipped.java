package Pattern_Printing;

import java.util.Scanner;

public class starTriangleHorizontalFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int n = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Other method 01 for this.");//standard yhi mante hai
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){// i=1 : j=4, i=2: j=3, i=3: j=2, i=4:j=1
                System.out.print("* ");//i+j==n+1
                //j=n+1-i
            }
            System.out.println();
        }

        System.out.println("Other method 02 for this.");
        int a=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
    }
}
