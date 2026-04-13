package OOPS;

public class PassingClassToMethod {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+ name+" "+length+" "+type+" "+torque+" ");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.seats=10;
        c.name="Kia Sonet";
        c.length=3.99;
        c.type="XUV";
        c.torque=180;
        c.print();
    }
}
