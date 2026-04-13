package Basic_Sorting;

public class moveAllZeroToEnd {
    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void main(String[] args) {
        int[]arr={1, 0, -2, 3, 0, 4, 8, 6, 12, 10};
        int n=arr.length;
        print(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        print(arr);
    }
}
