package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PushAtBottom {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int ele = sc.nextInt();
        pushAtBottom(st, ele);
        print(st);
    }

    private static void print(Stack<Integer> st) {
        System.out.println("Stack Contents: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    private static void pushAtBottom(Stack<Integer> st, int ele) {
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, ele);
        st.push(top);
    }
}
