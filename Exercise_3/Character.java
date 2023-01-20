public class Character {

    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    public void sayMyAgility() {
        System.out.println("Agility:" + agility);
    }
    public void sayMyStrength() {
        System.out.println("Strength:" + strength);
    }
    public void sayMyIntelligence() {
        System.out.println("Intelligence: " +intelligence);
    }
    public void attack() {
        System.out.println("I Am Attacking!!");
    }


    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }
}
