import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                System.out.println();
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            Book newBook = new Book(title, pages, publicationYear);
            books.add(newBook);
        }
        System.out.print("What information will be printed? ");
        String response = scanner.nextLine();
        if (response.equals("everything")) {
            for (Book i : books) {
                System.out.println(i);
            }
        }
        if (response.equals("name")) {
            for (Book i : books) {
                System.out.println(i.getTitle());
            }
        }
    }
}
