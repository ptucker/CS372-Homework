import java.util.List;
public class CityHall extends Building{
    private List<Person> Occupants;

    public CityHall() {
        name = "City Hall";
    }

    public void addOccupants(Police p) {
        if (p.atWorkBuilding() == true) {
            Occupants.add(p);
        }
    }

    public void showOccupants() {
        for (Person p : Occupants) {
            System.out.printf("%s is in City hall", p.getName());
        }
    }

}