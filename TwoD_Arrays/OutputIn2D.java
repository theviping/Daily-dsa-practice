package TwoD_Arrays;

public class OutputIn2D {
    static void main(String[] args) {
        int[][] arr =new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][]ar1={{2,5,8,7,9}, {14,2,5,3,9}};
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                System.out.print(ar1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
