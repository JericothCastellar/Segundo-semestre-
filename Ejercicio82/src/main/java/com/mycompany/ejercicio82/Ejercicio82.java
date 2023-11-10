/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio82;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio82 {

    public static void main(String[] args) {
        //Ingresar numero
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        //Si es mayor o igual a 0 mostrar positivo
        if (n>=0) {
            JOptionPane.showMessageDialog(null, "El numero es POSiTIVO");
            //Si es menor a 0 mostrar que es negativo
        }else{
            JOptionPane.showMessageDialog(null, "El numero es NEGATIVO");
        }
               
    }
}
