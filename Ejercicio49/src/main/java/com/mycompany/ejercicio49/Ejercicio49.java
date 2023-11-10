/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio49;

import java.util.Scanner;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio49 {
    //Creacion de la formula para obtener el ultimo texto en Public static
   public static char obtenerPrimeraLetra(String texto) {
       //Si el texto esta vacio
        if (texto == null || texto.isEmpty()) {
            //Mostrar mensaje de error
            throw new IllegalArgumentException("La cadena no puede estar vacía.");
        }
        return texto.charAt(0);
    }
//De vuelta a la clase Main
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);{
  //Introducir texto
        System.out.print("Introduce un texto: ");
        String cadena = scanner.nextLine();
//Metodo para obtener la primera letra
        char primeraLetra = obtenerPrimeraLetra(cadena);
        //Mostrar y cerrar 
        System.out.println("La primera letra es: " + primeraLetra);
        scanner.close();
    }
    }
}
