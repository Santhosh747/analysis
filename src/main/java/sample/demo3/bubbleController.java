package sample.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class bubbleController implements Initializable {
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
    @FXML
    private BubbleChart<?, ?> bubblechart;

    XYChart.Series series = new XYChart.Series();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bubblechart.getXAxis().setLabel("Week");
        bubblechart.getYAxis().setLabel("Day");
        series.getData().add(new XYChart.Data(1, 8));
        series.getData().add(new XYChart.Data(13, 12));
        series.getData().add(new XYChart.Data(22, 10));
        series.getData().add(new XYChart.Data(33, 12));
        series.getData().add(new XYChart.Data(44, 8));
        series.getData().add(new XYChart.Data(50, 15));
        bubblechart.getData().addAll(series);
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
