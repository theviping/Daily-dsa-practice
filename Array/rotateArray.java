package Array;

import java.util.Scanner;

public class rotateArray {
    static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();
        int n=arr.length;
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);
        for(int el : arr){
            System.out.print(el+" ");
        }
    }

    static void rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
