/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio41;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio41 {

    public static void main(String[] args) {
     double edad, centimetros, metros;
     edad=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la edad"));
     //Formula
     centimetros=edad*0.5;
     metros=centimetros/100;
     //Mostrar
        JOptionPane.showMessageDialog(null, "La edad es"+edad+"\n El cabello en centimetros es: "+centimetros+
                "\n Y en metros: "+metros);
     
        
        
    }
}
