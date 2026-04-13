package Pattern_Printing;

import java.util.Scanner;

public class diamond {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of diamond: ");
        int n=sc.nextInt();
        int nsp=n-1, nst=1;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp=nsp-1;
            nst=nst+2;
            System.out.println();
        }
        int sp=1, st=nst-4;// st= 2*n-3 sp=spaces st= stars
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            sp=sp+1;
            st=st-2;
            System.out.println();
        }
    }
}
