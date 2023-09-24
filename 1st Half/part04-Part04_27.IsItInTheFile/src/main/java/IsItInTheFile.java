
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        int checker = 0;
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scanner1.hasNextLine()) {
                String row = scanner1.nextLine();
                if (row.equals(searchedFor)) {
                    System.out.println("Found!");
                    checker = 1;
                    return;
                }
            }
            if (checker == 0) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
