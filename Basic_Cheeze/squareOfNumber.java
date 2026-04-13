package Basic_Cheeze;

import java.util.Scanner;

public class squareOfNumber {
    public static void main(String[] args) {
        double side;
        System.out.print("Enter the value of side of the square: ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextDouble();
        double area=side*side;
        System.out.println("Area is:"+area);
    }
}
