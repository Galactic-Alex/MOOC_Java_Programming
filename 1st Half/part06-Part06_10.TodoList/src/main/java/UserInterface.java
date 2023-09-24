import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                String addition = scanner.nextLine();
                this.toDoList.add(addition);
                continue;
            }
            if (command.equals("list")){
                toDoList.print();
            }
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int taskID = Integer.parseInt(scanner.nextLine());
                this.toDoList.remove(taskID);
                continue;
            }

        }
    }
}
