package Pattern_Printing;

import java.util.Scanner;

public class hollowRectangle {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = input.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int w = input.nextInt();
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= w; j++) {
                if(i==1 || j==1 || i==l || j==w){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
