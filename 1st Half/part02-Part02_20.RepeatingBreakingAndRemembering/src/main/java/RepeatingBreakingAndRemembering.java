
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numOfNums = 0;
        int evenNums = 0;
        int oddNums = 0;
        while (true) {
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += nextInt;
            numOfNums++;
            if (nextInt % 2 == 0) {
                evenNums++;
            } else {
                oddNums++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNums);
        System.out.println("Average: " + (sum * 1.0 / numOfNums));
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + oddNums);
    }
}
