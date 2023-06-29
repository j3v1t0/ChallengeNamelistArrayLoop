package com.buclearraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    protected static String[] stringList = new String[0];
    protected static int contador = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do{
            menu();
            option = scanner.nextInt();

            switch (option){
                case 1:
                    digitarNombre();
                    break;
                case 2:
                    mostrarListaNombres();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while (option != 3);

    }

    static void menu(){
        System.out.println("Registro de Nombres");
        System.out.println("1 - Digite el nombre");
        System.out.println("2 - Lista de nombres");
        System.out.println("3 - Salir");
    }

    static void digitarNombre(){
        if (contador == stringList.length){
            int aumentarTamanoArray = stringList.length + 1;
            stringList = Arrays.copyOf(stringList,aumentarTamanoArray);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String nombre = scanner.next();
        stringList[contador] = nombre;
        contador++;
        System.out.println("Nombre registrado existosamente");
    }

    static void mostrarListaNombres(){
        if(stringList.length != 0) {
            System.out.println("Lista de Nombres: ");
            for (int contadorList = 0; contadorList < stringList.length; contadorList++) {
                if (stringList != null) {
                    int aumentoContadorList = contadorList + 1;
                    System.out.println(aumentoContadorList + " - " + stringList[contadorList]);
                }
            }
            System.out.println("--------------------Fin Lista--------------------");
        }else {
            System.out.println("--------------------Lista dee nombres vacia--------------------");
        }
    }
}