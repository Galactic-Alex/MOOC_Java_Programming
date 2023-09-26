package textstatistics;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Stage stage = new Stage();
                TextStatisticsApplication textStatisticsApplication = new TextStatisticsApplication();
                textStatisticsApplication.start(stage);
            }
        });
    }

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        TextArea textArea = new TextArea();
        HBox hbox = new HBox();
        hbox.getChildren().addAll(new Label("Letters: 0"), new Label ("Words: 0"), new Label("The longest word is:"));
        borderPane.setCenter(textArea);
        borderPane.setBottom(hbox);
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }
}
