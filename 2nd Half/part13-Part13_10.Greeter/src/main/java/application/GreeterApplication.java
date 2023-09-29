package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                GreeterApplication greeterApplication = new GreeterApplication();
                Stage stage = new Stage();
                try {
                    greeterApplication.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Enter your name and start");
        TextField textField = new TextField();
        Button button = new Button("Start");
        GridPane layoutOfLogin = new GridPane();
        layoutOfLogin.add(label, 0, 0);
        layoutOfLogin.add(textField, 0, 1);
        layoutOfLogin.add(button, 0, 2);
        layoutOfLogin.setPrefSize(300, 180);
        layoutOfLogin.setAlignment(Pos.CENTER);
        layoutOfLogin.setHgap(10);
        layoutOfLogin.setVgap(10);
        Scene loginScreen = new Scene(layoutOfLogin);
        stage.setScene(loginScreen);
        button.setOnAction(action -> {
            Label label1 = new Label("Welcome " + textField.getText() + "!");
            BorderPane borderPane = new BorderPane();
            borderPane.setCenter(label1);
            borderPane.setPrefSize(300, 180);
            Scene welcomeScreen = new Scene(borderPane);
            stage.setScene(welcomeScreen);
        });
        stage.show();
    }
}
