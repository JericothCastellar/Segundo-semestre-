/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio26;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        //Ingresar las variables y usarlas
       double l1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el cateto 1"));
       double l2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el cateto 2"));
       //Formular para la hipotenusa
       double hipotenusa=(l1*l1)+(l2*l2);
   //Mostrar
       JOptionPane.showMessageDialog(null, "La hiptenusa al cuadrado es: " + hipotenusa);
  }
}
