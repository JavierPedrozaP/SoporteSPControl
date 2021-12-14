package Controller;
import java.sql.*;
public class Conexion {
    private static Connection con;
    
    public static Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/imc","root","admin");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
