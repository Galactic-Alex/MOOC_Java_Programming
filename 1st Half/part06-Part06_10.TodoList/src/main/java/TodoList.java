import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDoList;

    public TodoList() {
        this.toDoList = new ArrayList<>();
    }

    public void add(String task) {
        toDoList.add(task);
    }

    public void print() {
        int counter = 0;
        for (String i : toDoList) {
            counter++;
            System.out.println(counter + ": " + i);
        }
    }

    public void remove(int number) {
        toDoList.remove(number - 1);
    }
}
