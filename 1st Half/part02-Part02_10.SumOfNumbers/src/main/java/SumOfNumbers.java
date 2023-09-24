
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == 0) {
                break;
            }
            sum += nextInt;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
