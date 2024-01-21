package com.iesam.tapas.features.tapas.presentation;

import java.util.Scanner;

public class MainTapa {

    public static void main(String[] args) {

        // Implementamos el scanner para que el usuario pueda escribir por consola
        Scanner sc = new Scanner(System.in);
        int num;


        System.out.println("--------MENU--------");
        System.out.println("1-Crear una tapa");
        System.out.println("2-Eliminar una tapa");
        System.out.println("3-Obtener un listado de tapas");
        System.out.println("4-Obtener una tapa en concreto");
        System.out.println("5-Modificar una tapa");
        System.out.println("6-Exit");

        System.out.print("¿Que quieres hacer?: ");
        num = sc.nextInt();
        // Menú de 6 opciones
        switch (num) {
            case 1:
                System.out.println("Has elegido crear una tapa");
                break;
            case 2:
                System.out.println("Has elegido borrar una tapa");
                break;
            case 3:
                System.out.println("Has elegido ver un listado de tapas");
                break;
            case 4:
                System.out.println("Has elegido ver una tapa en concreto");
                break;
            case 5:
                System.out.println("Has elegido modificar una tapa");
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Operación no válida. Elige una opción del menú");
                while(num>6 || num<=0){
                    System.out.print("¿Que quieres hacer?: ");
                    num = sc.nextInt();
                }

        }

        sc.close(); // Cerramos el scanner

    }
}
