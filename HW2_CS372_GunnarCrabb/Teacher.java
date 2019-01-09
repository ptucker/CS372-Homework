
public class Teacher extends Person implements Employee {

    private int GradeLevel;
    private String Certification;
    private int StartID = 5555;

    public Teacher() {
        Name = "Teacher";
        Age = 40;
        GradeLevel = 12;
        Certification = "yes";
    }

    public Teacher(String name, int age, int grade, String cert) {
        Name = name;
        Age = age;
        GradeLevel = grade;
        Certification = cert;
    }

    public Boolean Employed(Employee p) {
        return true;
    }

    public int Pay() {
        return 1200;
    }

    public int ID() {
        StartID++;
        return StartID-1;
    }

    public Boolean atWorkBuilding() {
        return true;
    }


}