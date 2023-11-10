/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio45;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio45 {

    public static void main(String[] args) {
        //Variables
          int num;
          //Ingresar variable
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
        //Si el numero es mayor que 0
        if (num>0){
            //El valor es real 1
            JOptionPane.showMessageDialog(null,"El valor del numero real es 1");
            //Si es menor a 0 entonces
        }else if (num<0){
            //el valor es -1
            JOptionPane.showMessageDialog(null,"El valor del numero real es -1");
            //Si es 0 entonces es 0
        }else if (num==0){
            JOptionPane.showMessageDialog(null,"El valor del numero real es 0");
        }
    }
}
