/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio30;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio30 {

    public static void main(String[] args) {
        //variables:
         double kilometros, metros;
         //Ingresar kilometros
          kilometros=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Kilometros que quiere pasar a Metros"));
           //Formula para pasarlos a metros
        metros=kilometros*1000;
    //Mostrar
    JOptionPane.showMessageDialog(null, kilometros + "km son iguales a " + metros + "M");
  }
    }

