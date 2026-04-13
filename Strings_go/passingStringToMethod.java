package Strings_go;

public class passingStringToMethod {
    static void main(String[] args) {
        String x="Vipin";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    public static void change(String x){
        x="Vishal";
    }
}
