package Array;

public class reverseArray {
    public static void main(String[] args) {
        int []arr = {12, 123, -25, 69, 65, -52};
        int []brr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i]=arr[(arr.length)-i-1];
        }

        //OR
        int i=0, j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        //OR
        for (int k = 0; k < arr.length/2; k++) {
            int local=arr[i];
            arr[i]=arr[j];
            arr[j]=local;
        }

        //To print the array
        for(int ele : brr){
            System.out.print(ele + " ");
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
