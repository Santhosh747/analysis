package sample.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class pieController implements Initializable {
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
    private PieChart pichart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("monday",2),
                new PieChart.Data("Tusday",4),
                new PieChart.Data("wednesday",8)
        );
        pichart.getData().addAll(pieChartData);
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
