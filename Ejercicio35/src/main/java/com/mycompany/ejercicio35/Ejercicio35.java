/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio35;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        //variables
        int horas, pago, total;
        //Ingresar horas y pago
       horas=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas horas trabajo"));
       pago=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuanto le pagan por hora"));

    if(horas<=40){
      total=horas*pago;
      JOptionPane.showMessageDialog(null, "Usted gano: " + total + "$");
    }else{
      int extra= horas-40;
      int fi=40*pago;
      int lol=pago/2;
      pago=pago+lol;
      int sal= extra*pago;
      int pagado=fi+sal;
      
JOptionPane.showMessageDialog(null, "Usted gano: " + pagado + "$");
    
    }
    }
}
