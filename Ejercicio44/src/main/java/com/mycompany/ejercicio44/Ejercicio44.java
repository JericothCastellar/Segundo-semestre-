/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio44;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio44 {

    public static void main(String[] args) {
        // Calcular las potencias de 2 a la 10 del número PI
        for (int exponente = 2; exponente <= 10; exponente++) {
            double potencia = Math.pow(Math.PI, exponente);
            System.out.println("PI^" + exponente + " = " + potencia);
            
            // Calcular la raíz cuadrada de la potencia
            double raizCuadrada = Math.sqrt(potencia);
            System.out.println("Raíz cuadrada de PI^" + exponente + " = " + raizCuadrada);
            
            System.out.println(); // Separador entre resultados
    } 
    }
}
