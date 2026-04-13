package Array;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int []arr = {10, 12, 25, 13, 68, -98, -5};
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr.length);

        int [] vip= new int[7];
        for (int i=0; i<7; i++){
            System.out.print("Enter number "+(i+1)+" : ");
            vip[i]=sc.nextInt();
        }
        for(int i = 0; i < vip.length; i++){
            System.out.println(vip[i]*2);
        }
    }
}
