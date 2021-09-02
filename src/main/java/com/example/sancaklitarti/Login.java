package com.example.sancaklitarti;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.jar.Manifest;

public class Login {

    public Login(){

    }

    @FXML
    private Button loginButton;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();

    }
    private void checkLogin() throws IOException{
        Main m =new Main();
        if (username.getText().toString().equals("ahmet") && password.getText().toString().equals("123")){
            wrongLogin.setText("Giriş Başarılı");

            m.changeScene("afterLogin.fxml");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogin.setText("Lütfen Giriş Yapın.");
        }
        else{
            wrongLogin.setText("Kullanıcı Adı veya Şifre Hatalı!");
        }
    }

}
