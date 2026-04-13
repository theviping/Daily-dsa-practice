package Loops;

import java.util.Scanner;

public class sequence {
    public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        int i=1;
        int j=n;
        for (int count=0;count<=n;count++){
            if(count%2!=0){
                System.out.println(i +" ");
                i++;
            }else {
                System.out.println(j +" ");
                j--;
            }
        }
    }
}
