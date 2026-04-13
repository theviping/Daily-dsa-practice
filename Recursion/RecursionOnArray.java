package Recursion;

public class RecursionOnArray {
    static void main(String[] args) {
        int[]arr={7,3,17,12,76,9,34,5};
        recPrint(arr, 0);
        int ele=76;
        System.out.println(exist(arr, ele, 0));
    }
    public static boolean exist(int[]arr,int ele, int idx){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==ele){
            return true;
        }
        return exist(arr, ele,idx+1);
    }
    public static void recPrint(int[]arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        recPrint(arr,index+1);
    }
}
