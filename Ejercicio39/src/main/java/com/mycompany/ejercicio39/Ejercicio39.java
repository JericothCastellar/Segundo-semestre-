/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio39;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio39 {

    public static void main(String[] args) {
        //Variables
        String nombre;
        double nacimiento, actual, años, dias, dormir;
        //Rellenar variables
            nacimiento=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el año de nacimiento"));
            actual=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el año actual"));
            nombre=JOptionPane.showInputDialog(null,"Ingrese su nombre");
        //Formulas
       años=actual-nacimiento;
       dias=(años*365);
       dormir=(dias/100)*34;
   //Mostrar
    JOptionPane.showMessageDialog(null, nombre + " durmio " + dormir + " dias");
    
    }
}
