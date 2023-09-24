
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int nextInt = Integer.parseInt(scan.nextLine());
        if (nextInt < 0) {
            System.out.println("impossible!");
        } else if (nextInt < 50) {
            System.out.println("failed");
        } else if (nextInt < 60) {
            System.out.println("1");
        } else if (nextInt < 70) {
            System.out.println("2");
        } else if (nextInt < 80) {
            System.out.println("3");
        } else if (nextInt < 90) {
            System.out.println("4");
        } else if (nextInt < 101) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}
