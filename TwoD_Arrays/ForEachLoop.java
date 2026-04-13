package TwoD_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][]arr={{6,0,2,7,6},{1,3,7,20,2},{9,8,4,5,2}};
        for (int i = 0; i < arr.length; i++) {
            for(int ele : arr[i]) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.print("Other methods...");
        for(int[]ele : arr){
            System.out.println();
            for(int ele2 : ele){
                System.out.print(ele2+" ");
            }
        }
    }
}
