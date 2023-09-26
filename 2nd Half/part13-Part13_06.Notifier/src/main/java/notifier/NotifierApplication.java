package notifier;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Stage stage = new Stage();
                NotifierApplication notifierApplication = new NotifierApplication();
                notifierApplication.start(stage);
            }
        });
    }

    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        Button button = new Button("Button");
        Label label = new Label();
        VBox vBox = new VBox(textField, button, label);
        button.setOnAction((event) -> label.setText(textField.getText()));
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }
}
