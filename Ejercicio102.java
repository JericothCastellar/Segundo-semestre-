
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
public class Ejercicio102 {
public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca las horas trabajadas
        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        // Solicitamos al usuario que introduzca la tarifa por hora
        System.out.println("Introduce la tarifa por hora: ");
        float tarifaPorHora = scanner.nextFloat();

        // Calculamos el salario base
        float salarioBase = horasTrabajadas * tarifaPorHora;

        // Calculamos el salario por horas extras
        float salarioHorasExtras = (horasTrabajadas - 40) * (1.25f * tarifaPorHora);

        // Calculamos el salario total
        float salarioTotal = salarioBase + salarioHorasExtras;

        // Imprimimos el salario total
        System.out.println("El salario total es: " + salarioTotal);
    }
}