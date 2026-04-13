package Array;

public class productOfElements {
    public static void main(String[] args) {
        int[]arr={12, 25, 15, 24};
        int multi=1;
        for (int i = 0; i < arr.length; i++) {
            multi *= arr[i];
        }
        System.out.println(multi);
    }
}
