package Basic_Cheeze;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        //Area = pi*r*r
//        int r=5;
//        System.out.println(3.1415*r*r);//decimal * int= decimal
        //OR
        Scanner sc=new Scanner(System.in);//input lene ke liye
        System.out.print("Enter radius: ");
        double rad=sc.nextDouble();
        double area=3.141592*rad*rad;
        System.out.println("area is:"+area);
    }
}
