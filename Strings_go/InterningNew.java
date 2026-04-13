package Strings_go;

public class InterningNew {
    public static void main(String[] args) {
        String str = "vipin";
        str+="G";
        System.out.println(str);
        //new keyword se new string alag bnta hai..
        String s="Vipin";
        s="B"+s.substring(1);
        System.out.println(s);//strings are immutable because of security purpose
        //s1.equals(s2)
        String s1=new String("Vivin");
        String s2=new String("Vipin");
        if(s1.equals(s2)){
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}
