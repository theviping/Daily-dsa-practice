package OOPS;

public class Polymorphism {//ek nam multiple kaam or many forms
    public static class Dog{
        void speak(){
            System.out.println("Bhow Bhow");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Grrrrrrrr");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        Pikachu p = new Pikachu();
        Human h = new Human();
        d.speak();
        c.speak();
        l.speak();
        p.speak();
        h.speak();
    }
}
