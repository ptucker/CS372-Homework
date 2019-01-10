//PT -- missing javadoc. -2

public class City {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person("Johnny", 21),
            new Police(), new Police("Bryant", 55, Role.Chief),
            new Teacher(), new Teacher("Sharie", 34, 15, "CS Professor"),
            new Kid(), new Kid("Bobbie", 12, "KitKat", true)};

        Building[] buildings = {new CityHall(), new School()};

        for (Person p : people) {
            System.out.printf("%s\n", p.toString());

            for (Building b : buildings) {
                b.populate(p);
            }
        }

        for (Building b : buildings) {
            System.out.printf("%s\n", b.toString());
        }

        for (Person p : people) {
            if (p instanceof Employee) {
                System.out.printf("%s is paid for their hard work.\n", p.getName());
            }
        }

        for (Building b : buildings) {
            b.showOccupants();
        }

        

    }
}
