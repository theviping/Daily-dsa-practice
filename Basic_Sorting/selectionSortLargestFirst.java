package Basic_Sorting;

public class selectionSortLargestFirst {
    static void main(String[] args) {
        int[]arr={8, 4, 1, 9, -3, 6, 5};
        int n=arr.length;
        for (int i = n-1; i >=0 ; i--) {
            int max=Integer.MIN_VALUE;
            int maxIdx=-1;
            for (int j = i; j >=0; j--) {
                if(arr[j]>max){
                    max=arr[j];
                    maxIdx=j;
                }
            }
            int temp=arr[maxIdx];
            arr[maxIdx]=arr[i];
            arr[i]=temp;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}
