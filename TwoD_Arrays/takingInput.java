package TwoD_Arrays;

import java.util.Scanner;

public class takingInput {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n=sc.nextInt();
        System.out.println("Enter the length of subarrays: ");
        int m=sc.nextInt();
        int[][]arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
