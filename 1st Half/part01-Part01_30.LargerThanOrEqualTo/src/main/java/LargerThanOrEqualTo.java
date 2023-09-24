
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int nextInt1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int nextInt2 = Integer.parseInt(scan.nextLine());
        if (nextInt1 == nextInt2) {
            System.out.println("The numbers are equal!");
        } else if (nextInt1 > nextInt2) {
            System.out.println("Greater number is: " + nextInt1);
        } else {
            System.out.println("Greater number is: " + nextInt2);
        }
    }
}
