
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numOfPositiveNums = 0;
        while (true) {
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == 0) {
                break;
            }
            if (nextInt > 0) {
                numOfPositiveNums++;
                sum += nextInt;
            }
        }
        if (numOfPositiveNums == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum * 1.0 / numOfPositiveNums);
        }
    }
}
