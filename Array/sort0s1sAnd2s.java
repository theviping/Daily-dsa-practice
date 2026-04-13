package Array;

public class sort0s1sAnd2s {
    static void main(String[] args) {
        int[]a={0,0,1,2,0,1,1,2};
        int one=0, two=0, zero=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zero++;
            }else if(a[i]==1){
                one++;
            }else {
                two++;
            }
        }
        for(int i=0; i<zero; i++){
            a[i]=0;
        }
        for (int i=zero; i<zero+one; i++){
            a[i]=1;
        }
        for (int i=zero+one; i<a.length; i++){
            a[i]=2;
        }
        for(int hi:a){
            System.out.print(hi+" ");
        }
    }
}
