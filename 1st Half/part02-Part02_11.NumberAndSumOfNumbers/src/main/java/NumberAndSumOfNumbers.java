
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numOfNums = 0;
        while (true) {
            System.out.println("Give a number:");
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == 0) {
                break;
            }
            numOfNums++;
            sum += nextInt;
        }
        System.out.println("Number of numbers: " + numOfNums);
        System.out.println("Sum of the numbers: " + sum);
    }
}
