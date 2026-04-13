package Methods;

public class passByValueAndReference {
    public static void change(int n){
        int x=10;
    }
    public static void main(String[] args) {
        int x =10;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
