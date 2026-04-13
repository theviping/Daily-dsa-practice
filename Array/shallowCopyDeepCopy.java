package Array;

import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
        int[]arr={10, 20, 30, 40, 50};
        int [] x =arr;//x and arr ka jo location hai same hai to kuch bhi update krenge kisi me to dono me reflect krega
        x[0]=11;
        System.out.println(arr[0]);

        System.out.println("Deep Copies");
        int[]deep = Arrays.copyOf(arr,arr.length);
        deep[0]=100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
}
