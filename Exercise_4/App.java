       
    public class App {
    public static void main(String[] args) throws Exception {
        
        //object
        Person Friend = new Person ("Lisa" , 25);

        Myself Me = new Myself ( "Jela", 20);

        Pet Cat = new Pet ("Coco", Friend);

        Car Nissan = new Car ("GT-R", Me);


        Me.AddFriend(Friend);
        Cat.showOwnerName();
        Nissan.showKeeperName();


    
    }
}
