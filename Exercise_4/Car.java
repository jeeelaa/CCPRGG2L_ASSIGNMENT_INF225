    public class Car {

    //attribute
    String name;
    Myself keeper;

    //constructor 
    Car (String carName, Myself keeperName){
        this.keeper = keeperName;
        this.name = carName;
    }


    void showKeeperName () {
        System.out.println ("Hi! My name is " + keeper.name + " : My dream car is a "  + this.name);

    }

}
