import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            TelevisionProgram newTvProgram = new TelevisionProgram(name, duration);
            programs.add(newTvProgram);
        }
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());
        for (TelevisionProgram i : programs) {
            if (i.getDuration() <= maxDuration) {
                System.out.println(i);
            }
        }
    }
}
