/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio83;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio83 {

    public static void main(String[] args) {
        //Variables
        int suma = 0, promedio;
        //Bucle for hasta 3 que serian las 3 notas
        for (int i = 0; i < 3; i++) {
            //Ingresar las notas
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la " + (i + 1) + " nota"));
            //Sumar las notas
            suma += nota;
            //Si la nota es mayor a 10 entonces mostrar que no se puede
            if (nota > 10) {
                JOptionPane.showMessageDialog(null, "Solo notas menores a 10");
                return;
            }
        }
        //Calcular promedio
        promedio = suma / 3;
        //Si el promedio es mayor o igual a 7 aprobo
        if (promedio >= 7) {
            JOptionPane.showMessageDialog(null, "APROBADO \nPromedio | " + promedio + " |");
            //Caso contrairo no aprobo
        } else {
            JOptionPane.showMessageDialog(null, "MEJORE SU NOTA \nPromedio | " + promedio + " |");
        }

    }
}
