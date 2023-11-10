/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio79;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio79 {

    public static void main(String[] args) {
        //variables
        float Kv = 1000, bombillo = 12, x;
        //calcular voltaje de 3 bombillos
        x = (3 * bombillo) / Kv;
//Mostrar
        JOptionPane.showMessageDialog(null, "El voltaje de 3 bombillos es | " + x + " |");

    }
}
