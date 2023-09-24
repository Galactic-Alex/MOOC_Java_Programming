package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        for (; times > 0; times--) {
            System.out.println("Application logic is working");
            ui.update();
        }
    }
}
