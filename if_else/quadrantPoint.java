package if_else;

import java.util.Scanner;

public class quadrantPoint {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Point is at Origin");
        } else if (x>0 && y>0) {
            System.out.println("Point is in first Quadrant");
        } else if (x<0 && y>0) {
            System.out.println("Point is in second Quadrant");
        } else if (x<0 && y<0) {
            System.out.println("Point is in third Quadrant");
        } else if (x>0 && y<0) {
            System.out.println("Point is in fourth Quadrant");
        } else if (x>0 && y==0) {
            System.out.println("Point is on X axis");
        } else if (x==0 && y>0) {
            System.out.println("Point is on Y axis");
        }
    }
}
