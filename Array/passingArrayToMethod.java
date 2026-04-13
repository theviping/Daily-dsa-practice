package Array;

public class passingArrayToMethod {
    static void main(String[] args) {
     int []x={10, 12, 25, 14};
        System.out.println(x[1]);
        change(x);
        System.out.println(x[1]);
    }
    public static void change(int[] x){
        x[1]=99;
    }
}
