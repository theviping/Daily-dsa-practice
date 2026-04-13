package Array;

public class minimumElement {
    public static void main(String[] args) {
        int []arr={10, 12, -12, 25, 0 , -1, 1, 10};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
