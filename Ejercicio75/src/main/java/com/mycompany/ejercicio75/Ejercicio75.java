/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio75;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio75 {

    public static void main(String[] args) {
        //Iniciar un GregorianCaldendar
        GregorianCalendar calendar = new GregorianCalendar();
        //Variable de año
        int año = 0;
        //Ingresar el año
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el año"));
   //Si el año es bisiesto
        if (calendar.isLeapYear(año)) {
            JOptionPane.showMessageDialog(null, "El año es |BISIESTO|");
        } else {
            //Si no lo es

            JOptionPane.showMessageDialog(null, "El año |NO ES BISIESTO|");
        }
    }

}
