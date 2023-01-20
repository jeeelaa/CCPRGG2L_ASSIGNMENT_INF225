public class App {
    public static void main (String[] args ) {

        Character Mage = new Character(0, 0, 0, null);

        Mage.strength= 70;
        Mage.intelligence= 80;
        Mage.agility= 50;
        Mage.name= "Lisa";
        Mage.sayMyName();
        Mage.sayMyStrength();
        Mage.sayMyAgility();
        Mage.sayMyIntelligence();
        Mage.attack();


        Weapon Sword = new Weapon();
        
        Sword.name= "Katana";
        Sword.damage= 99;
        Sword.rarity= "Legendary";
        Sword.AddDamage(100);

        System.out.print(Sword.showNameandRarity());
    
    }
}

