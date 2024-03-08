package sample.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class barController implements Initializable {
    @FXML
    private BarChart<?, ?> barchart;
    @FXML
    private Button anaa;

    @FXML
    void clicka(ActionEvent event) {
        try {
            FXMLLoader anaPageLoader1 = new FXMLLoader(loginController.class.getResource("surveyid.fxml"));
            Stage stage4 = (Stage) anaa.getScene().getWindow();
            Scene anaPageScene1 = new Scene(anaPageLoader1.load());
            stage4.setScene(anaPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       inbarchart();
    }
    private void inbarchart() {
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("Monday", 8));
        series.getData().add(new XYChart.Data("Tuesday", 12));
        series.getData().add(new XYChart.Data("Wednesday", 10));
        series.getData().add(new XYChart.Data("Thursday", 12));
        series.getData().add(new XYChart.Data("Friday", 8));
        series.getData().add(new XYChart.Data("Saturday", 15));
        barchart.getData().addAll(series);
    }
    @FXML
    private Button crea;

    public void crea(ActionEvent actionEvent) {
        try {
            FXMLLoader csPageLoader1 = new FXMLLoader(loginController.class.getResource("creasurvey.fxml"));
            Stage stagecs = (Stage) crea.getScene().getWindow();
            Scene csPageScene1 = new Scene(csPageLoader1.load());
            stagecs.setScene(csPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
