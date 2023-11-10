/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        int a, b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el primer numero"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el segundo numero"));
        if (a>b) {
            JOptionPane.showMessageDialog(null, "El primer numero: "+a+" Es mayor que el segundo: "+b);
            
        }else{
            JOptionPane.showMessageDialog(null, "El segundo numero: "+b+" Es mayor que el primero: "+a);
        }
    }
}
