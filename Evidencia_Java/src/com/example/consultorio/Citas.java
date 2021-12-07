package com.example.consultorio;

import java.io.IOException;
import java.util.Scanner;

public class Citas {
    Scanner scanner = new Scanner(System.in);
    int menu;


    private void showMenu() {
        System.out.println(" ");
        System.out.println("Estas En la Seccion Citas : \n" +
                "1-Crear \n" +
                "2-Lista de Pacientes y Doctores \n" +
                "3-Lista de Citas \n" +
                "4-Regresar \n" );
        System.out.println("");
    }

    public void menucit() throws IOException {
        boolean isRunning = true;
        do{
            showMenu();
            System.out.print("Porfavor Ingrese una opcion: " + "\n");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    CrearCita cc = new CrearCita();
                    cc.registroCit();
                    break;

                case 2:
                    ListaPacientesyDoctores lpd = new ListaPacientesyDoctores();
                    lpd.LP();
                    break;

                case 3:
                    ListaCita lc = new ListaCita();
                    lc.listacit();
                    break;

                case 4:
                    Menu menu = new Menu();
                    menu.menuIn();
                    break;


                case 0:
                    isRunning = false;
                    break; }
        } while (isRunning);

    }
}
