package Pattern_Printing;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int size = input.nextInt();
        int a=1;
        for (int i=1;i<=size;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
