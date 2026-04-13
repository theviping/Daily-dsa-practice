package Array;

public class negativeElement {
    public static void main(String[] args) {
        int [] arr= {10, -25, 20, -30, -63, 48, 89, -85};
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Run Successfully");
    }
}
