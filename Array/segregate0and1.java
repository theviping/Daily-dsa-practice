package Array;

public class segregate0and1 {
    static void main(String[] args) {
        int []arr= {0, 0, 1, 0, 1, 0};
        int zeroS=0;
        int oneS=0;
        for(int el : arr){
            if(el==0){
                zeroS++;
            }else {
                oneS++;
            }
        }
        int n=zeroS+oneS;
        for(int i=0; i<zeroS; i++){
            arr[i]=0;
        }
        for(int i= zeroS; i<n; i++){
            arr[i]=1;
        }
        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}
