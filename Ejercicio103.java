
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
public class Ejercicio103 {
 public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el primer número
        System.out.println("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitamos al usuario que introduzca el segundo número
        System.out.println("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Solicitamos al usuario que introduzca el tercer número
        System.out.println("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();

        // Verificamos cuál de los números es el menor
        if (numero1 < numero2 && numero1 < numero3) {
            // El número menor es el primero
            System.out.println("El número menor es: " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            // El número menor es el segundo
            System.out.println("El número menor es: " + numero2);
        } else {
            // El número menor es el tercero
            System.out.println("El número menor es: " + numero3);
        }
    }
}
