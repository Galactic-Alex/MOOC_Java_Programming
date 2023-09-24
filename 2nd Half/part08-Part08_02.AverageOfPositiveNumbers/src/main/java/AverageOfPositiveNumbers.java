
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                if (counter == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(sum * 1.0 / counter);
                break;
            }
            if (input > 0) {
                sum += input;
                counter++;
            }
        }
    }
}
