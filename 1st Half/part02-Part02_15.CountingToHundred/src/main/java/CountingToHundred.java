
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = Integer.parseInt(scanner.nextLine());
        while (nextInt <= 100) {
            System.out.println(nextInt);
            nextInt++;
        }
    }
}
