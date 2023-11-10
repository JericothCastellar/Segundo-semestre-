/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        //Variables
      double centigrados, faren;
      //Ingresar los centigrados
      centigrados=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de grados centigrados que desea pasar a fahrenheit."));
//Formula para pasar centigrados a farenheit
     faren=((centigrados*9)/5)+32;
//Mostrar:
    JOptionPane.showMessageDialog(null, centigrados+ " grados centigrados en grados fahrenheit son: " + faren + " fahrenheit");
    }
}
