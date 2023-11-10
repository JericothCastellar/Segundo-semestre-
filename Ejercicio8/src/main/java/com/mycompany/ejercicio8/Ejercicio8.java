/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        //Crear las variables:
     int n1, n2, restante;
     //Rellene las variables:
    n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
    n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el segundo numero"));
    //Formula para el Resto
    restante=n1%n2;
    //Mostrarlo
        JOptionPane.showMessageDialog(null, "El resultado restante es: "+restante);
     
    }
}
