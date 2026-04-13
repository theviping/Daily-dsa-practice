package Array;

public class SecondMaximumElement {
    static void main(String[] args) {
        int []arr = {12, 123, -25, 69, 65, -52};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        int smax=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]==max){
                continue;
            } else if (arr[i]>smax) {
                smax=arr[i];
            }
        }
        System.out.println(" Second largest is: " + smax);
    }
}
