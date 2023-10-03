package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        Application.launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 90000, 10);
        yAxis.setAutoRanging(true);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Chart Name");
        XYChart.Series placeholderData = new XYChart.Series();
        XYChart.Series placeholderDataMore = new XYChart.Series();
        placeholderDataMore.getData().add(new XYChart.Data(0, 0));
        placeholderData.getData().add(new XYChart.Data(0, 0));
        lineChart.getData().add(0, placeholderData);
        lineChart.getData().add(1, placeholderDataMore);
        BorderPane chartPane = new BorderPane();
        chartPane.setCenter(lineChart);
        BorderPane monthlySavings = makeMonthlySavings(lineChart);
        VBox sliderBox = new VBox(monthlySavings, makeInterestRate(lineChart, (Slider) monthlySavings.getCenter()));
        sliderBox.setSpacing(20);
        chartPane.setTop(sliderBox);
        chartPane.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(chartPane);
        stage.setScene(scene);
        stage.show();
    }

    private BorderPane makeMonthlySavings(LineChart lineChart) {
        BorderPane monthlySavings = new BorderPane();
        monthlySavings.setLeft(new Label("Monthly savings"));
        Slider monthlySavingSlider = new Slider(25, 250, 25);
        monthlySavingSlider.setMajorTickUnit(25);
        monthlySavingSlider.setShowTickLabels(true);
        monthlySavingSlider.setShowTickMarks(true);
        monthlySavings.setCenter(monthlySavingSlider);
        Label currentValueLabel = new Label("25");
        monthlySavingSlider.setSnapToTicks(true);
        monthlySavings.setRight(currentValueLabel);
        monthlySavingSlider.setOnMouseClicked(drag -> {
            double initialAmount = monthlySavingSlider.getValue();
            XYChart.Series newData = new XYChart.Series();
            lineChart.getData().remove(0);
            for (int i = 0; i < 31; i++) {
                double sumOfData = initialAmount * (12 * i);
                newData.getData().add(new XYChart.Data(i, sumOfData));
            }
            lineChart.getData().add(0, newData);
            currentValueLabel.setText(String.valueOf(monthlySavingSlider.getValue()));
        });
        return monthlySavings;
    }

    private BorderPane makeInterestRate(LineChart lineChart, Slider monthlySavings) {
        BorderPane interestRate = new BorderPane();
        interestRate.setLeft(new Label("Yearly interest rate"));
        Slider interestRateSlider = new Slider(0, 10, 25);
        interestRateSlider.setMajorTickUnit(10);
        interestRateSlider.setShowTickLabels(true);
        interestRateSlider.setShowTickMarks(true);
        interestRateSlider.setSnapToTicks(true);
        interestRate.setCenter(interestRateSlider);
        Label currentValueLabel = new Label("0");
        interestRate.setRight(currentValueLabel);
        interestRateSlider.setOnMouseClicked(drag -> {
            int monthlyInvestment = (int) monthlySavings.getValue();
            double sumOfInvestments = 0;
            XYChart.Series newData = new XYChart.Series();
            newData.getData().add(new XYChart.Data(0, sumOfInvestments));
            lineChart.getData().remove(1);
            for (int i = 1; i < 31; i++) {
                sumOfInvestments = (sumOfInvestments + monthlyInvestment * 12) * (interestRateSlider.getValue() / 100 + 1);
                newData.getData().add(new XYChart.Data(i, sumOfInvestments));
            }
            lineChart.getData().add(1, newData);
            currentValueLabel.setText(String.valueOf(interestRateSlider.getValue()));
        });
        return interestRate;
    }
}
