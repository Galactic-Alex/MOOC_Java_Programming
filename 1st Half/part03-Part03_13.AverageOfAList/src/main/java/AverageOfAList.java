
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            if (nextNum == -1) {
                break;
            }
            list.add(nextNum);
        }
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("Average: " + (sum * 1.0 / list.size()));
    }
}
