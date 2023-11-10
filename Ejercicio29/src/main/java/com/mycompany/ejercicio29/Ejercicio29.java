/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio29;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        //variable
    float a, cubo;
    //Ingresar variable
     a=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese un numero real"));
   //Para calcular un cubo se tiene que multiplicar 3 veces por el mismo numero
      cubo= a*a*a;
   //mostrar
    JOptionPane.showMessageDialog(null, "El cubo de " + a + " Es " + cubo);
    }
}
