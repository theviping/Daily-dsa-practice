package Methods;
import java.util.Scanner;
public class permutationAndCombination {
    public static int fact(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value n & r: ");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nCr= fact(n)/(fact(r)*fact(n-r));
        System.out.println(nCr);
    }
}
