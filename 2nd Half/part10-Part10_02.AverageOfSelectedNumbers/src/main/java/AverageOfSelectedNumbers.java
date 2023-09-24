
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> integerArrayList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String input2 = scanner.nextLine();
                if (input2.equals("n")) {
                    System.out.println(integerArrayList.stream()
                            .mapToInt(Integer::valueOf)
                            .filter(i -> i < 0)
                            .average()
                            .getAsDouble());
                } else if (input2.equals("p")){
                    System.out.println(integerArrayList.stream()
                            .mapToInt(Integer::valueOf)
                            .filter(i -> i > 0)
                            .average()
                            .getAsDouble());
                }
                break;
            }
            integerArrayList.add(input);
        }

    }
}
