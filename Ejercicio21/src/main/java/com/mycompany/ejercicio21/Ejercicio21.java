/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucy
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        //variables:
     int a, b, c;
     //Darle valores a las variables:
     a=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el valor de A"));
     b=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el valor de B"));
     //Formula para intercambiar
     c=a;
     a=b;
     b=c;
     //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "Valores intercambiados \n A="+a+"\n B="+b);
   
        
    }
}
