package buttonandlabel;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication  {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Stage stage = new Stage();
                ButtonAndLabelApplication buttonAndLabelApplication = new ButtonAndLabelApplication();
                buttonAndLabelApplication.start(stage);
            }
        });
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("This is a button");
        Label label = new Label("This is a label");
        FlowPane flowPane = new FlowPane(label, button);
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }
}
