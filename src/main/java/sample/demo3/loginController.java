package sample.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class loginController {

    @FXML
    private TextField email;

    @FXML
    private Button login;

    @FXML
    private PasswordField pass;

    @FXML
    private Button signup;
    @FXML
    void onClick(ActionEvent event) {
        try {
            FXMLLoader firstPageLoader = new FXMLLoader(loginController.class.getResource("firstpage.fxml"));
            Stage stage = (Stage) login.getScene().getWindow();
            Scene firstPageScene = new Scene(firstPageLoader.load());
            stage.setScene(firstPageScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String emailid = email.getText();
        String passwords = pass.getText();
        saveToadmin(emailid,passwords);


    }


    private void saveToadmin(String Email, String password) {
        String sql = "INSERT INTO  login (Email, password) VALUES (?, ?)";




        try (Connection connection = DatabaseConnecter.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ((PreparedStatement) preparedStatement).setString(1, Email);
            preparedStatement.setString(2, password);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    @FXML
    void onClicking(ActionEvent event) {
        try {
            FXMLLoader signPageLoader = new FXMLLoader(loginController.class.getResource("signin.fxml"));
            Stage stage = (Stage) login.getScene().getWindow();
            Scene signPageScene = new Scene(signPageLoader.load());
            stage.setScene(signPageScene);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




        @FXML
        private TextField rmail;

        @FXML
        private TextField rname;

        @FXML
        private TextField rpass;

        @FXML
        private TextField rsname;

        @FXML
        private Button signin1;

        @FXML
        void click(ActionEvent event) {
            try {
                FXMLLoader firstPageLoader1 = new FXMLLoader(loginController.class.getResource("firstpage.fxml"));
                Stage stage3 = (Stage) signin1.getScene().getWindow();
                Scene firstPageScene1 = new Scene(firstPageLoader1.load());
                stage3.setScene(firstPageScene1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String remailid = rmail.getText();
            String rnameid = rname.getText();
            String shopname = rsname.getText();
            String rpasswords = rpass.getText();


            saveToadmin1(remailid,rnameid,shopname,rpasswords);

        }
    private void saveToadmin1(String remail, String rname,String rshopname,String  rpassword) {
        String sql = "INSERT INTO signin (remail,rname,rshopname,rpassword) VALUES (?, ?, ?, ?)";




        try (Connection connection = DatabaseConnecter.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ((PreparedStatement) preparedStatement).setString(1, remail);
            preparedStatement.setString(2, rname);
            preparedStatement.setString(3, rshopname);
            preparedStatement.setString(4, rpassword);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }



    @FXML
    private Button ana;

    @FXML
    void click1(ActionEvent event) {
        try {
            FXMLLoader anaPageLoader1 = new FXMLLoader(loginController.class.getResource("analyse.fxml"));
            Stage stage4 = (Stage) ana.getScene().getWindow();
            Scene anaPageScene1 = new Scene(anaPageLoader1.load());
            stage4.setScene(anaPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Button area;

    @FXML
    private Button bar;

    @FXML
    private Button bubble;

    @FXML
    private Button line;

    @FXML
    private Button pie;

    @FXML
    private Button scatter;

    @FXML
    private Button stackedarea;

    @FXML
    private Button stackedbar;

    @FXML
    void click2(ActionEvent event) {
        try {
            FXMLLoader areaPageLoader1 = new FXMLLoader(loginController.class.getResource("area.fxml"));
            Stage stagea = (Stage) area.getScene().getWindow();
            Scene aPageScene1 = new Scene(areaPageLoader1.load());
            stagea.setScene(aPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void click3(ActionEvent event) {
        try {
            FXMLLoader barPageLoader1 = new FXMLLoader(loginController.class.getResource("bar.fxml"));
            Stage stageb = (Stage) bar.getScene().getWindow();
            Scene bPageScene1 = new Scene(barPageLoader1.load());
            stageb.setScene(bPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void click4(ActionEvent event) {
        try {
            FXMLLoader bubPageLoader1 = new FXMLLoader(loginController.class.getResource("bubble.fxml"));
            Stage stagebub = (Stage) bubble.getScene().getWindow();
            Scene bubPageScene1 = new Scene(bubPageLoader1.load());
            stagebub .setScene(bubPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void click5(ActionEvent event) {
        try {
            FXMLLoader lPageLoader1 = new FXMLLoader(loginController.class.getResource("line.fxml"));
            Stage stagel = (Stage) line.getScene().getWindow();
            Scene lPageScene1 = new Scene(lPageLoader1.load());
            stagel.setScene(lPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @FXML
    void click6(ActionEvent event) {
        try {
            FXMLLoader pPageLoader1 = new FXMLLoader(loginController.class.getResource("pie.fxml"));
            Stage stagep = (Stage) pie.getScene().getWindow();
            Scene pPageScene1 = new Scene(pPageLoader1.load());
            stagep.setScene(pPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void click7(ActionEvent event) {
        try {
            FXMLLoader scaPageLoader1 = new FXMLLoader(loginController.class.getResource("scatter.fxml"));
            Stage stagesca = (Stage) scatter.getScene().getWindow();
            Scene scaPageScene1 = new Scene(scaPageLoader1.load());
            stagesca.setScene(scaPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void click8(ActionEvent event) {
        try {
            FXMLLoader saPageLoader1 = new FXMLLoader(loginController.class.getResource("sarea.fxml"));
            Stage stagesa = (Stage) stackedarea.getScene().getWindow();
            Scene saPageScene1 = new Scene(saPageLoader1.load());
            stagesa.setScene(saPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void click9(ActionEvent event) {
        try {
            FXMLLoader sbPageLoader1 = new FXMLLoader(loginController.class.getResource("sbar.fxml"));
            Stage stagesb = (Stage) stackedbar.getScene().getWindow();
            Scene sbPageScene1 = new Scene(sbPageLoader1.load());
            stagesb.setScene(sbPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    private Button crea;

    @FXML
    void crea(ActionEvent event) {
        try {
            FXMLLoader csPageLoader1 = new FXMLLoader(loginController.class.getResource("creasurvey.fxml"));
            Stage stagecs = (Stage) crea.getScene().getWindow();
            Scene csPageScene1 = new Scene(csPageLoader1.load());
            stagecs.setScene(csPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    private Button add;



    @FXML
    private Button createsurvey;

    @FXML
    private TextField q1;

    @FXML
    private TextField q1o1;

    @FXML
    private TextField q1o2;

    @FXML
    private TextField q2;

    @FXML
    private TextField q2o1;

    @FXML
    private TextField q2o2;

    @FXML
    private TextField surveyid;






    @FXML
    void csurvey(ActionEvent event) {
        String Surveyid = surveyid.getText();
        String ques1 = q1.getText();
        String ques1o1 = q1o1.getText();
        String ques1o2 = q1o2.getText();
        String ques2 = q2.getText();
        String ques2o1 = q2o1.getText();
        String ques2o2 = q2o2.getText();

        saveToadmin2(Surveyid,ques1,ques1o1,ques1o2,ques2,ques2o1,ques2o2);

    }

    private void saveToadmin2(String Sid, String Sq1,String Sq1o1,String Sq1o2,String Sq2,String Sq2o1,String Sq2o2) {
        String sql = "INSERT INTO survey (Sid,Sq1,Sq1o1,Sq1o2,Sq2,Sq2o1,Sq2o2) VALUES (?, ?, ?, ?, ?, ?, ?)";




        try (Connection connection = DatabaseConnecter.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ((PreparedStatement) preparedStatement).setString(1, Sid);
            preparedStatement.setString(2, Sq1);
            preparedStatement.setString(3, Sq1o1);
            preparedStatement.setString(4, Sq1o2);
            preparedStatement.setString(5, Sq2);
            preparedStatement.setString(6, Sq2o1);
            preparedStatement.setString(7, Sq2o2);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    @FXML
    private Button anaa;

    @FXML
    void clicka(ActionEvent event) {
        try {
            FXMLLoader siPageLoader1 = new FXMLLoader(loginController.class.getResource("surveyid.fxml"));
            Stage stagesi = (Stage) crea.getScene().getWindow();
            Scene siPageScene1 = new Scene(siPageLoader1.load());
            stagesi.setScene(siPageScene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

