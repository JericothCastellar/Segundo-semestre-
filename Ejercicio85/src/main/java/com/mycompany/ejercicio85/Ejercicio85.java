/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio85;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio85 {

    public static void main(String[] args) {
        //Ingresar un numero
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        //Si al dividir entre 2 su residuo es 2 entonces mostrar que es par
        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero ingresado es PAR");
            //Caso contrario es impar
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado es IMPAR");

        }
    }
}
