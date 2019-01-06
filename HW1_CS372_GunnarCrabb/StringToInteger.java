import java.util.Scanner;

public class StringToInteger{
    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
        String x;

        System.out.println("Enter an integer.");
        x = scnr.nextLine();

        int y = 0;
        char c;
        char z = x.charAt(0);
        boolean isInteger = Character.isDigit(z);

        if (isInteger == true) {
            System.out.println("This is an integer.");
            for (int i = 0; i < x.length(); i++) {
                y *= 10;
                c = x.charAt(i);
                //PT -- what if x.charAt(i) isn't a digit?. -1
                y += Character.getNumericValue(c);
            }
            System.out.println("has a length of " + x.length());
            System.out.println("has a value of " + y);

        }
        else {
            System.out.println("This is NOT an integer.");
        }
        
    }
}
