package Methods;

public class returnType {
    public static int riya() {
        System.out.println("riya");
        System.out.println("priya");
        return 5;
    }
    static void main() {
        riya();
        System.out.println(riya());
        int x = riya();
        System.out.println(x+5);
        System.out.println(x);
    }
}
