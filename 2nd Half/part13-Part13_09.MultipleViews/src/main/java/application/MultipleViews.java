package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                MultipleViews multipleViews = new MultipleViews();
                Stage stage = new Stage();
                try {
                    multipleViews.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Label label1 = new Label("First view!");
        Button button1 = new Button("To the second view!");
        borderPane.setTop(label1);
        borderPane.setCenter(button1);
        Scene scene1 = new Scene(borderPane);
        Button button2 = new Button("To the third view!");
        Label label2 = new Label("Second view!");
        VBox vbox = new VBox(button2, label2);
        Scene scene2 = new Scene(vbox);
        Label label3 = new Label("Third view!");
        Button button3 = new Button("To the first view!");
        GridPane gridPane = new GridPane();
        gridPane.add(label3, 0, 0);
        gridPane.add(button3, 1, 1);
        Scene scene3 = new Scene(gridPane);
        button1.setOnAction(event -> {
            stage.setScene(scene2);
        });
        button2.setOnAction(event -> {
            stage.setScene(scene3);
        });
        button3.setOnAction(event -> {
            stage.setScene(scene1);
        });
        stage.setScene(scene1);
        stage.show();
    }
}
