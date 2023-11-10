
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
public class Ejercicio108 {
 public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaramos la variable para almacenar el número
        int numero;

        // Solicitamos al usuario que introduzca el número
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();

        // Determinamos si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
