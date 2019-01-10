//PT -- missing javadoc. -2
public abstract class Building {
    protected String name;
    protected int address;
    protected static int lastAddress = 11111;

    public Building() {
        address = lastAddress;
        lastAddress++;
    }

    //PT -- these should just be abstract functions, and not empty functions
    // abstract void populate(Person p);
    // -2
    public void populate(Person p){

    }

    public String toString() {
        return String.format("Building name: %s, Building Address: %s", name, address);
    }

    public void showOccupants() {
        
    }



}
