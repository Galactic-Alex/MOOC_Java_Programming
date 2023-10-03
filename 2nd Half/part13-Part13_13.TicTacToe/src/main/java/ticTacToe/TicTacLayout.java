package ticTacToe;

import javafx.scene.control.Label;

public class TicTacLayout {
    private Label turnInfo;

    TicTacLayout() {
        turnInfo = new Label("This turn: X");
    }

    public void changeTurn() {
        turnInfo.setText("This turn: O");
    }
}
