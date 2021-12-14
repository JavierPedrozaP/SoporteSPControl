package com.example.consultorio;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListaPacientesyDoctores {
    public void  LP(){

        String Doctor="";
        String Pacientes="";
        try
        {

            FileReader lector=new FileReader("src/db/Doctor.csv");

            FileReader lec=new FileReader("src/db/Paciente.csv");

            BufferedReader contenido=new BufferedReader(lector);
            BufferedReader con=new BufferedReader(lec);

            while((Doctor=contenido.readLine())!=null)
            {

                System.out.println("Doctores:"+" "+ Doctor);

            }

            System.out.println(" ");

            while((Pacientes=con.readLine())!=null)
            {

                System.out.println("pacientes:"+" "+ Pacientes);
            }
        }

        catch(Exception e)
        {
            System.out.println("Error de lectura");
        }
    }
}
