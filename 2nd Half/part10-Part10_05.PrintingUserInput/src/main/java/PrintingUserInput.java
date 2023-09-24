
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                strings.forEach(System.out::println);
                break;
            }
            strings.add(string);
        }
    }
}
