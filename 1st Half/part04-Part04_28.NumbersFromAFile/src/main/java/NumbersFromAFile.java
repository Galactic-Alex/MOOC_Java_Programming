
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {

            while (scanner1.hasNextLine()) {
                int row = Integer.parseInt(scanner1.nextLine());
                if (row >= lowerBound && row <= upperBound) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Numbers: " + counter);
    }

}
