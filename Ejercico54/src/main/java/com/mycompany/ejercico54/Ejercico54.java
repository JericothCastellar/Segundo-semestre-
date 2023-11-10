/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercico54;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercico54 {

    public static void main(String[] args) {
        //variables
     double centimetros, pulgadas;
     //Ingresar centimetros
     centimetros=Double.parseDouble(JOptionPane.showInputDialog(null, "Cambiar centimetros a pulgadas"));
     //Cambiar centimetros a pulgadas
     pulgadas=centimetros/2.54;
     //Mostrar
        JOptionPane.showMessageDialog(null, "Centimetros a Pulgadas: "+pulgadas);
        
    }
}
