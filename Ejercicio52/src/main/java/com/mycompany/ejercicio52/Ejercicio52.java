/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio52;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio52 {

    public static void main(String[] args) {
        //Variable
        int n;
        //Incertar variable
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite un número entero: "));     
        //Mostrar en la consola
        System.out.println("Tabla del " + n);
        //For bucle hasta el 10
        for(int i = 1; i<=10; i++){
            //Mostrar en la consola
             System.out.println(n + " x " + i + " = " + n*i);                                                     
        }
    }
}
