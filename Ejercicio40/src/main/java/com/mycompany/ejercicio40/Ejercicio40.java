/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio40;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio40 {

    public static void main(String[] args) {
      //Variables
        double kilogramos, gramos, pesos, total;
        //Ingresar la variables pesos y kilogramos
        pesos=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite cuanto vale"));
        kilogramos=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite los kilogramos"));
        //Formula para gramos 
        gramos=(kilogramos*28.3495)/1000;
        //Formula para el precio
        total=pesos*gramos;
        //mostrar:
        JOptionPane.showMessageDialog(null, "El precio total es: "+total+"$");
    }
}
