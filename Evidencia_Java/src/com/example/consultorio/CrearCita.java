package com.example.consultorio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearCita {
    public void registroCit() {
        System.out.print("Si deseas Cancelar Escriba la palabra C: "+ "\n");
        System.out.print(" ");
        String ID;
        Scanner id = new Scanner(System.in);
        System.out.print("Escribe el ID : "+ "\n");
        ID = id.nextLine();
        if (ID.equals("c") || ID.equals("C")){
            System.out.print("Se cancelo el alta : "+ "\n");
            Citas ct = new Citas();
            try {
                ct.menucit();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
        }
        String FechayHora;
        Scanner FH = new Scanner(System.in);
        System.out.print("Escriba la Fecha Y Hora de la Cita : "+ "\n");
        FechayHora = FH.nextLine();
        if (FechayHora.equals("c") || FechayHora.equals("C")){
            System.out.print("Se cancelo el alta : "+ "\n");
            Citas ct = new Citas();
            try {
                ct.menucit();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
        }
        String NombredePaciente;
        Scanner NP = new Scanner(System.in);
        System.out.print("Escriba el Nombre Completo del Paciente : "+ "\n");
        NombredePaciente = NP.nextLine();
        if (NombredePaciente.equals("c") || NombredePaciente.equals("C")){
            System.out.print("Se cancelo el alta : "+ "\n");
            Citas ct = new Citas();
            try {
                ct.menucit();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
        }
        String NombredeDoctor;
        Scanner ND = new Scanner(System.in);
        System.out.print("Escriba el Nombre Completo del Doctor: "+ "\n");
        NombredeDoctor = ND.nextLine();
        if (NombredeDoctor.equals("c") || NombredeDoctor.equals("C")){
            System.out.print("Se cancelo el alta : "+ "\n");
            Citas ct = new Citas();
            try {
                ct.menucit();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
        }
        String MotivoCita;
        Scanner MC = new Scanner(System.in);
        System.out.print("Escriba el Motivo de la Cita : "+ "\n");
        MotivoCita = MC.nextLine();
        if (MotivoCita.equals("c") || MotivoCita.equals("C")){
            System.out.print("Se cancelo el alta : "+ "\n");
            Citas ct = new Citas();
            try {
                ct.menucit();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
        }

        try
        {

            File archivo=new File("src/db/Cita.csv");


            FileWriter escribir=new FileWriter(archivo,true);

            escribir.write("ID : " + ID + "\n");
            escribir.write("Fecha Y Hora de la Cita : " + FechayHora + "\n");
            escribir.write("Nombre Completo del Paciente : " + NombredePaciente + "\n");
            escribir.write("Nombre Completo del Doctor : " + NombredeDoctor + "\n");
            escribir.write("Motivo de la Cita : " + MotivoCita + "\n");


            escribir.close();
        }


        catch(Exception e)
        {
            System.out.println("Error al escribir");
        }
    }
}
