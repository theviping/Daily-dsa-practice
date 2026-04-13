package Strings_go;

public class ReverseStringBuilder {
    static void main(String[] args) {
        String s = "Devesh";
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.delete(0, 2);//0to 1 tk
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //OR other Method ...
        int i=0, j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
