package com.example.demo2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.*;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import java.io.File;
import java.time.LocalDate;
import java.util.Date;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class quanli {
    @FXML
    private ImageView anhqr;

    @FXML
    private Label soluong101;

    @FXML
    private Label soluong102;

    @FXML
    private Label soluong103;

    @FXML
    private Label soluong104;

    @FXML
    private Label soluong105;

    @FXML
    private Label soluong106;

    @FXML
    private Label soluong201;

    @FXML
    private Label soluong202;

    @FXML
    private Label soluong203;

    @FXML
    private Label soluong204;

    @FXML
    private Label soluong205;

    @FXML
    private Label soluong206;

    @FXML
    private Label soluong301;

    @FXML
    private Label soluong302;

    @FXML
    private Label soluong303;

    @FXML
    private Label soluong304;

    @FXML
    private Label soluong305;

    @FXML
    private Label soluong306;

    @FXML
    private Label soluong401;

    @FXML
    private Label soluong402;

    @FXML
    private Label soluong403;

    @FXML
    private Label soluong404;

    @FXML
    private Label soluong405;

    @FXML
    private Label soluong406;

    @FXML
    private Button tang1;

    @FXML
    private AnchorPane tang1_form;

    @FXML
    private Button tang2;

    @FXML
    private AnchorPane tang2_form;

    @FXML
    private Button tang3;

    @FXML
    private AnchorPane tang3_form;

    @FXML
    private Button tang4;

    @FXML
    private AnchorPane tang4_form;

    @FXML
    private AnchorPane main_form;
    @FXML
    private ImageView anhsinhvien;
    @FXML
    private Button chonanh;
    @FXML
    private TableView<dichvudata> dichvu_bang;
    @FXML
    private TableColumn<dichvudata, String> dichvubang_chucnang;

    @FXML
    private TableColumn<dichvudata, Integer> dichvubang_gia;

    @FXML
    private TableColumn<dichvudata, String> dichvubang_id;

    @FXML
    private TableColumn<dichvudata, String> dichvubang_ten;

    @FXML
    private TextField dichvu_chucnag;

    @FXML
    private TextField dichvu_gia;

    @FXML
    private TextField dichvu_ma;

    @FXML
    private TextField dichvu_maphong;

    @FXML
    private Button dichvu_sua;

    @FXML
    private TextField dichvu_ten;

    @FXML
    private Button dichvu_them;

    @FXML
    private Button dichvu_themphong;

    @FXML
    private TableView<?> dichvu_tinhtien;

    @FXML
    private TextField dichvu_tongtien;

    @FXML
    private Button dichvu_xoa;

    @FXML
    private Button dichvu_xoahet;

    @FXML
    private Button dichvu_xoatien;

    @FXML
    private AnchorPane form_chao;

    @FXML
    private AnchorPane form_dichvu;

    @FXML
    private AnchorPane form_phong;

    @FXML
    private AnchorPane form_quantuc;

    @FXML
    private AnchorPane form_sinhvien;

    @FXML
    private AnchorPane form_tongquat;

    @FXML
    private AnchorPane form_xe;

    @FXML
    private Button ql_dichvu;

    @FXML
    private Button ql_phong;

    @FXML
    private Button ql_quantuc;

    @FXML
    private Button ql_sinhvien;

    @FXML
    private Button ql_tongquan;

    @FXML
    private Button ql_xe;

    @FXML
    private TableView<Quantucdata> quantuc_bang;

    @FXML
    private TableColumn<Quantucdata, String> quantuc_banggioitinh;

    @FXML
    private TableColumn<Quantucdata, Integer> quantuc_bangluong;

    @FXML
    private TableView<quantucnghi> quantuc_bangnghi;
    @FXML
    private TableColumn<quantucnghi, String> quantucnghi_id;

    @FXML
    private TableColumn<quantucnghi, String> quantucnghi_name;

    @FXML
    private TableColumn<Quantucdata, String> quantuc_bangsid;

    @FXML
    private TableColumn<Quantucdata, String> quantuc_bangsodt;

    @FXML
    private TableColumn<Quantucdata, String> quantuc_bangten;

    @FXML
    private TableColumn<Quantucdata, String> quantuc_bangvaitro;

    @FXML
    private ComboBox<String> quantuc_gioitinh;

    @FXML
    private TextField quantuc_hoten;

    @FXML
    private TextField quantuc_luong;

    @FXML
    private TextField quantuc_ma;

    @FXML
    private TextField quantuc_sdt;

    @FXML
    private Button quantuc_sua;

    @FXML
    private Button quantuc_them;

    @FXML
    private TextField quantuc_vaitro;

    @FXML
    private Button quantuc_xinnghi;

    @FXML
    private Button quantuc_xoa;

    @FXML
    private Button quantuc_xoanghi;

    @FXML
    private Button sinhvien_anh;

    @FXML
    private TableView<sinhviendata> sinhvien_bang;

    @FXML
    private TableColumn<sinhviendata, String> bangsinhvien_gioitinh;

    @FXML
    private TableColumn<sinhviendata, String> bangsinhvien_id;

    @FXML
    private TableColumn<sinhviendata, String> bangsinhvien_name;

    @FXML
    private TableColumn<sinhviendata, Date> bangsinhvien_ngaysinh;
    @FXML
    private TableColumn<sinhviendata, String> bangsinhvien_sodt;
    @FXML
    private TableColumn<sinhviendata, String> bangsinhvien_quequan;

    @FXML
    private TableColumn<sinhviendata, String> bangsinhvien_sophong;

    @FXML
    private TableColumn<sinhviendata, String> bangsinhviensodt;
    @FXML
    private ComboBox<String> sinhvien_gioitinh;

    @FXML
    private TextField sinhvien_hoten;

    @FXML
    private TextField sinhvien_masv;

    @FXML
    private DatePicker sinhvien_ngaysinh;

    @FXML
    private TextField sinhvien_quequan;

    @FXML
    private TextField sinhvien_sodt;

    @FXML
    private TextField sinhvien_sophong;

    @FXML
    private Button sinhvien_sua;

    @FXML
    private Button sinhvien_sxepma;

    @FXML
    private Button sinhvien_sxepten;

    @FXML
    private Button sinhvien_them;

    @FXML
    private TextField sinhvien_timkiem;

    @FXML
    private Button sinhvien_xoa;


    @FXML
    private Label soluongdichvu;

    @FXML
    private Label soluongquantuc;

    @FXML
    private Label soluongquantucnghi;

    @FXML
    private Label soluongsinhvien;

    @FXML
    private Label soluongvitritrong;

    @FXML
    private Label soluongxe;

    @FXML
    private TableView<xedata> xe_bang;
    @FXML
    private TableColumn<xedata, String> bangxe_bienso;

    @FXML
    private TableColumn<xedata, Integer> bangxe_dadong;

    @FXML
    private TableColumn<xedata, Integer> bangxe_giathue;

    @FXML
    private TableColumn<xedata, String> bangxe_loaixe;

    @FXML
    private TableColumn<xedata, String> bangxe_ma;

    @FXML
    private TableColumn<xedata, String> bangxe_mota;
    @FXML
    private TextField xe_bien;

    @FXML
    private TextField xe_dadong;

    @FXML
    private TextField xe_giathue;

    @FXML
    private TextField xe_loaixe;

    @FXML
    private TextField xe_masinhvien;

    @FXML
    private TextField xe_mota;
    @FXML
    private PieChart xe_bieudo;

    @FXML
    private Button xe_sua;

    @FXML
    private Button xe_them;

    @FXML
    private Button xe_xoa;
    @FXML
    private ImageView xe_hienthianh;

    @FXML
    private Label xe_hienthihoten;

    @FXML
    private Label xe_hienthimsv;
    @FXML
    private TableView<dichvudata> tinhtien_dichvu;

    @FXML
    private TableColumn<dichvudata, Integer> tinhtien_giatien;

    @FXML
    private TableColumn<dichvudata, String> tinhtien_madv;

    @FXML
    private TableColumn<dichvudata, String> tinhtien_tendv;

    @FXML
    private TextField tinhtien_tongtien;

    @FXML
    private Button tinhtien_xoa;

    @FXML
    private TableView<dichvudata> phong_bangdichvu;

    @FXML
    private TableView<phong_sinhvien> phong_bangsinhvien;

    @FXML
    private TableColumn<phong_sinhvien, String> phong_hoten;

    @FXML
    private TableColumn<dichvudata, String> phong_madichvu;

    @FXML
    private TableColumn<phong_sinhvien, String> phong_masinhvien;

    @FXML
    private TableColumn<dichvudata, String> phong_tendichvu;



    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;

    private Image image;


    private String[] gioitinh = {"Nam", "Nữ"};

    @FXML
    public void taogioitinhquantuc() {
        List<String> listCat = new ArrayList<>();

        for (String data : gioitinh) {
            listCat.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listCat);
        quantuc_gioitinh.setItems(listData);
    }

    // MERGE ALL DATAS
    public ObservableList<Quantucdata> taoListquantuc() {

        ObservableList<Quantucdata> listData = FXCollections.observableArrayList();

        String sql = "SELECT quantuc.id,quantuc.name,quantuc.gioitinh,quantuc.sodt,quantuc.vaitro,quantuc.luong FROM quantuc LEFT JOIN quantucnghi ON quantuc.id = quantucnghi.id WHERE quantucnghi.id IS NULL;";

        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            Quantucdata qtData;

            while (result.next()) {

                qtData = new Quantucdata(result.getString("id"),
                        result.getString("name"),
                        result.getString("gioitinh"),
                        result.getString("sodt"),
                        result.getString("vaitro"),
                        result.getInt("luong"));

                listData.add(qtData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    private ObservableList<Quantucdata> quantucdatalist;
    public void hienthiquantuc(){
        quantucdatalist = taoListquantuc();
        quantuc_bangsid.setCellValueFactory(new PropertyValueFactory<>("id"));
        quantuc_bangten.setCellValueFactory(new PropertyValueFactory<>("name"));
        quantuc_banggioitinh.setCellValueFactory(new PropertyValueFactory<>("gioitinh"));
        quantuc_bangsodt.setCellValueFactory(new PropertyValueFactory<>("sodt"));
        quantuc_bangvaitro.setCellValueFactory(new PropertyValueFactory<>("vaitro"));
        quantuc_bangluong.setCellValueFactory(new PropertyValueFactory<>("luong"));
        quantuc_bang.setItems(quantucdatalist);
    }
    public boolean check(String s){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM quantuc WHERE id=?";
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

    public void quantucthem(){
        connect = Connectxampp.connectDb();
        String sql = "INSERT INTO quantuc (id,name,gioitinh,sodt,vaitro,luong) VALUES(?,?,?,?,?,?)";
        try{
            if(check(quantuc_ma.getText())){
                quantuc_hoten.setText("");
                quantuc_ma.setText("");
                quantuc_vaitro.setText("");
                quantuc_sdt.setText("");
                quantuc_luong.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Mã nhân viên đã tồn tại");
                alert.showAndWait();
                return;
            }
        }  catch (Exception e){

        }
        try{

                if (quantuc_luong.getText().isEmpty()
                        | quantuc_vaitro.getText().isEmpty()
                        | quantuc_sdt.getText().isEmpty()
                        | quantuc_ma.getText().isEmpty()
                |quantuc_hoten.getText().isEmpty()) {
                    quantuc_hoten.setText("");
                    quantuc_ma.setText("");
                    quantuc_vaitro.setText("");
                    quantuc_sdt.setText("");
                    quantuc_luong.setText("");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Thông báo lỗi");
                    alert.setHeaderText(null);
                    alert.setContentText("Vui lòng nhập lại thông tin!");
                    alert.showAndWait();
                }
                else{
                    prepare = connect.prepareStatement(sql);
                    prepare.setString(1, quantuc_ma.getText());
                    prepare.setString(2, quantuc_hoten.getText());
                    prepare.setString(3, (String) quantuc_gioitinh.getSelectionModel().getSelectedItem());
                    prepare.setString(4, quantuc_sdt.getText());
                    prepare.setString(5, quantuc_vaitro.getText());
                    prepare.setString(6, quantuc_luong.getText());
                    prepare.execute();
                    quantuc_hoten.setText("");
                    quantuc_ma.setText("");
                    quantuc_vaitro.setText("");
                    quantuc_sdt.setText("");
                    quantuc_luong.setText("");
                    hienthiquantuc();
                }

        }catch (Exception e){

        }
    }
    @FXML
    public void quantucsua(){
        connect = Connectxampp.connectDb();
        String sql = "UPDATE quantuc SET id=?,name=?,gioitinh=?,sodt=?,vaitro=?,luong=? WHERE id=?";
        Quantucdata selectedObject = quantuc_bang.getSelectionModel().getSelectedItem();
        try{
            if(selectedObject==null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
                return;
            }
        }catch (Exception e){
        }
        try{
            if(check(quantuc_ma.getText())){
                quantuc_hoten.setText("");
                quantuc_ma.setText("");
                quantuc_vaitro.setText("");
                quantuc_sdt.setText("");
                quantuc_luong.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Mã nhân viên đã tồn tại");
                alert.showAndWait();
                return;
            }
        }  catch (Exception e){

        }
        try{

            if (quantuc_luong.getText().isEmpty()
                    | quantuc_vaitro.getText().isEmpty()
                    | quantuc_sdt.getText().isEmpty()
                    | quantuc_ma.getText().isEmpty()
                    |quantuc_hoten.getText().isEmpty()) {
                quantuc_hoten.setText("");
                quantuc_ma.setText("");
                quantuc_vaitro.setText("");
                quantuc_sdt.setText("");
                quantuc_luong.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập lại thông tin!");
                alert.showAndWait();
            }
            else{
                prepare = connect.prepareStatement(sql);

                prepare.setString(1, quantuc_ma.getText());
                prepare.setString(2, quantuc_hoten.getText());
                prepare.setString(3, (String) quantuc_gioitinh.getSelectionModel().getSelectedItem());
                prepare.setString(4, quantuc_sdt.getText());
                prepare.setString(5, quantuc_vaitro.getText());
                prepare.setString(6, quantuc_luong.getText());
                prepare.setString(7, selectedObject.getId());
                prepare.execute();
                quantuc_hoten.setText("");
                quantuc_ma.setText("");
                quantuc_vaitro.setText("");
                quantuc_sdt.setText("");
                quantuc_luong.setText("");
                hienthiquantuc();
            }

        }catch (Exception e){

        }
    }
    @FXML
    public void quantucxoa() {
        connect = Connectxampp.connectDb();
        Quantucdata selectedObject = quantuc_bang.getSelectionModel().getSelectedItem();
        String sql = "DELETE FROM quantuc WHERE id = ?" ;
        try {
            if (selectedObject != null) {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, selectedObject.getId());
                prepare.execute();
                hienthiquantuc();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
            }
        }
        catch(Exception e){

            }
    }
    @FXML
    public void quantucnghixoa() {
        connect = Connectxampp.connectDb();
        quantucnghi selectedObject = quantuc_bangnghi.getSelectionModel().getSelectedItem();
        String sql = "DELETE FROM quantucnghi WHERE id = ?" ;
        try {
            if (selectedObject != null) {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, selectedObject.getId());
                prepare.execute();
                hienthiquantuc();
                hienthiquantucnghi();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
            }
        }
        catch(Exception e){

        }
    }
    @FXML
    public void quantucxinnghi() {
        connect = Connectxampp.connectDb();
        Quantucdata selectedObject = quantuc_bang.getSelectionModel().getSelectedItem();
        String sql = "INSERT INTO quantucnghi (id, name) VALUES (?,?)" ;
        try {
            if (selectedObject != null) {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, selectedObject.getId());
                prepare.setString(2, selectedObject.getName());
                prepare.execute();
                hienthiquantuc();
                hienthiquantucnghi();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
            }
        }
        catch(Exception e){

        }
    }

    public ObservableList<quantucnghi> taolistquantucnghi() {

        ObservableList<quantucnghi> listData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM quantucnghi";

        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            quantucnghi qtData;

            while (result.next()) {

                qtData = new quantucnghi(result.getString("id"),
                        result.getString("name"));

                listData.add(qtData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    private ObservableList<quantucnghi> quantucnghilist;
    public void hienthiquantucnghi(){
        quantucnghilist = taolistquantucnghi();

        quantucnghi_id.setCellValueFactory(new PropertyValueFactory<>("id"));
       quantucnghi_name.setCellValueFactory(new PropertyValueFactory<>("name"));

        quantuc_bangnghi.setItems(quantucnghilist);
    }



    // xe
    public ObservableList<xedata> taolistxedata() {

        ObservableList<xedata> listData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM xe";

        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            xedata qtData;
            int dem=1;
            while (result.next()) {

                qtData = new xedata(String.format("EX%03d",dem),
                        result.getString("bienso"),
                        result.getString("masv"),
                        result.getString("loaixe"),
                        result.getString("mota"),
                        result.getInt("giathue"),
                        result.getInt("dadong"));
                dem++;
                listData.add(qtData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
//    private String id,bienso, masv, loaixe,mota;
//    private Integer giathue,dadong;
    private ObservableList<xedata> xelist;
    public void hienthixe(){
        hienthibieudoxe();
        xelist = taolistxedata();
        bangxe_ma.setCellValueFactory(new PropertyValueFactory<>("id"));
        bangxe_bienso.setCellValueFactory(new PropertyValueFactory<>("bienso"));
        bangxe_loaixe.setCellValueFactory(new PropertyValueFactory<>("loaixe"));
        bangxe_mota.setCellValueFactory(new PropertyValueFactory<>("mota"));
        bangxe_giathue.setCellValueFactory(new PropertyValueFactory<>("giathue"));
        bangxe_dadong.setCellValueFactory(new PropertyValueFactory<>("dadong"));
        xe_bang.setItems(xelist);
    }
    public boolean check1(String s){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM sinhvien WHERE id=?";
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, s);

            result = prepare.executeQuery();
            if(result.next()) {
                return false;
            }
        }catch(Exception e){

        }
        return true;
    }
    public boolean checktontaisinhvienthuexe(String s){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM xe WHERE masv=?";
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
    public boolean checkdayxe(){
        String sql1 ="SELECT COUNT(*) from xe ";
        connect = Connectxampp.connectDb();
        try {
            prepare = connect.prepareStatement(sql1);
            result = prepare.executeQuery();
            if (result.next()) {
                int res = Integer.parseInt(result.getString("COUNT(*)"));
                if (res>=200){
                    return true;
                }
            }
        }catch (Exception e){

        }
        return false;
    }
    public void xethem(){
        connect = Connectxampp.connectDb();
        String sql = "INSERT INTO xe (bienso,masv,loaixe,mota,giathue,dadong) VALUES(?,?,?,?,?,?)";
        try{
            if(check1(xe_masinhvien.getText())){
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Không tồn tại mã sinh viên đã nhập");
                alert.showAndWait();
                return;
            }
            if(checktontaisinhvienthuexe(xe_masinhvien.getText())){
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Sinh viên này đã gửi 1 xe khác.");
                alert.showAndWait();
                return;
            }
            if(checkdayxe()){
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Đã hết chỗ để xe");
                alert.showAndWait();
                return;
            }

        }  catch (Exception e){

        }
        try{

            if (xe_bien.getText().isEmpty()
                    | xe_masinhvien.getText().isEmpty()
                    | xe_mota.getText().isEmpty()
                    | xe_loaixe.getText().isEmpty()
                    |xe_giathue.getText().isEmpty()
            |xe_dadong.getText().isEmpty()) {
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập lại thông tin!");
                alert.showAndWait();
            }
            else{
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, xe_bien.getText());
                prepare.setString(2, xe_masinhvien.getText());
                prepare.setString(3, xe_loaixe.getText());
                prepare.setString(4, xe_mota.getText());
                prepare.setString(5, xe_giathue.getText());
                prepare.setString(6, xe_dadong.getText());
                prepare.execute();
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                xoahienthichuxe();
                hienthixe();
            }

        }catch (Exception e){

        }
    }

    public void xesua(){
        connect = Connectxampp.connectDb();
        String sql = "UPDATE xe SET bienso=?,masv=?,loaixe=?,mota=?,giathue=?,dadong=? WHERE bienso=?";
        xedata selectedObject = xe_bang.getSelectionModel().getSelectedItem();
        try{
            if(selectedObject==null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
                return;
            }
        }catch (Exception e){
        }
        try{
            if(check1(xe_masinhvien.getText())){
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Không tồn tại mã sinh viên đã nhập");
                alert.showAndWait();
                return;
            }
            if(checktontaisinhvienthuexe(xe_masinhvien.getText())){
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Sinh viên này đã gửi 1 xe khác.");
                alert.showAndWait();
                return;
            }
            if (xe_bien.getText().isEmpty()
                    | xe_masinhvien.getText().isEmpty()
                    | xe_mota.getText().isEmpty()
                    | xe_loaixe.getText().isEmpty()
                    |xe_giathue.getText().isEmpty()
                    |xe_dadong.getText().isEmpty()) {
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập lại thông tin!");
                alert.showAndWait();
            }
            else{
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, xe_bien.getText());
                prepare.setString(2, xe_masinhvien.getText());
                prepare.setString(3, xe_loaixe.getText());
                prepare.setString(4, xe_mota.getText());
                prepare.setString(5, xe_giathue.getText());
                prepare.setString(6, xe_dadong.getText());
                prepare.setString(7, selectedObject.getBienso());
                prepare.execute();
                xe_bien.setText("");
                xe_dadong.setText("");
                xe_giathue.setText("");
                xe_loaixe.setText("");
                xe_masinhvien.setText("");
                xe_mota.setText("");
                xoahienthichuxe();
                hienthixe();
            }

        }catch (Exception e){

        }
    }

    public void xexoa() {
        connect = Connectxampp.connectDb();
        xedata selectedObject = xe_bang.getSelectionModel().getSelectedItem();
        String sql = "DELETE FROM xe WHERE bienso = ?" ;
        try {
            if (selectedObject != null) {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, selectedObject.getBienso());
                prepare.execute();
                xoahienthichuxe();
                hienthixe();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
            }
        }
        catch(Exception e){

        }
    }
    public void xoahienthichuxe(){
        xe_hienthimsv.setText("");
        xe_hienthihoten.setText("");
        xe_hienthianh.setImage(null);
    }
    public void chonmotxe(){
        xedata xe = xe_bang.getSelectionModel().getSelectedItem();
        int num = xe_bang.getSelectionModel().getSelectedIndex();

        String sql = "SELECT sinhvien.id, sinhvien.name, sinhvien.anh FROM sinhvien WHERE id=?";

        String sql1 ="SELECT xe.masv from xe where bienso=?";
        connect = Connectxampp.connectDb();
        sinhviendata sinhvien;
        if((num - 1) < -1 | xe==null){

            return; }
        try{

            prepare = connect.prepareStatement(sql1);
            prepare.setString(1,xe.getBienso());
            result = prepare.executeQuery();
            String res="";
            if(result.next()) {
                 res = result.getString("masv");
            } else{
                System.out.println("mtagi");
            }
            prepare = connect.prepareStatement(sql);
            prepare.setString(1,res);
            result = prepare.executeQuery();

            if(result.next()) {
                System.out.println("thang2");
                System.out.println(result.getString("id"));
                System.out.println(result.getString("name"));


                sinhvien = new sinhviendata(result.getString("id"),
                        result.getString("name"),
                        " ",
                        null,
                        " ", "", "", result.getString("anh"));
                data.path = sinhvien.getAnh();

                String uri = "file:" + sinhvien.getAnh();

                image = new Image(uri, 112, 137, false, true);
                xe_hienthimsv.setText(sinhvien.getId());
                xe_hienthihoten.setText(sinhvien.getName());
                xe_hienthianh.setImage(image);
            }


        }
        catch (Exception e){

        }


    }

    public void hienthibieudoxe(){

        String sql ="SELECT COUNT(*) from xe ";
        connect = Connectxampp.connectDb();
        try{
            prepare=connect.prepareStatement(sql);
            result=prepare.executeQuery();
            if(result.next()){
                int res=Integer.parseInt(result.getString("COUNT(*)"));
                PieChart.Data dadung =new PieChart.Data(String.format("Đã dùng: %d",res), res);
                int ans=200-res;
                PieChart.Data controng =new PieChart.Data(String.format("Còn trống: %d",ans), ans);
                xe_bieudo.getData().clear();
                xe_bieudo.getData().addAll(dadung,controng);
            }
        }catch (Exception e){

        }
    }


    //dichvu

    public ObservableList<dichvudata> taolistdichvudata() {

        ObservableList<dichvudata> listData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM dichvu";

        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            dichvudata qtData;
            while (result.next()) {

                qtData = new dichvudata(
                        result.getString("id"),
                        result.getString("name"),
                        result.getString("chucnang"),
                        result.getInt("giatien"));

                listData.add(qtData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    //    private String id,bienso, masv, loaixe,mota;
//    private Integer giathue,dadong;
    private ObservableList<dichvudata> dichvulist;
    public void hienthidichvu(){
        dichvulist = taolistdichvudata();

        dichvubang_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        dichvubang_ten.setCellValueFactory(new PropertyValueFactory<>("name"));
        dichvubang_chucnang.setCellValueFactory(new PropertyValueFactory<>("chucnang"));
        dichvubang_gia.setCellValueFactory(new PropertyValueFactory<>("giatien"));
        dichvu_bang.setItems(dichvulist);
    }
    public boolean check2(String s){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM phong WHERE id=?";
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, s);

            result = prepare.executeQuery();
            if(result.next()) {
                return false;
            }
        }catch(Exception e){

        }
        return true;
    }
    public void dichvuthem(){
        connect = Connectxampp.connectDb();
        String sql = "INSERT INTO dichvu(id,name,chucnang,giatien) VALUES(?,?,?,?)";

        try{

            if (dichvu_chucnag.getText().isEmpty()
                    | dichvu_gia.getText().isEmpty()
                    | dichvu_ma.getText().isEmpty()
                    | dichvu_ten.getText().isEmpty()) {
                dichvu_chucnag.setText("");
                dichvu_ten.setText("");
                dichvu_ma.setText("");
                dichvu_gia.setText("");

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập lại thông tin!");
                alert.showAndWait();
            }
            else{
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, dichvu_ma.getText());
                prepare.setString(2, dichvu_ten.getText());
                prepare.setString(3, dichvu_chucnag.getText());
                prepare.setString(4, dichvu_gia.getText());
                prepare.execute();
                dichvu_chucnag.setText("");
                dichvu_ten.setText("");
                dichvu_ma.setText("");
                dichvu_gia.setText("");
                hienthidichvu();
            }

        }catch (Exception e){

        }
    }

    public void dichvusua(){
        connect = Connectxampp.connectDb();
        String sql = "UPDATE dichvu SET id=?,name=?,chucnang=?,giatien=? WHERE id=?";
        dichvudata selectedObject = dichvu_bang.getSelectionModel().getSelectedItem();
        try{
            if(selectedObject==null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
                return;
            }
        }catch (Exception e){
        }
        try{
            if (dichvu_chucnag.getText().isEmpty()
                    | dichvu_gia.getText().isEmpty()
                    | dichvu_ma.getText().isEmpty()
                    | dichvu_ten.getText().isEmpty()) {
                dichvu_chucnag.setText("");
                dichvu_ten.setText("");
                dichvu_ma.setText("");
                dichvu_gia.setText("");

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập lại thông tin!");
                alert.showAndWait();
            }
            else{
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, dichvu_ma.getText());
                prepare.setString(2, dichvu_ten.getText());
                prepare.setString(3, dichvu_chucnag.getText());
                prepare.setString(4, dichvu_gia.getText());
                prepare.execute();
                dichvu_chucnag.setText("");
                dichvu_ten.setText("");
                dichvu_ma.setText("");
                dichvu_gia.setText("");
                hienthidichvu();
            }


        }catch (Exception e){

        }
    }

    public void dichvuxoa() {
        connect = Connectxampp.connectDb();
        dichvudata selectedObject = dichvu_bang.getSelectionModel().getSelectedItem();
        String sql = "DELETE FROM dichvu WHERE id = ?" ;
        try {
            if (selectedObject != null) {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, selectedObject.getId());
                prepare.execute();
                hienthidichvu();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
            }
        }
        catch(Exception e){

        }
    }







//    Sinhvien
@FXML
public void taogioitinhsinhvien() {
    List<String> listCat = new ArrayList<>();

    for (String data : gioitinh) {
        listCat.add(data);
    }

    ObservableList listData = FXCollections.observableArrayList(listCat);
    sinhvien_gioitinh.setItems(listData);
}

    // MERGE ALL DATAS
    public ObservableList<sinhviendata> taoListsinhvien() {

        ObservableList<sinhviendata> listData = FXCollections.observableArrayList();
        String s=sinhvien_timkiem.getText();
        String sql = "SELECT * FROM sinhvien WHERE name like '%" +s+"' or name like'" +s+ "%' or name like '%"+ s +"%'";
        connect = Connectxampp.connectDb();
        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            sinhviendata qtData;

            while (result.next()) {

                qtData = new sinhviendata(
                        result.getString("id"),
                        result.getString("name"),
                        result.getString("gioitinh"),
                        result.getDate("ngaysinh"),
                        result.getString("quequan"),
                        result.getString("sodt"),
                        result.getString("sophong"),
                        result.getString("anh"));

                listData.add(qtData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    private ObservableList<sinhviendata> sinhviendatalist;
    public void hienthisinhvien(){
        sinhviendatalist = taoListsinhvien();

        bangsinhvien_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        bangsinhvien_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        bangsinhvien_gioitinh.setCellValueFactory(new PropertyValueFactory<>("gioitinh"));
        bangsinhvien_ngaysinh.setCellValueFactory(new PropertyValueFactory<>("ngaysinh"));
        bangsinhvien_quequan.setCellValueFactory(new PropertyValueFactory<>("quequan"));
        bangsinhvien_sodt.setCellValueFactory(new PropertyValueFactory<>("sodt"));
        bangsinhvien_sophong.setCellValueFactory(new PropertyValueFactory<>("sophong"));
        sinhvien_bang.setItems(sinhviendatalist);
    }

    public boolean checkidsinhvien(String s){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM sinhvien WHERE id=?";
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
    public boolean checkdaysinhvien(){
        String sql1 ="SELECT COUNT(*) from sinhvien ";
        connect = Connectxampp.connectDb();
        try {
            prepare = connect.prepareStatement(sql1);
            result = prepare.executeQuery();
            if (result.next()) {
                int res = Integer.parseInt(result.getString("COUNT(*)"));
                if (res>=8*6*4){
                    return true;
                }
            }
        }catch (Exception e){

        }
        return false;
    }
    public boolean checkdayphong(String s){
        String sql1 ="SELECT COUNT(*) from sinhvien where sinhvien.sophong=?";
        connect = Connectxampp.connectDb();
        try {
            prepare = connect.prepareStatement(sql1);
            prepare.setString(1,s);
            result = prepare.executeQuery();
            if (result.next()) {
                int res = Integer.parseInt(result.getString("COUNT(*)"));
                if (res>=8){
                    return true;
                }
            }
        }catch (Exception e){

        }
        return false;
    }

    public void themanhsinhvien(){

        FileChooser open = new FileChooser();
        open.setTitle("Open Image File");
        open.getExtensionFilters().add(new FileChooser.ExtensionFilter("File Image", "*jpg", "*png"));

        File file = open.showOpenDialog(main_form.getScene().getWindow());

        if(file != null){
            data.path = file.getAbsolutePath();

            image = new Image(file.toURI().toString(), 112, 137, false, true);
            anhsinhvien.setImage(image);
        }

    }
    public void sinhvienclear(){
        sinhvien_masv.setText("");
        sinhvien_hoten.setText("");
        sinhvien_sodt.setText("");
        sinhvien_quequan.setText("");
        sinhvien_sophong.setText("");
        sinhvien_ngaysinh.setValue(null);
        sinhvien_gioitinh.setValue(null);
        data.path = "";
        sinhvien_timkiem.setText("");

        anhsinhvien.setImage(null);
    }

    public void sinhvienthem(){
        connect = Connectxampp.connectDb();
        String sql = "INSERT INTO sinhvien(`id`, `name`, `gioitinh`, `ngaysinh`, `quequan`, `sodt`, `sophong`, `anh`) VALUES(?,?,?,?,?,?,?,?)";
        try{
            if(checkidsinhvien(sinhvien_masv.getText())){

                sinhvienclear();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Mã sinh viên đã tồn tại");
                alert.showAndWait();
                return;
            }
            if(checkdaysinhvien()){

                sinhvienclear();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Đã hết chỗ thuê");
                alert.showAndWait();
                return;
            }
            if(checkdayphong(sinhvien_sophong.getText())){

                sinhvienclear();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Phòng đã đủ người.");
                alert.showAndWait();
                return;
            }
        }  catch (Exception e){

        }
        try{

            if (sinhvien_masv.getText().isEmpty()
                    | sinhvien_sophong.getText().isEmpty()
                    | sinhvien_quequan.getText().isEmpty()
                    | sinhvien_hoten.getText().isEmpty()
                    |sinhvien_sodt.getText().isEmpty()
            |sinhvien_gioitinh.getValue()==null
            | sinhvien_ngaysinh.getValue()==null|
            data.path==null | data.path=="") {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập lại thông tin!");
                alert.showAndWait();
            }
            else{
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, sinhvien_masv.getText());
                prepare.setString(2, sinhvien_hoten.getText());
                prepare.setString(3, (String) sinhvien_gioitinh.getSelectionModel().getSelectedItem());
                prepare.setString(4, String.valueOf(sinhvien_ngaysinh.getValue()));
                prepare.setString(5, sinhvien_quequan.getText());
                prepare.setString(6, sinhvien_sodt.getText());
                prepare.setString(7, sinhvien_sophong.getText());
                String uri = data.path;
                uri = uri.replace("\\", "\\\\");
                prepare.setString(8, uri);
                prepare.execute();
                sinhvienclear();
                hienthisinhvien();
            }

        }catch (Exception e){

        }
    }

    public void chonsinhvien(){
           sinhviendata sinhvien = sinhvien_bang.getSelectionModel().getSelectedItem();
            int num = sinhvien_bang.getSelectionModel().getSelectedIndex();

            if((num - 1) < -1){ return; }

            sinhvien_masv.setText(sinhvien.getId());
            sinhvien_hoten.setText(sinhvien.getName());
            sinhvien_ngaysinh.setValue(LocalDate.parse(String.valueOf(sinhvien.getNgaysinh())));
            sinhvien_gioitinh.setValue((String)sinhvien.getGioitinh());
            sinhvien_sodt.setText(sinhvien.getSodt());
            sinhvien_quequan.setText(sinhvien.getQuequan());
            sinhvien_sophong.setText(sinhvien.getSophong());

            data.path = sinhvien.getAnh();

            String uri = "file:" + sinhvien.getAnh();

            image = new Image(uri, 112, 137, false, true);

           anhsinhvien.setImage(image);

    }

    @FXML
    public void sinhviensua(){
        connect = Connectxampp.connectDb();
        String sql = "UPDATE `sinhvien` SET `id`=?,`name`=?,`gioitinh`=?,`ngaysinh`=?,`quequan`=?,`sodt`=?,`sophong`=?,`anh`=? WHERE id=?";
        sinhviendata selectedObject = sinhvien_bang.getSelectionModel().getSelectedItem();
        try{
            if(selectedObject==null){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
                return;
            }
        }catch (Exception e){
        }
        try{
            if(check(sinhvien_masv.getText())){

                sinhvienclear();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Mã sinh viên đã tồn tại");
                alert.showAndWait();
                return;
            }
        }  catch (Exception e){

        }
        try{

            if (sinhvien_masv.getText().isEmpty()
                    | sinhvien_sophong.getText().isEmpty()
                    | sinhvien_quequan.getText().isEmpty()
                    | sinhvien_hoten.getText().isEmpty()
                    |sinhvien_sodt.getText().isEmpty()
                    |sinhvien_gioitinh.getValue()==null
                    | sinhvien_ngaysinh.getValue()==null|
                    data.path==null | data.path=="") {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập lại thông tin!");
                alert.showAndWait();
            }
            else{
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, sinhvien_masv.getText());
                prepare.setString(2, sinhvien_hoten.getText());
                prepare.setString(3, (String) sinhvien_gioitinh.getSelectionModel().getSelectedItem());
                prepare.setString(4, String.valueOf(sinhvien_ngaysinh.getValue()));
                prepare.setString(5, sinhvien_quequan.getText());
                prepare.setString(6, sinhvien_sodt.getText());
                prepare.setString(7, sinhvien_sophong.getText());
                String uri = data.path;
                uri = uri.replace("\\", "\\\\");
                prepare.setString(8, uri);
                prepare.setString(9, selectedObject.getId());
                prepare.execute();
                sinhvienclear();
                hienthisinhvien();
            }

        }catch (Exception e){

        }
    }
    @FXML
    public void sinhvienxoa() {
        connect = Connectxampp.connectDb();
        sinhviendata selectedObject = sinhvien_bang.getSelectionModel().getSelectedItem();
        String sql = "DELETE FROM sinhvien WHERE id = ?" ;
        try {
            if (selectedObject != null) {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, selectedObject.getId());
                prepare.execute();
                sinhvienclear();
                hienthisinhvien();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dòng!");
                alert.showAndWait();
            }
        }
        catch(Exception e){

        }
    }

//    public void anthu(){
//        System.out.println("thang");
//    }


    public boolean checktontaiphong(String s){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM phong WHERE id=?";
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, s);

            result = prepare.executeQuery();
            if(result.next()) {
                return false;
            }
        }catch(Exception e){

        }
        return true;
    }
    public boolean checkdichvuphong(String s1,String s2){
        connect = Connectxampp.connectDb();
        String sql = "SELECT * FROM phong_dichvu WHERE phong_dichvu.idphong=? and phong_dichvu.iddichvu=?";
        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, s1);
            prepare.setString(2, s2);
            result = prepare.executeQuery();
            if(result.next()) {
                return true;
            }
        }catch(Exception e){

        }
        return false;
    }
