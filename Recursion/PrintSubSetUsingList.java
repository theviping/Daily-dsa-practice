package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSetUsingList {
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<String>();
        subSet("",str, 0, list);
        System.out.println(list);
    }
    private static void subSet(String ans, String str, int idx,  List<String> list) {
        if(idx == str.length()){
            if(ans.length()!=0){
                list.add(ans);
            }
            return;
        }
        char ch = str.charAt(idx);
        subSet(ans + ch,str,idx+1, list);//pick
        subSet(ans,str,idx+1, list);//skip
    }
}
