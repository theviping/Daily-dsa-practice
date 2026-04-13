package Array;

public class missingInArray {
    static void main(String[] args) {
        int []arr={1, 2, 4, 5, 6};
        int n=arr.length+1;
        int sum;
        sum = (n*(n+1))/2;
        int arrSum = 0;
        for (int j : arr) {
            arrSum = arrSum + j;
        }
        int result;
        result=sum-arrSum;
        System.out.println(result);
    }
}
