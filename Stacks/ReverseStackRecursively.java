package Stacks;

import java.util.Stack;

public class ReverseStackRecursively {

    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        reverseStack(st);
    }
    public static void reverseStack(Stack<Integer> st) {
        if (st.empty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    private static void insertAtBottom(Stack<Integer> st, int top) {
        while (!st.empty()) {
            st.push(top);
            return;
        }
        int temp=st.pop();
        st.push(temp);
        insertAtBottom(st, top);
        st.push(temp);
    }
}
