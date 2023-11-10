
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
public class Ejercicio106 {
  public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables para almacenar los números
        int m, n;

        // Solicitamos al usuario que introduzca los números
        System.out.println("Introduce el primer número: ");
        m = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        n = scanner.nextInt();

        // Llamamos al algoritmo de Euclides
        int mcd = mcd(m, n);

        // Imprimimos el resultado
        System.out.println("El máximo común divisor es: " + mcd);
    }

    public static int mcd(int m, int n) {
        // Si n es 0, el MCD es m
        if (n == 0) {
            return m;
        }

        // Calculamos el resto de la división de m por n
        int r = m % n;

        // Recurrimos al algoritmo de Euclides con n y r
        return mcd(n, r);
    }
}
