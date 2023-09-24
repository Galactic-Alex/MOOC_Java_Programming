
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> integerArrayList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println(integerArrayList.stream()
                        .mapToInt(Integer::valueOf)
                        .average()
                        .getAsDouble());
                break;
            }
            integerArrayList.add(input);
        }
    }
}
