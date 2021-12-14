
package Controller;

import java.text.DecimalFormat;

public class IMC {
    String Usuario_Name_IMC;
    double Altura;
    double Peso;
    double IMC_Calcular;
    String Fecha_y_Hora;
    DecimalFormat formato1 = new DecimalFormat("#.00");
    
    public IMC(String Usuario_Name_IMC, double Altura,double Peso,double IMC_Calcular, String Fecha_y_Hora) {
        this.Usuario_Name_IMC = Usuario_Name_IMC;
        this.IMC_Calcular = IMC_Calcular;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Fecha_y_Hora = Fecha_y_Hora;
    }
    
public IMC(String Usuario_Name_IMC, double Altura) {
 this.Usuario_Name_IMC = Usuario_Name_IMC;
 this.Altura = Altura;
    }

public IMC(String altura, String Peso_ind){
    this.setAltura(Double.parseDouble(altura));
    this.setPeso(Double.parseDouble(Peso_ind));
    }

public void IMC_calcular(){
    double a=this.getPeso()/(this.getAltura()*this.getAltura());
    this.IMC_Calcular(a);
    }




    public String getUsuario_Name_IMC() {
        return Usuario_Name_IMC;
    }

    public void setUsuario_Name_IMC(String Usuario_Name_IMC) {
        this.Usuario_Name_IMC = Usuario_Name_IMC;
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

    public double getIMC_Calcular() {
        return IMC_Calcular;
    }

    public void setIMC_Calcular(double IMC_Calcular) {
        this.IMC_Calcular = IMC_Calcular;
    }

    public String getFecha_y_Hora() {
        return Fecha_y_Hora;
    }

    public void setFecha_y_Hora(String Fecha_y_Hora) {
        this.Fecha_y_Hora = Fecha_y_Hora;
    }
    
 public void IMC_Calcular(double IMC_Calcular){
    this.IMC_Calcular = IMC_Calcular;
    }

IMC() {
 
    }


}
