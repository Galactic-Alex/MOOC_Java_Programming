package myFirstApplication;


import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {
    

    public static void main(String[] args) {
        Stage stage = new Stage();
        MyFirstApplication application = new MyFirstApplication();
        application.start(stage);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("My first application");
        stage.showAndWait();
    }
}
