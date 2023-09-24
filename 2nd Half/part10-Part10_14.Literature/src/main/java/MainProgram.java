
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                System.out.println();
                break;
            }
            System.out.print("Input the age recommendation: ");
            int inputAge = Integer.parseInt(scanner.nextLine());
            System.out.println();
            books.add(new Book(inputAge, inputName));
        }
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                        .thenComparing(Book::getName);
        books.sort(comparator);
        for (Book i : books) {
            System.out.println(i);
        }
    }

}
