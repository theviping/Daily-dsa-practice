package Recursion;

public class Hanoi {
    static void main(String[] args) {
        hanoi(4, 'A','B', 'C');
    }

    private static void hanoi(int i, char a, char b, char c) {
        if(i==0)return;
        hanoi(i-1, a, c, b);
        System.out.println(a + "-->" + c);
        hanoi(i-1, c, a, b);
    }
}
