public class App {
        public static void main(String[] args) throws Exception {
    
            Person Me = new Person();
    
    
            Me.setName("Jela");
    
            String myName = Me.getName();
    
            System.out.println("My name is " + myName);
    
            Me.setCCnumber(09172002);
    
            int myCCnumber = Me.getCCnumber();
    
            System.out.println("CC number is " + myCCnumber);
       
            //=====================================================
    
            Daughter me = new Daughter();
    
            System.out.println("Family name is " + me.surname);
            me.showLove();
        }
    }
    }
}
