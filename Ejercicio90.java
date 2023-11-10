/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg90;

import java.util.Scanner;

/**
 *
 * @author Alexis jr
 */
public class Ejercicio90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Ingresar la matriz
        System.out.println("Ingrese la matriz (número de filas x número de columnas): ");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Ingresar el vector
        System.out.println("Ingrese la longitud del vector:");
        int longitud = scanner.nextInt();
        int[] vector = new int[longitud];
        
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < longitud; i++) {
            vector[i] = scanner.nextInt();
        }
        
        // Contar los números primos en la matriz y el vector
        int countMatriz = contarPrimos(matriz);
        int countVector = contarPrimos(vector);
        
        // Mostrar los resultados
        System.out.println("Cantidad de números primos en la matriz: " + countMatriz);
        System.out.println("Cantidad de números primos en el vector: " + countVector);
        
        scanner.close();
    
     // Función para verificar si un número es primo
    }public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Función para contar los números primos en una matriz
    public static int contarPrimos(int[][] matriz) {
        int count = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (esPrimo(num)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    // Función para contar los números primos en un vector
    public static int contarPrimos(int[] vector) {
        int count = 0;
        for (int num : vector) {
            if (esPrimo(num)) {
                count++;
            }
        }
        return count;
    }
}

