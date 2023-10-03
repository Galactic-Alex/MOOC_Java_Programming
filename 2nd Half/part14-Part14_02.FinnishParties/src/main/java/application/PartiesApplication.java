package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.nio.file.Paths;
import java.util.Scanner;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        Application.launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))){
            String[] splitDataNames = scanner.nextLine().split("\t");
            while (scanner.hasNextLine()) {
                String[] splitPartyData = scanner.nextLine().split("\t");
                XYChart.Series newData = new XYChart.Series();
                newData.setName(splitPartyData[0]);
                for (int i = 1; i < splitPartyData.length; i++) {
                    if (splitPartyData[i].equals("-")) {
                        continue;
                    }
                    newData.getData().add(new XYChart.Data(Integer.valueOf(splitDataNames[i]), Double.valueOf(splitPartyData[i])));
                }
                lineChart.getData().add(newData);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
