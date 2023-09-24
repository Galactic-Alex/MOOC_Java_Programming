
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
             Files.lines(Paths.get(file))
                    .map(string -> string.split(","))
                    .map(strings -> new Book(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), strings[3]))
                    .forEach(books::add);
        } catch (Exception e) {
            System.out.println("Couldn't read " + e.getMessage());
        }
        return books;
    }
}
