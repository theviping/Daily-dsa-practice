package if_else;

import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
        double cp, sp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        cp = sc.nextDouble();
        System.out.print("Enter the selling price: ");
        sp = sc.nextDouble();
        if(cp>sp){
            System.out.println("Loss of: "+ (cp-sp));
            System.out.println(((cp-sp)/cp)*100 +("%"));
        } else if (sp==cp) {
            System.out.println("Neither profit nor loss");
        } else {
            System.out.println("Profit of:"+ (sp-cp));
        }
    }
}
