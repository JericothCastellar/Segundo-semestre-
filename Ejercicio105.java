
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
public class Ejercicio105 {
public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables para almacenar las notas
        double nota1, nota2, nota3, nota4;

        // Solicitamos al usuario que introduzca las notas
        System.out.println("Introduce la primera nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Introduce la tercera nota: ");
        nota3 = scanner.nextDouble();
        System.out.println("Introduce la cuarta nota: ");
        nota4 = scanner.nextDouble();

        // Calculamos el promedio de las notas
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        // Visualizamos el resultado
        if (promedio >= 14.5) {
            System.out.println("APROBADO");
        } else if (promedio >= 10) {
            System.out.println("SUPLETORIO");
        } else {
            System.out.println("PERDIDO EL AÑO");
        }
    }
}
