package sample.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class HelloApplication extends Application {
    public static Stage sta;
    public static Scene scene;
    public static Scene scene1;
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
         scene1 = new Scene(fxmlLoader1.load());
         sta = stage;
        sta.setTitle("Topo Probing");
        sta.setScene(scene1);
        sta.show();
        stage.setFullScreen(true);
    }

    public static void main(String[] args) {

        launch();
    }
}