
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int counter = 0;
        int sumOfAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            counter++;
            String[] pieces = input.split(",");
            int age = Integer.parseInt(pieces[1]);
            if (longestName.length() < pieces[0].length()) {
                longestName = pieces[0];
            }
            sumOfAge += Integer.parseInt(pieces[1]);
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sumOfAge * 1.0 / counter));
    }
}
