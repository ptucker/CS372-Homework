import java.util.List;
public class School extends Building{
    private List<Person> Occupants;

    public School() {
        name = "School";
    }

    public void addStaff(Teacher t) {
        if (t.atWorkBuilding() == true) {
            Occupants.add(t);
        }
    }

    public void addStudents(Kid k) {
        if (k.isAtSchool() == true) {
            Occupants.add(k);
        }
    }

    public void showOccupants() {
        for (Person p : Occupants) {
            System.out.printf("%s is in School", p.getName());
        }
    }


}