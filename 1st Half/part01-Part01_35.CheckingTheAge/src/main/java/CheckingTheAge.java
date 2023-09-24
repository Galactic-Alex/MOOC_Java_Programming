
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you?");
        int nextInt = Integer.parseInt(scan.nextLine());
        if (nextInt >= 0 && nextInt < 121) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
