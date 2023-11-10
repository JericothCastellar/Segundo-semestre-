/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio11 {

    public static void main(String[] args) {
         //Variables
        int base, altura;
        float area;
        //Dijite las variables:
        base=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la base del Rectangulo"));
        altura=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la altura del Rectangulo"));
        //Formula:
        area=(base*altura)/2;
        //Mostrar el resultado:
        JOptionPane.showMessageDialog(null, "El area del Rectanculo con base: "+base+"\n y Alura: "+altura+" es: \n"+area);
        
    }
}
