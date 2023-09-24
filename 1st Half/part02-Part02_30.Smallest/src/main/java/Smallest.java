
public class Smallest {

    public static int smallest(int number1, int number2) {
        int smallestNum = 0;
        if (number1 < number2) {
            smallestNum = number1;
        } else {
            smallestNum = number2;
        }
        return smallestNum;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
