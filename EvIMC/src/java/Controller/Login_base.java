package Controller;
import java.sql.*;
public class Login_base { 

    Connection con;

    public Login_base(Connection con) {
        this.con = con;
    }

    //for register user 
    public boolean saverlogin(User_login user) {
        boolean set = false;
        try {
            //Insert register data to database
            String query = "insert into logins(name_user,password) values(?,?)";

            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, user.getname_user());
            pt.setString(2, user.getpassword());

            pt.executeUpdate();
            set = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }

    public User_login loglogin(String name, String pass,String Usuario_Name_IMC,String Usuario_Name) {
        User_login user = null;
        try {
            String query = "Select * From usuarios,IMC_cal, logins where name_user=? and password=? and Usuario_Name_IMC=? and Usuario_Name=? ";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, pass);
            pst.setString(3, Usuario_Name_IMC);
            pst.setString(4, Usuario_Name);
            ResultSet rs = pst.executeQuery();
           if (rs.next()) {
                user = new User_login();
                user.setname_user(rs.getString("name_user"));
                user.setUsuario_Name(rs.getString("Usuario_Name"));
                user.setpassword(rs.getString("password"));
                user.setnombre_full(rs.getString("nombre_full"));
                user.setsexo(rs.getString("sexo"));
                user.setedad(rs.getInt("edad"));
                user.setAltura(rs.getDouble("Altura"));
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    } 
}
   
