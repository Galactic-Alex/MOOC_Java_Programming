
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int firstNum = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        for (int counter = 1; counter <= firstNum; counter++) {
            factorial *= counter;
        }
        System.out.println("Factorial: " + factorial);
    }
}
