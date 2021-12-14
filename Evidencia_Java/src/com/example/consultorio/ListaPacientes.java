package com.example.consultorio;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListaPacientes {

    public void listapaci()
    {
        String lectura="";

        try
        {

            FileReader lector=new FileReader("src/db/Paciente.csv");


            BufferedReader contenido=new BufferedReader(lector);


            while((lectura=contenido.readLine())!=null)
            {
                System.out.println(lectura);
            }
        }

        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
    }
}
