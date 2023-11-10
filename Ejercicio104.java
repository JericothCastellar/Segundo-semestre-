
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
public class Ejercicio104 {
    
public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el número
        System.out.println("Introduce el número: ");
        int numero = scanner.nextInt();

        // Solicitamos al usuario que introduzca el índice de la raíz
        System.out.println("Introduce el índice de la raíz: ");
        int indiceRaiz = scanner.nextInt();

        // Calculamos la raíz del número
        double raiz = Math.pow(numero, 1.0 / indiceRaiz);

        // Imprimimos la raíz del número
        System.out.println("La raíz del número es: " + raiz);
    }
}