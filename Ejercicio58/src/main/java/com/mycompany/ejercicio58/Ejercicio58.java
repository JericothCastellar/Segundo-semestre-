/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio58;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio58 {

    public static void main(String[] args) {
        //Variables y salario minimo
     int horas, salario=160000;
     //Ingresar las horas trabajadas
     horas=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite las horas"));
     //Formula para el salario
     salario=horas*salario;
     //Mostrar
        JOptionPane.showMessageDialog(null, "El salario es: "+salario);
     
        
    }
}
