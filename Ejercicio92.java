/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg92;

import java.util.Scanner;

/**
 *
 * @author Alexis jr
 */
public class Ejercicio92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de los vectores
        System.out.print("Ingrese el tamaño de los vectores: ");
        int tamaño = scanner.nextInt();

        // Crear los vectores
        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];

        // Solicitar al usuario los elementos del primer vector
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        // Solicitar al usuario los elementos del segundo vector
        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        // Calcular el producto escalar
        int productoEscalar = 0;
        for (int i = 0; i < tamaño; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        // Mostrar el resultado
        System.out.println("El producto escalar de los vectores es: " + productoEscalar);

        scanner.close();
    }
}
