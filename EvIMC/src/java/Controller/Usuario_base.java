
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Usuario_base {
 Connection con;

    public Usuario_base(Connection con) {
        this.con = con;
    }

    //for register user 
    public boolean saver(Usuario user) {
        boolean set = false;
        try {
            //Insert register data to database
            String query = "insert into usuarios(Usuario_Name,nombre_full,sexo,edad) values(?,?,?,?)";

            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, user.getUsuario_Name());
            pt.setString(2, user.getnombre_full());
            pt.setString(3, user.getsexo());
            pt.setInt(4, user.getedad());
            pt.executeUpdate();
            set = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }

      
    }

