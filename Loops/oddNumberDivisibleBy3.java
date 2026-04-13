package Loops;

public class oddNumberDivisibleBy3 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i+=2){
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
