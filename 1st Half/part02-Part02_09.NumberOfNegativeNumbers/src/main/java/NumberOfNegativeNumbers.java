
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt < 0) {
                counter++;
            }
            if (nextInt == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + counter);
    }
}
