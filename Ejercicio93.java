/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg93;

import java.util.Scanner;

/**
 *
 * @author Alexis jr
 */
public class Ejercicio93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el tiempo en minutos
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = scanner.nextInt();
        
        // Calcular horas, minutos y segundos
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        int segundos = minutosRestantes * 60;
        
        // Mostrar el tiempo en horas, minutos y segundos
        System.out.println("Tiempo ingresado: " + horas + " horas, " + minutosRestantes + " minutos y " + segundos + " segundos.");
        
        scanner.close();
    }
}
