package Strings_go;

import java.util.Scanner;

public class countDigits {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        String s=""+n;
        System.out.println(s.length());
    }
}
