
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdCollection birdCollection = new BirdCollection();
        int counter = 0;
        while (true) {
            System.out.print("?");
            String command = scan.nextLine();
            String comman = "Add\nXXX\nYYY\nObservation\nXXX\n"
                    + "Add\nWWW\nZZZ\n"
                    + "Observation\nWWW\n"
                    + "One\nXXX\n"
                    + "Observation\nXXX\nObservation\nWWW\n"
                    + "One\nWWW\n"
                    + "Quit\n";
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birdCollection.addBird(bird);
            }
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                for (int i = 0; i < birdCollection.getBirdCollection().size(); i++) {
                    Bird bird = (birdCollection.getBird(i));
                    if (bird.getName().equals(name) || bird.getNameInLatin().equals(name)){
                        bird.addObservations();
                        break;
                    }
                    if (i == birdCollection.getBirdCollection().size() - 1) {
                        System.out.println("Not a bird!");
                        break;
                    }
                }
            }
            if (command.equals("All")) {
                for (Bird bird : birdCollection.getBirdCollection()) {
                    System.out.println(bird);
                }
            }
            if (command.equals("One")) {
                if (birdCollection.getBirdCollection().isEmpty()) {
                    continue;
                }
                if (counter == 0) {
                    System.out.println(birdCollection.getBird(0));
                    counter++;
                } else if (birdCollection.getBirdCollection().size() == 2 && counter == 1) {
                    System.out.println(birdCollection.getBird(1));
                    counter++;
                }
            }
        }
    }
}
