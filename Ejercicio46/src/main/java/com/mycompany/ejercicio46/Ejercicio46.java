/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio46;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio46 {

    public static void main(String[] args) {
        //Variables
   double millas,metros;
        millas=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de millas a convertir"));
        //Formula
        metros=millas*1852;
        //Mostrar
        JOptionPane.showMessageDialog(null,"La cantidad de metros en "+millas+" millas es de: "+metros+" m");
    
    }
}
