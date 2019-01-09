
public abstract class Building {
    protected String name;
    protected int address;
    protected static int lastAddress = 11111;

    public Building() {
        address = lastAddress;
        lastAddress++;
    }

    public String toString() {
        return String.format("Building name: %s, Building Address: %s", name, address);
    }


}