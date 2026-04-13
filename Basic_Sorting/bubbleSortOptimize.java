package Basic_Sorting;

public class bubbleSortOptimize {
    public static void print(int[]arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {5, -2, 6, 7, 2, 0, 8};
        boolean flag=true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                flag= false;
                break;
            }
        }
        if(flag){
            print(arr);
            return;
        }
        for (int i = 0; i < arr.length-i-1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);
    }
}
