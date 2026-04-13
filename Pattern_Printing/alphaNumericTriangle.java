package Pattern_Printing;

import java.util.Scanner;

public class alphaNumericTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2!=0){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print((char) (j+64) + " ");
                }
            }
            System.out.println();
        }
    }
}
