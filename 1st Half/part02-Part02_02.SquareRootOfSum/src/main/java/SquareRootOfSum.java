
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt1 = Integer.parseInt(scanner.nextLine());
        int nextInt2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.sqrt(nextInt1 + nextInt2));
    }
}
