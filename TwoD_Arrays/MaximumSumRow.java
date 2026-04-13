package TwoD_Arrays;

public class MaximumSumRow {
    static void main(String[] args) {
        int[][]arr={{2,8,3,4,7},{7,20,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int maxSum=0;
        int row=-1;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                row=i;
            }
        }
        System.out.println("The maximum number is "+maxSum + " and at: "+row);

    }
}
