package OOPS;

public class RevisionOOPS {
    private static class Pokemon{
        int hp;
        int speed;
        int attack;
        int defence;
        String type;
        String name;
        Pokemon(){
            //default
        }

    }
    static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name="Pikachu"; p1.type="Electric";
        p1.speed=10;
    }
}