// thong tin dich vu phong
    public ObservableList<dichvudata> taolistphongdichvu(String s) {

        ObservableList<dichvudata> listData = FXCollections.observableArrayList();

        String sql = "SELECT dichvu.id, dichvu.name,dichvu.chucnang,dichvu.giatien  FROM dichvu,phong_dichvu WHERE dichvu.id=phong_dichvu.iddichvu and phong_dichvu.idphong=?";

        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            prepare.setString(1,s);
            result = prepare.executeQuery();

            dichvudata qtData;
            while (result.next()) {

                qtData = new dichvudata(
                        result.getString("id"),
                        result.getString("name"),
                        result.getString("chucnang"),
                        result.getInt("giatien"));

                listData.add(qtData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }

    private ObservableList<dichvudata> phongdichvulist;
    public void hienthiphongdichvu(String s){
        String sql = "SELECT SUM(dichvu.giatien)  FROM dichvu,phong_dichvu WHERE dichvu.id=phong_dichvu.iddichvu and phong_dichvu.idphong=?";

        connect = Connectxampp.connectDb();
        try {
            prepare = connect.prepareStatement(sql);
            prepare.setString(1,s);
            result = prepare.executeQuery();
            if(result.next()){
                tinhtien_tongtien.setText(String.format("%d",result.getInt("SUM(dichvu.giatien)")));
            }

            phongdichvulist = taolistphongdichvu(s);
            tinhtien_madv.setCellValueFactory(new PropertyValueFactory<>("id"));
            tinhtien_tendv.setCellValueFactory(new PropertyValueFactory<>("name"));
            tinhtien_giatien.setCellValueFactory(new PropertyValueFactory<>("giatien"));
            tinhtien_dichvu.setItems(phongdichvulist);
        }catch (Exception e){

        }


    }
    public void dichvu_hienthidichvu(){
        dichvudata chon = dichvu_bang.getSelectionModel().getSelectedItem();
        connect = Connectxampp.connectDb();
        try{
            if(checktontaiphong(dichvu_maphong.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Không tồn tại phòng");
                alert.showAndWait();
                return;
            }

            if(dichvu_maphong.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập mã phòng");
                alert.showAndWait();
            }
            else{
                hienthiphongdichvu(dichvu_maphong.getText());
            }
        }catch (Exception e){

        }
    }

    public void tinhtienthemdichvu(){
        dichvudata chon = dichvu_bang.getSelectionModel().getSelectedItem();
        connect = Connectxampp.connectDb();
        String sql="INSERT INTO `phong_dichvu`(`idphong`, `iddichvu`) VALUES (?,?)";
        try{
            if(checktontaiphong(dichvu_maphong.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Không tồn tại phòng");
                alert.showAndWait();
                return;
            }
            if(checkdichvuphong(dichvu_maphong.getText(),chon.getId())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Phòng đã có dịch vụ này");
                alert.showAndWait();
                return;
            }
            if(chon==null) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dịch vụ");
                alert.showAndWait();
                return;
            }
            if(dichvu_maphong.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng nhập mã phòng");
                alert.showAndWait();
                return;
            }
            prepare = connect.prepareStatement(sql);
            prepare.setString(1,dichvu_maphong.getText());
            prepare.setString(2,chon.getId());
            prepare.execute();
            hienthiphongdichvu(dichvu_maphong.getText());
        }
        catch (Exception e){

        }

    }
    public void tinhtienxoadichvu(){
        dichvudata chon = tinhtien_dichvu.getSelectionModel().getSelectedItem();
        connect = Connectxampp.connectDb();
        String sql="DELETE FROM `phong_dichvu` WHERE iddichvu=?";
        try {
            if(chon==null) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Thông báo lỗi");
                alert.setHeaderText(null);
                alert.setContentText("Vui lòng chọn 1 dịch vụ");
                alert.showAndWait();
                return;
            }
            prepare = connect.prepareStatement(sql);
            prepare.setString(1,chon.getId());
            prepare.execute();
            hienthiphongdichvu(dichvu_maphong.getText());

        }
        catch (Exception e){

        }
    }



    //thong tin cua phong
    private ObservableList<dichvudata> phongdichvua;
    public void phongdichvu(String s){
            phongdichvua = taolistphongdichvu(s);
            phong_madichvu.setCellValueFactory(new PropertyValueFactory<>("id"));
            phong_tendichvu.setCellValueFactory(new PropertyValueFactory<>("name"));
            phong_bangdichvu.setItems(phongdichvua);
    }

    public ObservableList<phong_sinhvien> taolistphongsinhvien(String s) {

        ObservableList<phong_sinhvien> listData = FXCollections.observableArrayList();

        String sql = "SELECT sinhvien.id, sinhvien.name  FROM sinhvien WHERE sinhvien.sophong=?";

        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            prepare.setString(1,s);
            result = prepare.executeQuery();

            phong_sinhvien qtData;
            while (result.next()) {

                qtData = new phong_sinhvien(
                        result.getString("id"),
                        result.getString("name"));

                listData.add(qtData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    private ObservableList<phong_sinhvien> phongsinhviena;
    public void phongsinhvien(String s){
        phongsinhviena = taolistphongsinhvien(s);
        phong_masinhvien.setCellValueFactory(new PropertyValueFactory<>("id"));
        phong_hoten.setCellValueFactory(new PropertyValueFactory<>("name"));
        phong_bangsinhvien.setItems(phongsinhviena);
    }

    public void phongdichvu101(){
        phongbathienthibang();
        phongdichvu("101");
        phongsinhvien("101");

    }
    public void phongdichvu102(){
        phongbathienthibang();
        phongdichvu("102");
        phongsinhvien("102");
    }
    public void phongdichvu103(){
        phongbathienthibang();
        phongdichvu("103");
        phongsinhvien("103");
    }
    public void phongdichvu104(){
        phongbathienthibang();
        phongdichvu("104");
        phongsinhvien("104");
    }
    public void phongdichvu105(){
        phongbathienthibang();
        phongdichvu("105");
        phongsinhvien("105");
    }
    public void phongdichvu106(){
        phongbathienthibang();
        phongdichvu("106");
        phongsinhvien("106");
    }
    public void phongdichvu201(){
        phongbathienthibang();
        phongdichvu("201");
        phongsinhvien("201");

    }
    public void phongdichvu202(){
        phongbathienthibang();
        phongdichvu("202");
        phongsinhvien("202");
    }
    public void phongdichvu203(){
        phongbathienthibang();
        phongdichvu("203");
        phongsinhvien("203");
    }
    public void phongdichvu204(){
        phongbathienthibang();
        phongdichvu("204");
        phongsinhvien("204");
    }
    public void phongdichvu205(){
        phongbathienthibang();
        phongdichvu("205");
        phongsinhvien("205");
    }
    public void phongdichvu206(){
        phongbathienthibang();
        phongdichvu("206");
        phongsinhvien("206");
    }
    public void phongdichvu301(){
        phongbathienthibang();
        phongdichvu("301");
        phongsinhvien("301");

    }
    public void phongdichvu302(){
        phongbathienthibang();
        phongdichvu("302");
        phongsinhvien("302");
    }
    public void phongdichvu303(){
        phongbathienthibang();
        phongdichvu("303");
        phongsinhvien("303");
    }
    public void phongdichvu304(){
        phongbathienthibang();
        phongdichvu("304");
        phongsinhvien("304");
    }
    public void phongdichvu305(){
        phongbathienthibang();
        phongdichvu("305");
        phongsinhvien("305");
    }
    public void phongdichvu306(){
        phongbathienthibang();
        phongdichvu("306");
        phongsinhvien("306");
    }
    public void phongdichvu401(){
        phongbathienthibang();
        phongdichvu("401");
        phongsinhvien("401");

    }
    public void phongdichvu402(){
        phongbathienthibang();
        phongdichvu("402");
        phongsinhvien("402");
    }
    public void phongdichvu403(){
        phongbathienthibang();
        phongdichvu("403");
        phongsinhvien("403");
    }
    public void phongdichvu404(){
        phongbathienthibang();
        phongdichvu("404");
        phongsinhvien("404");
    }
    public void phongdichvu405(){
        phongbathienthibang();
        phongdichvu("405");
        phongsinhvien("405");
    }
    public void phongdichvu406(){
        phongbathienthibang();
        phongdichvu("406");
        phongsinhvien("406");
    }

    public String tinhsoluongtrongphong(String s){
        String sql = "SELECT COUNT(*)  FROM sinhvien WHERE sinhvien.sophong=?";
        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            prepare.setString(1, s);
            result = prepare.executeQuery();
            if(result.next()){
                String res = result.getString("COUNT(*)");
                return res;
            }
        }catch (Exception e){

        }
        String res="null";
        return res;
    }
    public void hienthisoluongtang1(){
        soluong101.setText(tinhsoluongtrongphong("101"));
        soluong102.setText(tinhsoluongtrongphong("102"));
        soluong103.setText(tinhsoluongtrongphong("103"));
        soluong104.setText(tinhsoluongtrongphong("104"));
        soluong105.setText(tinhsoluongtrongphong("105"));
        soluong106.setText(tinhsoluongtrongphong("106"));
    }
    public void hienthisoluongtang2(){
        soluong201.setText(tinhsoluongtrongphong("201"));
        soluong202.setText(tinhsoluongtrongphong("202"));
        soluong203.setText(tinhsoluongtrongphong("203"));
        soluong204.setText(tinhsoluongtrongphong("204"));
        soluong205.setText(tinhsoluongtrongphong("205"));
        soluong206.setText(tinhsoluongtrongphong("206"));
    }
    public void hienthisoluongtang3(){
        soluong301.setText(tinhsoluongtrongphong("301"));
        soluong302.setText(tinhsoluongtrongphong("302"));
        soluong303.setText(tinhsoluongtrongphong("303"));
        soluong304.setText(tinhsoluongtrongphong("304"));
        soluong305.setText(tinhsoluongtrongphong("305"));
        soluong306.setText(tinhsoluongtrongphong("306"));
    }
    public void hienthisoluongtang4(){
        soluong401.setText(tinhsoluongtrongphong("401"));
        soluong402.setText(tinhsoluongtrongphong("402"));
        soluong403.setText(tinhsoluongtrongphong("403"));
        soluong404.setText(tinhsoluongtrongphong("404"));
        soluong405.setText(tinhsoluongtrongphong("405"));
        soluong406.setText(tinhsoluongtrongphong("406"));
    }
    public void phongtathienthibang(){
        phong_bangsinhvien.setVisible(false);
        phong_bangdichvu.setVisible(false);
    }
    public void phongbathienthibang(){
        phong_bangsinhvien.setVisible(true);
        phong_bangdichvu.setVisible(true);
    }

    public String tinhsoluongsinhvien(){
        String sql = "SELECT COUNT(*)  FROM sinhvien";
        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            if(result.next()){
                String res = result.getString("COUNT(*)");
                return res;
            }
        }catch (Exception e){

        }
        String res="null";
        return res;
    }
    public String tinhsoluongquantuc(){
        String sql = "SELECT COUNT(*)  FROM quantuc";
        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            if(result.next()){
                String res = result.getString("COUNT(*)");
                return res;
            }
        }catch (Exception e){

        }
        String res="null";
        return res;
    }
    public String tinhsoluongquantucnghi(){
        String sql = "SELECT COUNT(*)  FROM quantucnghi";
        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            if(result.next()){
                String res = result.getString("COUNT(*)");
                return res;
            }
        }catch (Exception e){

        }
        String res="null";
        return res;
    }
    public String tinhsoluongxe(){
        String sql = "SELECT COUNT(*)  FROM xe";
        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            if(result.next()){
                String res = result.getString("COUNT(*)");
                return res;
            }
        }catch (Exception e){

        }
        String res="null";
        return res;
    }
    public String tinhsoluongvitritrong(){
        String sql = "SELECT COUNT(*)  FROM xe";
        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            if(result.next()){
                int res = 200-Integer.parseInt(result.getString("COUNT(*)"));
                return String.format("%d",res);
            }
        }catch (Exception e){

        }
        String res="null";
        return res;
    }
    public String tinhsoluongdichvu(){
        String sql = "SELECT COUNT(*)  FROM dichvu";
        connect = Connectxampp.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            if(result.next()){
                String res = result.getString("COUNT(*)");
                return res;
            }
        }catch (Exception e){

        }
        String res="null";
        return res;
    }
    public void hienthisoluong(){
        soluongsinhvien.setText(tinhsoluongsinhvien());
        soluongquantuc.setText(tinhsoluongquantuc());
        soluongquantucnghi.setText(tinhsoluongquantucnghi());
        soluongxe.setText(tinhsoluongxe());
        soluongvitritrong.setText(tinhsoluongvitritrong());
        soluongdichvu.setText(tinhsoluongdichvu());

    }




    public void switchTang(ActionEvent e){
        if(e.getSource()==tang1){
            tang1_form.setVisible(true);
            tang2_form.setVisible(false);
            tang3_form.setVisible(false);
            tang4_form.setVisible(false);
            phongtathienthibang();
            hienthisoluongtang1();

        }
        else {
            if(e.getSource()==tang2){
                tang1_form.setVisible(false);
                tang2_form.setVisible(true);
                tang3_form.setVisible(false);
                tang4_form.setVisible(false);
                phongtathienthibang();
                hienthisoluongtang2();
            }
            else {
                if(e.getSource()==tang3){
                    tang1_form.setVisible(false);
                    tang2_form.setVisible(false);
                    tang3_form.setVisible(true);
                    tang4_form.setVisible(false);
                    phongtathienthibang();
                    hienthisoluongtang3();
                }
                else {
                    tang1_form.setVisible(false);
                    tang2_form.setVisible(false);
                    tang3_form.setVisible(false);
                    tang4_form.setVisible(true);
                    phongtathienthibang();
                    hienthisoluongtang4();
                }
            }

        }
    }
    public void switchQuanLi(ActionEvent e) {
        form_chao.setVisible(false);
        if (e.getSource() == ql_phong) {
            form_phong.setVisible(true);
            form_sinhvien.setVisible(false);
            form_quantuc.setVisible(false);
            form_xe.setVisible(false);
            form_dichvu.setVisible(false);
            form_tongquat.setVisible(false);

            sinhvienclear();
            xoahienthichuxe();
            hienthisoluongtang1();
            tang1_form.setVisible(true);
            tang2_form.setVisible(false);
            tang3_form.setVisible(false);
            tang4_form.setVisible(false);


        } else {
            if (e.getSource() == ql_sinhvien) {
                form_phong.setVisible(false);
                form_sinhvien.setVisible(true);
                form_quantuc.setVisible(false);
                form_xe.setVisible(false);
                form_dichvu.setVisible(false);
                form_tongquat.setVisible(false);
                xoahienthichuxe();
                sinhvienclear();
                taogioitinhsinhvien();
                hienthisinhvien();

            }
            else{
                if (e.getSource() == ql_quantuc) {
                    form_phong.setVisible(false);
                    form_sinhvien.setVisible(false);
                    form_quantuc.setVisible(true);
                    form_xe.setVisible(false);
                    form_dichvu.setVisible(false);
                    form_tongquat.setVisible(false);

                    xoahienthichuxe();
                    taogioitinhquantuc();
                    sinhvienclear();
                    hienthiquantuc();
                    hienthiquantucnghi();
                }else{
                    if (e.getSource() == ql_xe) {
                        form_phong.setVisible(false);
                        form_sinhvien.setVisible(false);
                        form_quantuc.setVisible(false);
                        form_xe.setVisible(true);
                        form_dichvu.setVisible(false);
                        form_tongquat.setVisible(false);
                        xoahienthichuxe();
                        hienthixe();
                        sinhvienclear();
                    }
                    else{
                        if (e.getSource() == ql_dichvu) {
                            form_phong.setVisible(false);
                            form_sinhvien.setVisible(false);
                            form_quantuc.setVisible(false);
                            form_xe.setVisible(false);
                            form_dichvu.setVisible(true);
                            form_tongquat.setVisible(false);

                            String uri = "file:" + data.linkqr;

                            image = new Image(uri, 179, 179, false, true);


                            anhqr.setImage(image);
                            xoahienthichuxe();

                            hienthidichvu();
                            sinhvienclear();
                        }
                        else{
                            form_phong.setVisible(false);
                            form_sinhvien.setVisible(false);
                            form_quantuc.setVisible(false);
                            form_xe.setVisible(false);
                            form_dichvu.setVisible(false);
                            form_tongquat.setVisible(true);

                            sinhvienclear();
                            xoahienthichuxe();
                            hienthisoluong();
                        }
                    }
                }
            }
        }
    }

}

