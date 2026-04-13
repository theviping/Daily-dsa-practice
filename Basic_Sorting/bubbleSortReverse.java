package Basic_Sorting;

public class bubbleSortReverse {
    static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []arr={5, -2, 6, 7, 2, 0, 8};
        int n=arr.length;
        print(arr);
        for (int i = 1; i < n; i++) {
            for(int j=n-1;j>0; j--){
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        print(arr);
    }
}
