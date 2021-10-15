package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ciclos bloque de codigo que se repite n cantidad de veces hasta que se cumpla una condicional
        //ciclo for
    /*  for (contador  = 0; contador  < numero; contador ++){
        lo que se encuentra dentro de las llaves es el codigo que se repite
        }*/



        //Scanner sc = new Scanner(System.in);
        /*System.out.println("ingrese un numero");
        int num = sc.nextInt();
        sc.close();
        int inicial = 0, segundo = 1, suma = 1;


        for (int i = 2; i <= num; i++) {
            System.out.println(suma);
            suma = inicial + segundo;
            inicial = segundo;
            segundo = suma;

        }*/
        .g]*i));
        }*/
        /*
        while(condicional){
            //codigo a ejecutar
        }
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("adivina el numero secreto, ingresa un numero");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while(numero != numeroSecreto); {
            System.out.println("adivina el numero secreto, ngresa un numero");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("felicidades encontraste el numero secreto");


        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;

        do {
            System.out.println("adivina el numero secreto, ingresa un numero");
            numero = sc.nextInt();
        }while(numero != numeroSecreto);

        System.out.println("adivinaste el numero secreto, ngresa un numero");
        sc.close();

        Scanner sc = new Scanner(System.in);

        int numero = 2;
        int numeros= 100;

        do {
            System.out.println("ingresa un numero");
            numero = sc.nextInt();
        }while(numero != 0);
        numeros = numeros * numero ;

        System.out.println(numeros);

    }
}
