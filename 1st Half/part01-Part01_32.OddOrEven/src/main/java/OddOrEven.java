
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int nextInt = Integer.parseInt(scan.nextLine());
        if (nextInt % 2 == 0) {
            System.out.println("Number " + nextInt + " is even.");
        } else {
            System.out.println("Number " + nextInt + " is odd.");
        }
    }
}
