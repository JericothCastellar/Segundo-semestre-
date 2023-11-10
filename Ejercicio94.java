/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg94;

import java.util.Scanner;

/**
 *
 * @author Alexis jr
 */
public class Ejercicio94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Calcular el valor absoluto del número
        int valorAbsoluto = Math.abs(numero);
        
        // Mostrar el valor absoluto del número
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
        
        scanner.close();
    }
}
