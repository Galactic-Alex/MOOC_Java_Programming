package textstatistics;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Stage stage = new Stage();
                TextStatisticsApplication textStatisticsApplication = new TextStatisticsApplication();
                try {
                    textStatisticsApplication.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        TextArea textArea = new TextArea();
        HBox hbox = new HBox();
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is:");
        hbox.getChildren().addAll(lettersLabel, wordsLabel, longestWordLabel);
        hbox.setSpacing(10);
        borderPane.setCenter(textArea);
        borderPane.setBottom(hbox);
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int letters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = 0;
            StringBuilder longestWord = new StringBuilder("");
            for (String i : parts) {
                words++;
                if (longestWord.length() < i.length()){
                    longestWord = new StringBuilder(i);
                }
            }
            lettersLabel.setText("Letters: " + letters);
            wordsLabel.setText("Words: " + words);
            longestWordLabel.setText("The longest word is: " + longestWord);
        });
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }
}
