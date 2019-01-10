enum Type {
    Person, Kid, Police, Teacher;
}


public class Person {
    protected String Name;
    protected int Age;
    protected int PhoneNumber;
    protected static int lastNumber = 1111111;
    protected Type type;

    public Person() {
        Name = "No name";
        Age = 0;
        PhoneNumber = lastNumber;
        lastNumber++;
        type = Type.Person;
    }

    public Person(String name, int age) {
        Name = name;
        Age = age;
        PhoneNumber = lastNumber;
        lastNumber++;
    }

    public String toString() {
        return String.format("Name: " + Name + "  Age: " + Age + "  Phone Number: " + PhoneNumber);
    }

    public String getName() {
        return Name;
    }

    public Type getType() {
        return type;
    }
}