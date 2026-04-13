package Array;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {12, 15, 9, -25, 10};
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("MAXIMUM UPDATED");
            }
        }
        System.out.println(max);
    }
}
