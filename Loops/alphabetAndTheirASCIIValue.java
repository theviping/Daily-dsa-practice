package Loops;

public class alphabetAndTheirASCIIValue {
    public  static void main(String[] args) {
        char ch;
        for (ch='a';ch<='z';ch++) {
            int a=(int)ch;
            System.out.println(a + " "+ ch);
        }
    }
}
