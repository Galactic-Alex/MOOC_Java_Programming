
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (; ; counter++) {
            String nextLine = scanner.nextLine();
            if (nextLine.equals("end")) {
                break;
            }
        }
        System.out.println(counter);
    }
}
