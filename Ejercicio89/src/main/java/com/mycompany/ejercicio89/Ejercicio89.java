/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio89;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio89 {

    public static void main(String[] args) {
        //variable en metros
        double metros=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite los metros a kilometros"));
        //pasar a kilometros
        double kilometros=metros/1000;
        //Mostrar
        JOptionPane.showMessageDialog(null, "Metros | "+metros+" | \nKilometros | "+kilometros+" |");
        
    }
}
