/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio76;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio76 {

    public static void main(String[] args) {
        //variables
        int digitos;
        //Digitar variables
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        //Si es 0 sumar 1
        if (n == 0) {
            n++;
        }
        //Dividir entre 10 y sumar 1
        digitos = (int) (Math.log10(n) + 1);
        //Mostrar
        JOptionPane.showMessageDialog(null, "El numero | " + n + " | Posee un total de | " + digitos + " | Digitos");

    }
}
