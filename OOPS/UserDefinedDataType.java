package OOPS;

public class UserDefinedDataType {
    public  static class Student{//khudka ek data type
        String name;
        int roll;
        double CGPA;
    }
    //object are actual things and classes are blueprints
    public static void main(String[] args) {
        Student s1 = new Student();//declaration
        s1.name="Vipin";
        s1.roll=10;
        s1.CGPA=9.36;
        Student s2 = new Student();
        s2.name="Khushi";
        s2.roll=11;
        s2.CGPA=8.36;
        Student s3 = new Student();
        s3.name="Anagha";
        s3.roll=12;
        s3.CGPA=9.26;
        System.out.println(s1.name+" "+s1.roll+" "+s1.CGPA);
    }
}
