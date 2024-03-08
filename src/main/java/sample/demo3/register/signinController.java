package sample.demo3.register;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.demo3.loginController;

import java.io.IOException;
public class signinController {
    @FXML
    private TextField rmail;

    @FXML
    private TextField rname;

    @FXML
    private TextField rpass;

    @FXML
    private TextField rsname;

    @FXML
    private Button sign1;

    @FXML
    void click(ActionEvent event) {
        try {
            FXMLLoader firstPageLoader1 = new FXMLLoader(loginController.class.getResource(".fxml"));
            Stage stage3 = (Stage) sign1.getScene().getWindow();
            Scene firstPageScene1 = new Scene(firstPageLoader1.load());
            stage3.setScene(firstPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
