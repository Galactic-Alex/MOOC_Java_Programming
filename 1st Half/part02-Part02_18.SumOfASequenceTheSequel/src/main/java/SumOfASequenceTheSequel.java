
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (; firstNum <= lastNum; firstNum++) {
            sum += firstNum;
        }
        System.out.println("The sum is " + sum);
    }
}
