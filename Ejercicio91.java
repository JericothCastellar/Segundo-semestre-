/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg91;

import java.util.Scanner;

/**
 *
 * @author Alexis jr
 */
public class Ejercicio91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        // Solicitar al usuario que ingrese el apellido
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        
        // Solicitar al usuario que ingrese la edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        // Solicitar al usuario que ingrese el número de celular
        System.out.print("Ingrese su número de celular: ");
        long numeroCelular = scanner.nextLong();
        
        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de celular: " + numeroCelular);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
