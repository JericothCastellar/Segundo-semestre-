/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio36;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio36 {

    public static void main(String[] args) {
        //variables 
        double horas,minutos,total, total2, total3;
        //Ingresar variables
        horas=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite las horas estacionadas"));
        minutos=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite los minutos estacionados"));
        //Formulas 1 hora=15.00, 1 minuto=0.25
        total=horas*15.00;
        total2=(minutos*0.25);
        total3=total+total2;
        //Mostrar
        JOptionPane.showMessageDialog(null, "El precio total por las horas estacionadas es: "+total3+"$");
    }
}
