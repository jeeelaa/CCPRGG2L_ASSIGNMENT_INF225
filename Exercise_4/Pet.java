public class Pet {
    
    //attribute for Pet
    String name;
    Person owner;

    //constructor
    Pet (String petName, Person ownerName){
        this.name= petName;
        this.owner= ownerName;
    }

    //
    void showOwnerName () {
        System.out.println ("My name is "+ this.name + "  ^._.^" + " ,My owner name is " + owner.name);
    }

}
