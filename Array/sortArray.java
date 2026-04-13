package Array;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[]arr = {10, 20, 5, -65, 25};
        Arrays.sort(arr);//inbuilt function
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
