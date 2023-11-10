/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        //Variables:
        double numero, decimal, entera;
        numero=Double.parseDouble(JOptionPane.showInputDialog(null, "DIjite un numero Real"));
        decimal=numero%1; 
	entera=numero-decimal;	
        //Mostrar:
        JOptionPane.showMessageDialog(null, "El numero original era: "+numero+"La parte decimal es:"+decimal+
                "\n Y la parte entera es: "+entera);
        
    }
}
