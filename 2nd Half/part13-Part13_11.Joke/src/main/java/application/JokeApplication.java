package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                JokeApplication jokeApplication = new JokeApplication();
                Stage stage = new Stage();
                try {
                    jokeApplication.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button buttonJoke = new Button("Joke");
        Button buttonAnswer = new Button("Answer");
        Button buttonExplanation = new Button("Explanation");
        HBox hBox = new HBox(buttonJoke, buttonAnswer, buttonExplanation);
        StackPane stackPaneJoke = createView("What do you call a bear with no teeth?");
        StackPane stackPaneAnswer = createView("A gummy bear.");
        StackPane stackPaneExplanation = createView("Gummy bears have no teeth.");
        BorderPane menu = new BorderPane();
        menu.setTop(hBox);
        menu.setCenter(stackPaneJoke);
        Scene scene = new Scene(menu);
        buttonJoke.setOnAction(action -> {
            menu.setCenter(stackPaneJoke);
        });
        buttonAnswer.setOnAction(action -> {
            menu.setCenter(stackPaneAnswer);
        });
        buttonExplanation.setOnAction(action -> {
            menu.setCenter(stackPaneExplanation);
        });
        stage.setScene(scene);
        stage.show();
    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }
}
