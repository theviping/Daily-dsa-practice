package Recursion;

public class PrintSubSet {
    public static void main(String[] args) {
        String str = "abc";
        subSet("",str, 0);
    }
    private static void subSet(String ans, String str, int idx){
        if(idx == str.length()){
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(idx);
        subSet(ans + ch,str,idx+1);//pick
        subSet(ans,str,idx+1);//skip
    }
}
