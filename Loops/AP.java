package Loops;

import java.util.Scanner;

public class AP {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms: ");
        int n = sc.nextInt();
        for (int i = 2; i<=3*n-1; i+=3) {//for difference of 3
            System.out.println(i +" ");
        }

        //or
        int first;
        System.out.println("Enter the first term: ");
        first = sc.nextInt();
        System.out.println("Enter the difference: ");
        int d=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(first);
            first=first+d;
        }
    }
}
