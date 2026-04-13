package Pattern_Printing;

import java.util.Scanner;

public class starTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of triangle: ");
        int size = input.nextInt();

        System.out.println("Method 01");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if((i+j)>size){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Method 02");
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
