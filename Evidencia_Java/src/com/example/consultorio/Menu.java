package com.example.consultorio;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int menu;


    private void showMenu(){
        System.out.println(" ");
        System.out.println("Bienvenido al Consultorio:\n" +
                "1-Doctores \n" +
                "2-Pacientes \n" +
                "3-Citas\n" +
                "0-Salir");
        System.out.println("");
    }

    public void menuIn() throws IOException {
        boolean isRunning = true;
        do{
            showMenu();
            System.out.print("Ingrese una opcion: " + "\n");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                 Doctores doc = new Doctores();
                 doc.menudoc();
                    break;

                case 2:
                Pacientes pac = new Pacientes();
                pac.menupac();
                    break;

                case 3:
                Citas ci = new Citas();
                ci.menucit();
                    break;

                case 0:
                    System.out.println("Que tenga un excelente dia");
                    isRunning = false;
                    break;
            }

        }while (isRunning);
        System.exit(0);
    }

}
