package Pattern_Printing;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of a triangle: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int a=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a=a+2;
            }
            System.out.println();
        }
    }
}
