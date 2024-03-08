module sample.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens sample.demo3 to javafx.fxml;
    exports sample.demo3;
}