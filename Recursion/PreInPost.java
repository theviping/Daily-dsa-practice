package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(1);
    }

    private static void pip(int i) {
        if(i==0){
            return;
        }
        System.out.print(i + " ");//pre
        pip(i-1);
        System.out.println(i + " ");//in
        pip(i-1);
        System.out.print(i + " ");//post
    }
}
