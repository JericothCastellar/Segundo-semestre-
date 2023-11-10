
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
public class Ejercicio101 {
 public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el número entero
        System.out.println("Introduce el número entero: ");
        int numero = scanner.nextInt();

        // Solicitamos al usuario que introduzca el divisor
        System.out.println("Introduce el divisor: ");
        int divisor = scanner.nextInt();

        // Verificamos si el número es divisible por el divisor
        if (numero % divisor == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("No es divisible");
        }
    }
}
