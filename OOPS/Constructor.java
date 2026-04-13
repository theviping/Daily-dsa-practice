package OOPS;

public class Constructor {
    public static class car{
        int seat;
        String name;
        double length;
        car(){//default constructor

        }
        car(int s, String n, double l){//constructor banaye hai
            seat = s;//yha pr do constructor hai ek argument hai ek me nhi hai to ise bolte hai constructor overloading.
            name = n;
            length = l;
        }

        public void print() {
            System.out.println(name+" "+ seat+" "+length);
        }
    }
    static void main(String[] args) {
        car c1=new car(5, "Kia Sonet", 5.99);
        c1.print();
        car c2=new car();
        c2.name="Alto";

    }
}
