package com.clase1;

public class Fibonacci {
    public static int SerieFibonacci (int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return SerieFibonacci(n-2) + SerieFibonacci(n-1);
    }

    public static void main(String[] args){
        int maximo = 11;
        System.out.println("La serie Fibonacci de "+maximo+" numeros");

        for(int i = 0; i < maximo;i++){
            System.out.println(SerieFibonacci(i)+" ");
        }
    }

}
