
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt1 = Integer.parseInt(scanner.nextLine());
        int nextInt2 = Integer.parseInt(scanner.nextLine());
        if (nextInt1 > nextInt2) {
            System.out.println(nextInt1 + " is greater than " + nextInt2 + ".");
        } else if (nextInt2 > nextInt1) {
            System.out.println(nextInt1 + " is smaller than " + nextInt2 + ".");
        } else {
            System.out.println(nextInt1 + " is equal to " + nextInt2 + ".");
        }
    }
}
