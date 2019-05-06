package Thi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Conector {
    public Connection conn;
    public Conector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String Url = "jdbc:mysql://localhost:3306/t1808m";

            conn = DriverManager.getConnection(Url, "NGuyenTruongadmin", "anhtruong01");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }

    public int updateQuery(String sqlUpdate) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeUpdate(sqlUpdate);
    }

}
