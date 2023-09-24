
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = Integer.parseInt(scanner.nextLine());
        if (nextInt < 0) {
            System.out.println(nextInt * -1);
        } else {
            System.out.println(nextInt);
        }
    }
}
