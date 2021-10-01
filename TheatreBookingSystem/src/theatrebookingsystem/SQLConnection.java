/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theatrebookingsystem;
import java.sql.*;
/**
 *
 * @author 2018/E/070
 */
public class SQLConnection {
     public static void main(String[] args) {
        connectToSql();
         
    }
     
     public static  void connectToSql() {
         String username = "root";
         String password = "Lachu123@#";
         String url = "jdbc:mysql://127.0.0.1:3306/theatre_booking";
         
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = DriverManager.getConnection(url,username,password);
             
             System.out.println("SQL is connected....");
             
         }catch(Exception e){
             System.out.println("Somethings error in connection!!!!");
         }
         
     }
}
