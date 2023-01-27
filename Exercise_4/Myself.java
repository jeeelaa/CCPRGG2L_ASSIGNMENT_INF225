public class Myself {

    // attributes for App
    String name;
    int age;

    //constructor
    Myself (String myName, int myAge){
        this.age = myAge;
        this.name = myName;
    }

    void AddFriend(Person Friend) {
        System.out.println( "I am friends with " + Friend.name);
    }

}
