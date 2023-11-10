/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio88;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio88 {

    public static void main(String[] args) {
         //variables
        int suma = 0, promedio;
        //Bucle for hasta 5
        for (int i = 0; i < 3; i++) {
            int voltajes = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el " + (i + 1) + " Voltajes"));
            //Sumar voltajes
            suma += voltajes;
        }
        //Sacar promedio
        promedio = suma / 3;
        //Si el promedio es mayor que 220 mostrar alto voltaje
        if (promedio<=115) {
            JOptionPane.showMessageDialog(null, "Voltaje correcto");
            
        }else if (promedio>115 && promedio<=220) {
            JOptionPane.showMessageDialog(null, "Voltaje ALTO");
            
        }else if (promedio>220){
            JOptionPane.showMessageDialog(null, "PELIGRO");
        }
    }
}
