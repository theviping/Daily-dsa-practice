package Basic_Sorting;

public class bubbleSortThodaAurOptimize {
    static void printArr(int[] arr) {
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String [] args){
        int []arr={5, -2, 6, 7, 2, 0, 8};
        int n=arr.length;
        printArr(arr);
        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        System.out.println();
        printArr(arr);
    }
}
