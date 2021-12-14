
package Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class IMC_base {
 Connection con;

    public IMC_base(Connection con) {
        this.con = con;
    }

    //for register user 
    public boolean imc_saver(IMC imc) {
        boolean set = false;
        try {
            //Insert register data to database
            String query = "insert into IMC_cal(Usuario_Name_IMC,Altura) values(?,?)";

            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, imc.getUsuario_Name_IMC());
            pt.setDouble(2, imc.getAltura());
            pt.executeUpdate();
            set = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }
    
     public boolean IMC_SAVER(IMC imc) {
        boolean set = false;
        try {
            //Insert register data to database
            String query = "insert into IMC_cal(Usuario_Name_IMC,Altura,Peso,IMC,Fecha_y_Hora) values(?,?,?,?,?)";

            PreparedStatement pt = this.con.prepareStatement(query);
            pt.setString(1, imc.getUsuario_Name_IMC());
            pt.setDouble(2, imc.getAltura());
            pt.setDouble(3, imc.getPeso());
            pt.setDouble(4, imc.getIMC_Calcular());
            pt.setString(5, imc.getFecha_y_Hora());
            pt.executeUpdate();
            set = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }

      public List<IMC> IMC_login(String Usuario_Name_IMC) {
        
      List<IMC> users = new ArrayList<>();
        try {
            String query = "Select * From IMC_cal where Usuario_Name_IMC=? ";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, Usuario_Name_IMC);

            ResultSet rs = pst.executeQuery();
           while (rs.next()) {
                IMC user = new IMC();
                user.setAltura(rs.getDouble("Altura"));
                user.setPeso(rs.getDouble("Peso"));
                user.setIMC_Calcular(rs.getDouble("IMC"));
                user.setFecha_y_Hora(rs.getString("Fecha_y_Hora"));
                users.add(user);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    } 
    }