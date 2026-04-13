package Basic_Sorting;

import java.util.Arrays;

public class twoSum {
    static void main(String[] args) {
        int[]arr={8, 4, 1, 9, -3, 6, 5};
        int n=arr.length;
        int i=0,j=n-1;
        int target=5;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.print("Element found: ");
                break;
            } else if (arr[i]+arr[j]>target) {
                j--;
            }else {
                i++;
            }
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
