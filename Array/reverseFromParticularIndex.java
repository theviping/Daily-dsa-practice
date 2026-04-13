package Array;

import java.util.Scanner;

public class reverseFromParticularIndex {
    static void main(String[] args) {
        int []arr = {12, 123, -25, 69, 65, -52};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting index: ");
        int i = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int j = sc.nextInt();
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
