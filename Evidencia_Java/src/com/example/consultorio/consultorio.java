package com.example.consultorio;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class consultorio {
    public static void main(String[] args) throws IOException {
     String Usuario;
     String Contrasena;

        do {
            System.out.print("Bienvanido por Favor Ingrese Usuario Y Contraseña: "+ "\n");
            Scanner Nombre = new Scanner(System.in); //Se crea el integrador de datos
            System.out.print("Usuario: "+ "\n"); // Se solicita el nombre del alumno
            Usuario = Nombre.nextLine();

            Scanner Con= new Scanner(System.in); //Se crea el integrador de datos
            System.out.print("Contraseña: "+ "\n"); // Se solicita el nombre del alumno
            Contrasena = Con.nextLine();

            if ((Usuario.equals("admin") && Contrasena.equals("passwor02"))) {
                System.out.println("Acceso Permitido ");

            } else {
                System.out.println("Acceso Denegado ");

            }
        } while (!(Usuario.equals("admin") && Contrasena.equals("passwor02")));

        Menu menu = new Menu();
        menu.menuIn();
    }

}
