package Loops;

import java.util.Scanner;

public class positiveSeries {
    public static void main(String[] args) {
        int last, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last term: ");
        last = sc.nextInt();
        System.out.println("Enter common difference: ");
        d = sc.nextInt();
        int i=0;
        while(last>0){
            System.out.println(last);
            last=last-d;
            i++;
        }
        System.out.println("The total number: "+ i);
    }
}
