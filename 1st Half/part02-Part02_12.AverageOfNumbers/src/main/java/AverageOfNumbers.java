
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == 0) {
                break;
            }
            numOfNums++;
            sum += nextInt;
        }
        System.out.println("Average of the numbers: " + (sum * 1.0 / numOfNums));
    }
}
