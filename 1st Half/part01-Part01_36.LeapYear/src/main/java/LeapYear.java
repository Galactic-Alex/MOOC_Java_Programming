
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int nextInt = Integer.parseInt(scan.nextLine());
        if (nextInt % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (nextInt % 100 == 0) {
            System.out.println("The year is not a leap year.");
        } else if (nextInt % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
