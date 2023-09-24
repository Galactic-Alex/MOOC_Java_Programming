
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = scanner.nextLine();
            if (Integer.parseInt(string) < 0) {
                strings.stream()
                        .mapToInt(Integer::parseInt)
                        .filter(i -> i >= 1 && i <= 5)
                        .forEach(System.out::println);
                break;
            }
            strings.add(string);
        }
    }
}
