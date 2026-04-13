package Pattern_Printing;

import java.util.Scanner;

public class alphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of triangle: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print((char) (j+64) + " ");//A AB ABC .....
            }
            System.out.println();
        }

        System.out.println(" For A BB CCC DDDD ......");
        for (int x = 1; x <= n; x++){
            for (int j = 1; j <= n-x; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= x; j++){
                System.out.print((char) (x+64) + " ");//A BB CCC .....
            }
            System.out.println();
        }
    }
}
