/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio64;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio64 {

    public static void main(String[] args) {
      //variables, la potencia inicia en 1
        int x,y, potencia=1;
        //Digite variables
        x=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el valor de X"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el valor de Y"));
        //Bucle for en el cual se repetira el mismo numero ingresado "x" el numero "y" de veces y se guardara en la "potencia" 
        for (int i = 1; i <=y; i++) {
            potencia=(potencia*x);
        }
        //Mostrar
        JOptionPane.showMessageDialog(null,x+"^"+y+"= "+potencia);
        
    }
}
