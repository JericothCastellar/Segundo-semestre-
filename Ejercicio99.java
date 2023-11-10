
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cleodeth Ospino P
 */
public class Ejercicio99 {
  public static boolean esBisiesto(int año) {
        // Un año es bisiesto si es divisible por 4 y no es divisible por 100, o si es divisible por 400
        return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
    }

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el año
        System.out.println("Introduce el año: ");
        int año = scanner.nextInt();

        // Llamamos a la función esBisiesto() para determinar si el año es bisiesto
        boolean esBisiesto = esBisiesto(año);

        // Imprimimos el resultado de la verificación
        if (esBisiesto) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }
}
