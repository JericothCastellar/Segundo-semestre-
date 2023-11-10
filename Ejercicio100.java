
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
public class Ejercicio100 {
 public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el primer número
        System.out.println("Primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitamos al usuario que introduzca el segundo número
        System.out.println("Segundo número: ");
        int numero2 = scanner.nextInt();

        // Sumamos los dos números
        int suma = numero1 + numero2;

        // Verificamos si la suma es par
        if (suma % 2 == 0) {
            System.out.println("La suma es par");
        } else {
            System.out.println("La suma es impar");
        }
    }
}
