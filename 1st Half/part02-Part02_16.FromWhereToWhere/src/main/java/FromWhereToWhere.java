
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int destination = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from? ");
        int origin = Integer.parseInt(scanner.nextLine());
        while (origin <= destination) {
            System.out.println(origin);
            origin++;
        }
    }
}
