
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("First name: ");
            String nameFirst = scanner.nextLine();
            if (nameFirst.isEmpty()) {
                System.out.println("");
                break;
            }
            System.out.print("Last name: ");
            String nameLast = scanner.nextLine();
            System.out.print("Identification number: ");
            String identificationNum = scanner.nextLine();
            PersonalInformation i = new PersonalInformation(nameFirst, nameLast, identificationNum);
            infoCollection.add(i);
        }
        for (PersonalInformation i : infoCollection) {
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }
    }
}
