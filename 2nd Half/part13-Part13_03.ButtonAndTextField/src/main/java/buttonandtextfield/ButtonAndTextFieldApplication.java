package buttonandtextfield;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Stage stage = new Stage();
                ButtonAndTextFieldApplication buttonAndLabelApplication = new ButtonAndTextFieldApplication();
                buttonAndLabelApplication.start(stage);
            }
        });
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("This is a button");
        TextField textField = new TextField("This is a TextField");
        FlowPane flowPane = new FlowPane(button, textField);
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }
}

