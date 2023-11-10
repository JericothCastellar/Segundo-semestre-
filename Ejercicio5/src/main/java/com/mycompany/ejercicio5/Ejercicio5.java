/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //Declarar las variables:
        float diagonalm, diagoname, area;
        //Ingresar las variables
        diagonalm=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijite la Diagonal mayor "));
        diagoname=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijiste la Diagonal menor "));
        //Formula
        area=(diagonalm*diagoname)/2;
        //Mostrar resultado
        JOptionPane.showMessageDialog(null, "El area del rombo es: "+area);
        
        
    }
}
 

