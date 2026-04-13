package Basic_Sorting;

public class SelectionSort {
    static void main(String[] args) {
        int []arr={8, 4, 1, 9, -3, 6, 5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int minIdx=-1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
        for(int ele : arr){
            System.out.print(" "+ele);
        }
    }
}
