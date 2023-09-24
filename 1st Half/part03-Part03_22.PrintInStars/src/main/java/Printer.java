
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i : array) {
            System.out.println("");
            for (int counter = 0; counter < i; counter++ ) {
                System.out.print("*");
            }
        }
    }

}
