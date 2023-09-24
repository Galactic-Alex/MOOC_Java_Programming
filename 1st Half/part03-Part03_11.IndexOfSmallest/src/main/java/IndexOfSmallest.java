
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == 9999) {
                break;
            }
            list.add(nextInt);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        if (list.contains(smallest)) {
            for (int i = 0; i < list.size(); i++) {
                if (smallest == list.get(i)) {
                    System.out.println("Found at index: " + i);
                }
            }
        }

    }
}
