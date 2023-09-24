
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        while (number > 0) {
            number--;
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int counter = size;
        while(counter > 0) {
            counter--;
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        while (height > 0) {
            height--;
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}
