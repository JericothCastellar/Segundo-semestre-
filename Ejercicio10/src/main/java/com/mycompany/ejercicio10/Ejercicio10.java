/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        //Variables
        int base, altura;
        float area;
        //Dijite las variables:
        base=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la base del triangulo"));
        altura=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la altura del triangulo"));
        //Formula:
        area=(base*altura)/2;
        //Mostrar el resultado:
        JOptionPane.showMessageDialog(null, "El area del triangulo es: \n"+area);
        
    }
}
