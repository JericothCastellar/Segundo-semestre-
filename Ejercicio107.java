
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
public class Ejercicio107 {
    

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaramos la variable para almacenar la edad
        int edad;

        // Solicitamos al usuario que introduzca la edad
        System.out.println("Introduce tu edad: ");
        edad = scanner.nextInt();

        // Verificamos que la edad sea válida
        if (edad < 1 || edad > 100) {
            System.out.println("La edad debe ser un número entre 1 y 100");
            return;
        }

        // Determinamos si la persona es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}