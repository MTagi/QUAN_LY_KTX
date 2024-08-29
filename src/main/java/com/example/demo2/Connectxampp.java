package com.example.demo2;
import java.sql.*;
public class Connectxampp {
    public static Connection connectDb(){
        try{

            Connection connect =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/baitaplon", "root", "");

            return connect;

        }catch(Exception e){e.printStackTrace();}

        return null;
    }
}
