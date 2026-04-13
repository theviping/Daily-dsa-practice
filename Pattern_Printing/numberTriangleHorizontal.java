package Pattern_Printing;

import java.util.Scanner;

public class numberTriangleHorizontal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of the triangle: ");
            int size = input.nextInt();
            for(int i=1;i<=size;i++){
                for (int j=1;j<=size+1-i;j++){
                    System.out.print(j + " ");
                }
                System.out.println();
        }
    }
}
