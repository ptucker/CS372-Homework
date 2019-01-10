
public class Kid extends Person {
    private String favoriteCandy;
    private Boolean atSchool;

    public Kid(){
        Name = "Kid";
        Age = 10;
        favoriteCandy = "M&Ms";
        atSchool = false;
        type = Type.Kid;
    }

    public Kid(String name, int age, String candy, Boolean school) {
        Name = name;
        Age = age;
        favoriteCandy = candy;
        atSchool = school;
        type = Type.Kid;
    }

    public void goToSchool() {
        atSchool = true;
    }

    public Boolean isAtSchool() {
        return atSchool;
    }
}