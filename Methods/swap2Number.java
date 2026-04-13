package Methods;

import java.util.Scanner;

public class swap2Number {
    public static void swap(int []arr){
        int temp= arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a: " + a + " and b: " + b);

        System.out.println("OR");

        int []arr={a, b};
        swap(arr);
        System.out.println("After using reference method a: " + a + " and b: " + b);
    }
}
