
public class AdvancedAstrology {

    public static void printStars(int number) {
        while (number > 0) {
            number--;
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while(number > 0) {
            number--;
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int counterSpace = size - 1;
        int counter = 1;
        while (counter <= size) {
            printSpaces(counterSpace);
            printStars(counter);
            counter++;
            counterSpace--;
        }
    }

    public static void christmasTree(int height) {
        int spaceCounter = height - 1;
        int starCounter = 1;
        for (int counter = 0; counter < height; counter++ ) {
            printSpaces(spaceCounter);
            spaceCounter--;
            printStars(starCounter);
            starCounter += 2;
        }
        for (int counter = 0; counter < 2; counter++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
