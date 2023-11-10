/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio87;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio87 {

    public static void main(String[] args) {
        //Ingrese base altura
        double base=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la base"));
        double altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la base"));
        //area base por altura entre 3
        double area=(base*altura)/3;
        //Si el area es mayor a 1000
        if (area>1000) {
            JOptionPane.showMessageDialog(null, "DATOS NO VALIDOS");
            //caso contrario
        }else{
            JOptionPane.showMessageDialog(null, "Base |"+base+"| Y Altura | "+altura+" | \n"
                    + "Area=| "+area+" |");
        }
    }
}
