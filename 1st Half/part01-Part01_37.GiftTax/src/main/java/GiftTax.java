
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int nextInt = Integer.parseInt(scan.nextLine());
        if (nextInt <= 4999) {
            System.out.println("No tax!");
        } else if (nextInt <= 24999) {
            System.out.println("Tax: " + (100 + (nextInt - 5000) * 0.08));
        } else if (nextInt <= 54999) {
            System.out.println("Tax: " + (1700 + (nextInt - 25000) * 0.10));
        } else if (nextInt <= 199999) {
            System.out.println("Tax: " + (4700 + (nextInt - 55000) * 0.12));
        } else if (nextInt <= 999999) {
            System.out.println("Tax: " + (22100 + (nextInt - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (nextInt - 1000000) * 0.17));
        }
    }
}
