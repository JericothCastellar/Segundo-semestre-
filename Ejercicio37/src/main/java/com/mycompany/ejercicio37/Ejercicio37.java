/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio37;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio37 {

    public static void main(String[] args) {
       double horas, minutos,pagar, cobro=15;
        horas=Double.parseDouble(JOptionPane.showInputDialog(null,"Cuantas horas estuvo estacionado"));
        minutos=Double.parseDouble(JOptionPane.showInputDialog(null,"Cuantos minutos estuvo estacionado"));
        //Si los minutos son menor o igual a 10
    if(minutos<=10){
       pagar=horas*cobro;
       //Mostrar
      JOptionPane.showMessageDialog(null, "Usted debe pagar " + pagar);
    }else{
        //Si no entonces:
      horas=horas+1;
       pagar=horas*cobro;
       //Mostrar
      JOptionPane.showMessageDialog(null, "Usted debe pagar " + pagar);
    }
    }
}
