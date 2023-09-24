
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int number = Integer.parseInt(parts[1]);
            if (number > 0) {
                switch (parts[0]) {
                    case "add":
                        first += number;
                        if (first > 100) {
                            first = 100;
                        }
                        break;
                    case "move":
                        if (first - number < 0) {
                            if (second + first > 100) {
                                second = 100;
                            } else {
                                second += first;
                            }
                            first = 0;
                        } else {
                            if (second + first > 100) {
                                second = 100;
                            } else {
                                second += number;
                                first -= number;
                            }
                        }
                        break;
                    case "remove":
                        second -= number;
                        if (second < 0) {
                            second = 0;
                        }
                        break;
                }
            }
        }
    }
}
