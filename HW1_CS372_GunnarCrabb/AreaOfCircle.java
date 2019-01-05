import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
        int r;

        System.out.println("Enter the radius of a Circle.");
        r = scnr.nextInt();

        final double PI = 3.14;

        System.out.println("The Area of the circle is: " + (PI * (r * r)));

    }

}