package com.example.consultorio;

import java.io.IOException;
import java.util.Scanner;

public class Doctores{
    Scanner scanner = new Scanner(System.in);
    int menu;


    private void showMenu() {
        System.out.println(" ");
        System.out.println("Estas En la Seccion Doctores:\n" +
                "1-Altas \n" +
                "2-Lista \n" +
                "3-Regresar\n" );
        System.out.println("");
    }

    public void menudoc() throws IOException {
        boolean isRunning = true;
        do{
            showMenu();
            System.out.print("Porfavor Ingrese una opcion: " + "\n");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    AltaDoctor doc = new AltaDoctor();
                    doc.registro();
                    break;
                case 2:
                ListaDoctor list = new ListaDoctor();
                list.listadoctor();
                    break;

                case 3:
                 Menu menu = new Menu();
                 menu.menuIn();
                    break;


                case 0:
                    isRunning = false;
                    break; }
        } while (isRunning);

    }
}

