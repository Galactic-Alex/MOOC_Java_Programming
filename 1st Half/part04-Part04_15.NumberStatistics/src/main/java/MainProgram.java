
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        while (true) {
            int userNumber = Integer.parseInt(scanner.nextLine());
            if (userNumber == -1) {
                break;
            }
            statistics.addNumber(userNumber);
            if (userNumber % 2 == 0) {
                statisticsEven.addNumber(userNumber);
            } else {
                statisticsOdd.addNumber(userNumber);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
