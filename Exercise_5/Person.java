public class Person {
    private String name;
    private int ccnumber;

    // get() method
    public String getName() {

        return this.name;
    }

    public int getCCnumber() {

        return this.ccnumber;
    }

    // set() method
    public void setName(String newName) {

        this.name = newName;
    }

    public void setCCnumber(int newCCnumber){
        this.ccnumber = newCCnumber;
    }
}
