/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        //variables
        int edad;
        //Ingresar el valor de la variable:
        edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        //condicion  si usted es mayor de Edad
        if (edad>18) {
            JOptionPane.showMessageDialog(null, "Su edad indica que usted es MAYOR DE EDAD");
            //condicion anterior no cumplida, usted es menor de edad
        }else{
            JOptionPane.showMessageDialog(null, "Su edad indica que usted es MENOR DE EDAD");
        }
    }
}
