import java.util.Scanner;

public class BodyMassIndex{
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int height;
        int weight;

        System.out.println("Enter your height in inches.");
        height = scnr.nextInt();

        System.out.println("Enter your weight in pounds.");
        weight = scnr.nextInt();


        double meters = height * 0.0254;
        double kilograms = weight * 0.453592;

        double BMI = kilograms / (meters * meters);

        System.out.println("Your BMI is: " + BMI);

    }
}