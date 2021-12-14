package Controller;

public class User_login {
  String name_user;
  String password;
  String  nombre_full;
  String sexo;
  int edad;
  double Altura;
  double Peso;
  double IMC;
  String Fecha_y_Hora;
  String Usuario_Name;
  
public User_login(String name_user, String password) {
        this.name_user = name_user;
        this.password = password;
        
    }

public User_login(String  nombre_full, String sexo, int edad, String Usuario_Name) {
        this.name_user = nombre_full;
        this.sexo = sexo;
        this.edad = edad;
        this.Usuario_Name=Usuario_Name;
    }

public User_login( double Altura,double Peso,double IMC, String Fecha_y_Hora) {
        this.IMC = IMC;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Fecha_y_Hora = Fecha_y_Hora;
    }

    User_login() {
        }

    public String getname_user() {
        return name_user;
    }

    public void setname_user(String name_user) {
        this.name_user = name_user;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getnombre_full() {
        return name_user;
    }

    public void setnombre_full(String name_user) {
        this.name_user = name_user;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }
    
    
public String getUsuario_Name() {
        return Usuario_Name;
    }

    public void setUsuario_Name(String Usuario_Name) {
        this.Usuario_Name = Usuario_Name;
    }
    
    
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public String getFecha_y_Hora() {
        return Fecha_y_Hora;
    }

    public void setFecha_y_Hora(String Fecha_y_Hora) {
        this.Fecha_y_Hora = Fecha_y_Hora;
    }

  
    
    
    
}
