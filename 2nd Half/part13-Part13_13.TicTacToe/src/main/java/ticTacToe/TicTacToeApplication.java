package ticTacToe;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    protected static int counter;
    private String[][] gridChecker;

    @Override
    public void init() {
        gridChecker = new String[3][3];
    }

    @Override
    public void start(Stage stage) {
        Label turnInfo = new Label("Turn: X");
        turnInfo.setFont(Font.font("Monospaced", 40));
        BorderPane layout = new BorderPane();
        GridPane gridPane = new GridPane();
        layout.setTop(turnInfo);
        addTicTacRow(gridPane, 0, turnInfo);
        addTicTacRow(gridPane, 1, turnInfo);
        addTicTacRow(gridPane, 2, turnInfo);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        layout.setCenter(gridPane);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setPrefSize(300, 180);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    private void addTicTacRow(GridPane gridPane, int place, Label turnInfo) {
        gridPane.addRow(place, new TicTacButton(turnInfo, gridChecker, 0, place).getButton(), new TicTacButton(turnInfo, gridChecker, 1, place).getButton(), new TicTacButton(turnInfo, gridChecker, 2, place).getButton());
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}


