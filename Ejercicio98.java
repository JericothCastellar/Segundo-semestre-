
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
public class Ejercicio98 {
  public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el primer número
        System.out.println("Primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitamos al usuario que introduzca el segundo número
        System.out.println("Segundo número: ");
        int numero2 = scanner.nextInt();

        // Calculamos la suma y la resta de los números
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;

        // Dividimos la suma entre la resta
        double division = (double) suma / resta;

        // Verificamos si la división es exacta
        if (division % 1 == 0) {
            System.out.println("La división es exacta");
        } else {
            System.out.println("La división no es exacta");
        }
    }
}
