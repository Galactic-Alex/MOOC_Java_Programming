package ticTacToe;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import static ticTacToe.TicTacToeApplication.counter;

public class TicTacButton implements EventHandler {
    private Button button;
    private Label turnInfo;
    private int x;
    private int y;

    private String[][] gridChecker;

    public TicTacButton(Label turnInfo, String[][] gridChecker, int x, int y) {
        this.gridChecker = gridChecker;
        this.button = new Button();
        this.turnInfo = turnInfo;
        this.x = x;
        this.y = y;
        button.setFont(Font.font("Monospaced", 40));
        button.setOnMouseClicked(this::handle);
        button.setText(" ");
    }

    @Override
    public void handle(Event event) {
        if (counter >= 9) {
            return;
        }
        if (!(button.getText().isEmpty()) && !(button.getText().equals(" "))) {
            return;
        }
        if (counter % 2 == 0) {
            button.setText("X");
            turnInfo.setText("Turn: O");
            gridChecker[x][y] = "X";
        } else {
            button.setText("O");
            turnInfo.setText("Turn: X");
            gridChecker[x][y] = "O";
        }
        counter++;
        if (counter == 9) {
            turnInfo.setText("The end!");
        }
        if (isGameOver()) {
            turnInfo.setText("The end!");
            counter = 10;
        }
    }

    public Button getButton() {
        return button;
    }

    private boolean isGameOver() {
        for (int x = 0; x < gridChecker.length; x++) {
            StringBuilder columnCheck = new StringBuilder();
            StringBuilder rowCheck = new StringBuilder();
            for (int y = 0; y < gridChecker[x].length; y++) {
                columnCheck.append(gridChecker[x][y]);
                rowCheck.append(gridChecker[y][x]);
            }
            if (columnCheck.toString().equals("OOO") ^ columnCheck.toString().equals("XXX")) {
                return true;
            }
            if (rowCheck.toString().equals("OOO") ^ rowCheck.toString().equals("XXX")) {
                return true;
            }
        }
        StringBuilder diagonalCheck1 = new StringBuilder();
        StringBuilder diagonalCheck2 = new StringBuilder();
        for (int i = 0, b = 2; i < gridChecker.length; i++, b--){
            diagonalCheck1.append(gridChecker[i][i]);
            diagonalCheck2.append(gridChecker[b][i]);
        }
        if (diagonalCheck1.toString().equals("OOO") ^ diagonalCheck1.toString().equals("XXX")) {
            return true;
        }
        if (diagonalCheck2.toString().equals("OOO") ^ diagonalCheck2.toString().equals("XXX")) {
            return true;
        }
        return false;
    }
}
