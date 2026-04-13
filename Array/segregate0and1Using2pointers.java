package Array;

public class segregate0and1Using2pointers {
    public static void main(String[] args) {
        int []arr= {0, 0, 0, 1, 0};
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(arr[i]==0 && arr[j]==1){
                i++;
                j--;
            }else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;j--;
            }else if(arr[i]==0 && arr[j]==0){
                i++;
            }else if(arr[i]==1 && arr[j]==1){
                i--;
            }
        }
        for(int el : arr){
            System.out.println(el + " ");
        }
    }
}
