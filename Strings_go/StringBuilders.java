package Strings_go;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Vipin ");//capacity 16
        System.out.println(s.capacity());
        s.append("Gupta");
        System.out.println(s);
        System.out.println(s.capacity());

    }
}
