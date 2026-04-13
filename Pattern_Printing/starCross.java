package Pattern_Printing;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of cross: ");
        int size = input.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(i==j || (i+j)==(size+1) ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
