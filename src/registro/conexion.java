/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro;
import java.sql.*;
/**
 *
 * @author HP
 */
public class conexion {
   static String url = "jdbc:mysql://localhost:3306/registrar";
   static String username="root";
   static String password="";
   public static Connection getconexion(){
       Connection conexion=null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion=DriverManager.getConnection(url,username,password);
           System.out.println("conexion exitosa");
       }catch(ClassNotFoundException| SQLException e){
           System.out.println("Error de conexion"+ e.getMessage());
       }
       return conexion;
   }
}
