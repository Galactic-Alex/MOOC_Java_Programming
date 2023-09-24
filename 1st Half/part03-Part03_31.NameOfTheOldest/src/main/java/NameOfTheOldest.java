
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestAge = 0;
        String name = null;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            int age = Integer.parseInt(pieces[1]);
            if (age > biggestAge) {
                biggestAge = age;
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
