
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            int age = Integer.parseInt(pieces[1]);
            if (age > biggestAge) {
                biggestAge = age;
            }
        }
        System.out.println("Age of the oldest: " + biggestAge);
    }
}
