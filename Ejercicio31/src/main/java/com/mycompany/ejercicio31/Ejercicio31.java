/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio31;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        //Variables:
        double basemm, alturamm, areamm,areacm,aream;
        //Ingresar las variables:
        basemm=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base en mm"));
        alturamm=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la altura en mm"));
  //Formulas para area en milimetros en centimetros y en metros
       areamm=(basemm*alturamm)/2;
       areacm= areamm/10;
       aream=areacm/100;
     //Mostrar
    JOptionPane.showMessageDialog(null, "El area es Milimetors es: " + areamm+ "\nEl area es Centimetros es: " + areacm+ "\nEl area es Metros es: " + aream);
    }
}
