/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio78;

import javax.swing.JOptionPane;

/**
 * 8. Dado un monto calcular el descuento considerando que por encima de 10000
 * el descuento es el 20% y por debajo de 10000 el descuento es el 10%.
 */
public class Ejercicio78 {

    public static void main(String[] args) {
        //variables
        int total;
        //ingresar monto
        int monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el monto a calcular"));
//Si es mayor a 10.000 aplicar descuento del 20%
        if (monto > 10000) {
            //Aplicar descuento
            total = (monto * 80) / 100;
            //Mostrar
            JOptionPane.showMessageDialog(null, "El Monto | " + monto + " | con un Descuento del 20% | " + total + " |");
//Si es menor del 10.000 aplicar un descuento del 10%
        } else {
            //Aplicar descuento
            total = (monto * 90) / 100;
            //Mostrar
            JOptionPane.showMessageDialog(null, "El Monto | " + monto + " | con un Descuento del 10% | " + total + " |");
        }

    }
}
