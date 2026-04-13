package Strings_go;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        int n=sc.nextInt();
        String s="";//empty string
        s+=n;
        System.out.print(s);
        //OR
        String s1 = Integer.toString(n);
        System.out.println(s1);
    }
}
