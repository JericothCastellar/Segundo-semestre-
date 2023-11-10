/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        //Variable
     float nota;
     //Ingresa la nota
     nota=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijite nota"));
     //Si la nota es mayor a 3.0 aprobaste
        if (nota>3.0) {
            JOptionPane.showMessageDialog(null, "Aprobaste El examen de matematicas");
            
            //Si es menor a esto, reprobaste
        }else{
            JOptionPane.showMessageDialog(null , "Reprobaste El examen de matematicas");
        }
    }
}
