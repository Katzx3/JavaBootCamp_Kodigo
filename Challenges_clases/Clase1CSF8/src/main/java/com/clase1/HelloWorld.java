package com.clase1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hola a todos");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quien nos visita?");
        String nombre = entrada.nextLine();

        System.out.println("Cuantos años tiene");
        int edad = entrada.nextInt();

        System.out.println("CUanto dinero trae");
        double dinero = entrada.nextDouble();

        System.out.println(nombre + " tiene "+edad+" años " + " y trae " +" $" +dinero);

        String estado;
        if (edad > 50)
            estado = "amargado";
        else
            estado = "feliz";

        System.out.println(nombre+" es "+estado);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Hoy es "+ dtf.format(LocalDateTime.now()));





    }

}
