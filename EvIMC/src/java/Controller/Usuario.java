
package Controller;

public class Usuario {
    String Usuario_Name;
    String nombre_full;
    String sexo;
    int edad;
    

public Usuario( String Usuario_Name, String nombre_full, String sexo, int edad) {
        this.Usuario_Name = Usuario_Name;
        this.nombre_full = nombre_full;
        this.sexo = sexo;
        this.edad = edad;

    }

    public String getUsuario_Name() {
        return Usuario_Name;
    }

    public void setUsuario_Name(String Usuario_Name) {
        this.Usuario_Name = Usuario_Name;
    }
    public String getnombre_full() {
        return nombre_full;
    }

    public void setnombre_full(String nombre_full) {
        this.nombre_full = nombre_full;
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

Usuario() {
 
    }


}