package com.example.demo2;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Hello1Controller implements Initializable {
    @FXML
    private Button dnhap_login;

    @FXML
    private AnchorPane dnhap_loginform;

    @FXML
    private TextField dnhap_mk;

    @FXML
    private TextField dnhap_tk;

    @FXML
    private AnchorPane login_form;

    @FXML
    private AnchorPane reger_form;

    @FXML
    private StackPane si_loginbtn;

    @FXML
    private AnchorPane side_form;

    @FXML
    private Button side_taotk;

    @FXML
    private Button side_tieptuc;

    @FXML
    private TextField tk_gmail;

    @FXML
    private TextField tk_mk;

    @FXML
    private TextField tk_tk;

    @FXML
    private Button tk_xacnhan;

    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;
    @FXML
    public void switchForm(ActionEvent e) {
        if (e.getSource() == side_taotk) {
                login_form.setVisible(false);
                reger_form.setVisible(true);
                dnhap_tk.setText("");
                dnhap_mk.setText("");


        } else {
            if (e.getSource() == side_tieptuc) {
                    login_form.setVisible(true);
                    reger_form.setVisible(false);
                    tk_tk.setText("");
                    tk_mk.setText("");
                    tk_gmail.setText("");
            }
        }
    }

    @FXML
    public void loginMain(){
        connect =  Connectxampp.connectDb();

        String sql = "SELECT * FROM taikhoan WHERE name = ? and matkhau = ?";

        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, dnhap_tk.getText());
            prepare.setString(2, dnhap_mk.getText());

            result = prepare.executeQuery();
            if(result.next()) {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("quanli.fxml"));
        Stage stage = new Stage();
        Scene scene = null;
        scene = new Scene(fxmlLoader.load(), 1200, 700);
        stage.setTitle("Quản lí!");
        stage.setScene(scene);
        stage.show();
        si_loginbtn.getScene().getWindow().hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            }
            else{
                dnhap_tk.setText("");
                dnhap_mk.setText("");
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Thông tin đăng nhập sai!");
                alert.showAndWait();
            }


        }catch(Exception e){

        }

    }
    public boolean check(String s){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM taikhoan WHERE name = ?";
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, s);

            result = prepare.executeQuery();
            if(result.next()) {
                return true;
            }
        }catch(Exception e){

        }
        return false;
    }
    @FXML
    public void createTK(){
        connect = Connectxampp.connectDb();

        String sql = "INSERT INTO taikhoan (name,matkhau,gmail) VALUES(?,?,?)";
        try{
            if(check(tk_tk.getText())){
                tk_tk.setText("");
                tk_mk.setText("");
                tk_gmail.setText("");
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Tài khoản đã tồn tại");
                alert.showAndWait();
                return;
            }
        }  catch (Exception e){

    }
                try {
                    if (tk_tk.getText().isEmpty()
                            | tk_mk.getText().isEmpty()
                            | tk_gmail.getText().isEmpty()
                            | !tk_gmail.getText().endsWith("@gmail.com")) {
                        tk_tk.setText("");
                        tk_mk.setText("");
                        tk_gmail.setText("");
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Thông báo lỗi");
                        alert.setHeaderText(null);
                        alert.setContentText("Vui lòng nhập lại thông tin!\n(gmail phải có đuôi @gmail.con)");
                        alert.showAndWait();
                    }
                    else{
                        prepare = connect.prepareStatement(sql);
                        prepare.setString(1, tk_tk.getText());
                        prepare.setString(2, tk_mk.getText());
                        prepare.setString(3, tk_gmail.getText());
                        prepare.execute();
                        tk_tk.setText("");
                        tk_mk.setText("");
                        tk_gmail.setText("");

                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Thông báo");
                        alert.setHeaderText(null);
                        alert.setContentText("Đăng kí thành công!");
                        alert.showAndWait();
                    }
                }catch (Exception e){

                }

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
