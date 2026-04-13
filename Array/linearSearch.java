package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int []arr = {12, 123, -25, 69, 65, -52};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to search: ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element found at " + i + " index.");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found.");
        }
    }
}
