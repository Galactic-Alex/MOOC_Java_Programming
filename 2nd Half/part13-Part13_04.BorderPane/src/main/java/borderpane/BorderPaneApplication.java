package borderpane;


import com.sun.javafx.scene.control.LabeledText;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Stage stage = new Stage();
                BorderPaneApplication borderPane = new BorderPaneApplication();
                borderPane.start(stage);
            }
        });
    }

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Label("NORTH"));
        borderPane.setRight(new Label("EAST"));
        borderPane.setBottom(new Label("SOUTH"));
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }
}
