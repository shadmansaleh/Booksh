/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booksh;
import java.sql.*;
/**
 *
 * @author shadman
 */
public class DBConnection {
    static Connection con = null;
    
    public static Connection getConnection() {
        if (con != null) return con;
        String url = "jdbc:mysql://localhost:3306/library_ms";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms", "root", "");            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
