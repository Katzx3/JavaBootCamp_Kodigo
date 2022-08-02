package com.clase1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] arg) {
        try {
            File myObj = new File("ArchivodePrueba.txt");
            if (myObj.createNewFile())
                System.out.println("Archivo Creado" + myObj.getName());
            else
                System.out.println(("El archivo ya existe"));
        } catch (IOException e) {
            System.out.println("Error en la creación del archivo, consultar al equipo de soporte");
        }
        try {
            FileWriter myWriter = new FileWriter("ArchivodePrueba.txt");
            myWriter.write("Este es un mensaje de texto usando java, este es un principio básico");
            myWriter.close();
            System.out.println("Se escribió sobre el archivo");
        } catch (IOException e) {
            System.out.println("Error en la creación del archivo, consultar al equipo de soporte");
        }
    }
}