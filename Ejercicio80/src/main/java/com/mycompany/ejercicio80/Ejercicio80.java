/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio80;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio80 {

    public static void main(String[] args) {
        //Dijitar el entero
        int entero=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el entero"));
        //Dijitar el numero real
        float real=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el numero real"));
        //Mostrar ambos
        JOptionPane.showMessageDialog(null, "Entero ingresado | "+entero+" | Real ingresado | "+real+" |");
        
    }
}
