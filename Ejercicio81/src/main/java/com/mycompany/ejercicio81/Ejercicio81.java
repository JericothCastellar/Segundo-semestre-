/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio81;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio81 {

    public static void main(String[] args) {
        //ingresar el radio
        int r = Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el radio del circulo"));
        //Elevar el radio a la 2
        int radio = (int) Math.pow(r, 2);
        //calcular el area
        double area = (Math.PI) * radio;
        //En caso de que el area sea mayor a 5000
        if (area > 5000) {
            JOptionPane.showMessageDialog(null, "DATOS ERRONEOS");

        } else {
            //Mostrar
            JOptionPane.showMessageDialog(null, "El area del circulo es | " + area + " |");
        }

    }
}
