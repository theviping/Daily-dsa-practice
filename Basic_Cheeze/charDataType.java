package Basic_Cheeze;

public class charDataType {
    public static void main(String[] args) {
//        char a='A';
//        char b='B';
//        System.out.println(b);
//        char c='#';
//        System.out.println(c);
//        System.out.println(a+b);

        //Type casting- ek data type ko dusre data type me conversion krna;
        char ch;
        ch = 'A';
        int i=ch;//implicit type casting
        System.out.println(i);

        //explicitly
        char hi='a';
        int j=(int) hi;
        System.out.println(j);

        //OR
        char hey='c';
        System.out.println((int)hey);
        System.out.println(hey+0);//alternate hai upar ke line ka

        //integer to char
        int x=39;
        char hn=(char)x;
        System.out.println(hn);
    }
}
