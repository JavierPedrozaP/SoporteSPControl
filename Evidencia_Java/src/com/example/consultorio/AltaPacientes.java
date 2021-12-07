package com.example.consultorio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AltaPacientes {

    public void registroPac() {
        System.out.print("Si deseas Cancelar Escriba la palabra C: "+ "\n");
        System.out.print(" ");
        String ID;
        Scanner id = new Scanner(System.in);
        System.out.print("Escribe el ID : "+ "\n");
        ID = id.nextLine();
        if (ID.equals("c") || ID.equals("C")){
            System.out.print("Se cancelo el alta : "+ "\n");
            Pacientes pc = new Pacientes();
            try {
                pc.menupac();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
        }
        String NombreCompleto;
        Scanner nombre = new Scanner(System.in);
        System.out.print("Escribe Nombre Completo : "+ "\n");
        NombreCompleto = nombre.nextLine();

        if (NombreCompleto.equals("c") || NombreCompleto.equals("C")){
            System.out.print("Se cancelo el alta : "+ "\n");
            Pacientes pc = new Pacientes();
            try {
                pc.menupac();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
        }

        try
        {

            File archivo=new File("src/db/Paciente.csv");


            FileWriter escribir=new FileWriter(archivo,true);

            escribir.write("ID : " + ID + "\n");
            escribir.write("Nombre Completo del Paciente: " + NombreCompleto + "\n");


            escribir.close();
        }


        catch(Exception e)
        {
            System.out.println("Error al escribir");
        }
    }
}
