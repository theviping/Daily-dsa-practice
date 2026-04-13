package OOPS;

public class PrivateKeyWord {
    public static class Students{
        String name;
        private int roll=84;
        double CGPA;
        void print(){
            System.out.println(name+" "+roll+" "+CGPA);
        }
        int getRoll(){//Getter
            return roll;
        }
        void setRoll(int roll){//setter
            this.roll = roll;
        }
    }
    public static void main(String[] args) {
        Students s1=new Students();
         s1.CGPA=9.8;
         s1.name="Alex";
         s1.roll=4;
        s1.getRoll();
        s1.print();
        s1.setRoll(25);
        s1.print();
    }
}
