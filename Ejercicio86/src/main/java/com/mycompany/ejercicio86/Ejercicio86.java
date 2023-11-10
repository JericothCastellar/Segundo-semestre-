/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio86;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio86 {

    public static void main(String[] args) {
        //variables
        int suma = 0, promedio;
        //Bucle for hasta 5
        for (int i = 0; i < 5; i++) {
            int voltajes = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el " + (i + 1) + " Voltajes"));
            //Sumar voltajes
            suma += voltajes;
        }
        //Sacar promedio
        promedio = suma / 5;
        //Si el promedio es mayor que 220 mostrar alto voltaje
        if (promedio > 220) {
            JOptionPane.showMessageDialog(null, "VOLTAJE ALTO");
            //Caso contrario mostrar voltaje correcto
        } else {
            JOptionPane.showMessageDialog(null, "VOLTAJE CORRECTO");
        }
    }
}
