package Array;

public class arrayBasics {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        //indexing
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        //updating element--matable hota hai
        arr[2]=56;
        System.out.println(arr[2]);
        int[] arr2= new int[5];
        arr2[0]=56;
        arr2[1]=69;
        arr2[2]=96;
        System.out.println(arr2[2]);
    }
}
