
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == 0) {
                break;
            } else if (nextInt < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else {
                System.out.println(nextInt * nextInt);
                continue;
            }
        }
    }
}
