import java.util.Scanner;

public class OddOrEven{
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int x;

        System.out.println("Enter a number between 10 and 100.");
        x = scnr.nextInt();

        if (x >= 10 && x <= 100) {
        
            for (int i = 1; i <= x; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                }
                else {
                    System.out.println(i + " is odd.");
                }
            }
        }
        else {
            System.out.println("Invalid value.");
        }
    }
}