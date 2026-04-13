package Array;

import java.util.Scanner;

public class twoSum {
    static void main(String[] args) {
        int []arr = {12, 123, -25, 69, 65, -52};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        boolean find = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Target number is found at " + arr[i] + " and " + arr[j]);
                    find = true;
                }
            }
        }
        if(!find){
            System.out.println("Target number not found");
        }
    }
}
