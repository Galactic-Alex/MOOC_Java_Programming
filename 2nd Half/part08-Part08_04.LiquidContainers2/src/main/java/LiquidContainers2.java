
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.parseInt(parts[1]);
            switch (parts[0]) {
                case "add":
                    first.add(amount);
                    break;
                case "remove":
                    second.remove(amount);
                    break;
                case "move":
                    int tempHolder = first.contains();
                    first.remove(amount);
                    if (first.contains() == 0) {
                        second.add(tempHolder);
                    } else {
                        second.add(amount);
                    }
                    break;
            }
        }
    }

}
