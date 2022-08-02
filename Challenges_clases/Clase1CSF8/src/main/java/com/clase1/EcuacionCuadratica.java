package com.clase1;

import java.util.Scanner;

public class EcuacionCuadratica {

    public static void main(String[] args){
        double a,b,c,x1,x2,potencia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese a:");
        a = entrada.nextDouble();

        System.out.println("ingrese b:");
        b = entrada.nextDouble();

        System.out.println("ingrese c:");
        c = entrada.nextDouble();

        potencia = Math.pow(b,2)-(4*a*c);

        x1=(-b+Math.sqrt(potencia))/(2*a);
        x2=(-b-Math.sqrt(potencia))/(2*a);

        System.out.println("X1 es igual a "+x1+ " y "+ "x2 es igual a "+x2);

    }
}
