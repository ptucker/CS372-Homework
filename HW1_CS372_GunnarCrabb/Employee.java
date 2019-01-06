
public class Employee {

    private int ID;
    private String hireDate;
    private String currentPosition;
    private String boss;


    public Employee(int id, String date, String position, String employer) {
        ID = id;
        hireDate = date;
        currentPosition = position;
        boss = employer;
    }

    public int getID() {
        return ID;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public String getBoss() {
        return boss;
    }

    public void changePosition(String newPosition) {
        currentPosition = newPosition;
    }

    public void changeInManagement(String newBoss) {
        boss = newBoss;
    }
    
    //PT -- consider overriding toString()

    //ID and hire date cannot be changed once created since those are concrete once the employee is hired.


    public static void main(String [] args) {
        Employee E1 = new Employee(0001, "09/24/2016", "IT department", "James Finch");

        System.out.println("ID: " + E1.getID() + ", Hire date: " + E1.getHireDate() + ", current position: " + E1.getCurrentPosition() + ", Boss: " + E1.getBoss());
    }
}
