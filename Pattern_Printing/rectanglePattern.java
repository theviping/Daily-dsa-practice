package Pattern_Printing;

import java.util.Scanner;

public class rectanglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");// upar se niche wala
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns: ");// left to right wala
        int cols=sc.nextInt();
        for(int i=1;i<=rows;i++){// kitni line
            for(int j=1;j<=cols;j++){// hr line me kitna star
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
