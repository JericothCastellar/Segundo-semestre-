/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio59;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio59 {

    public static void main(String[] args) {
          //Variable
        int n;
        //Incertar variable
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite un número entero: ")); 
        //Si numero es mayor a 10
        if (n>10) {
            JOptionPane.showMessageDialog(null, "Dijite un numero del 1 al 10");
            //Si numero es menor a 1
        }else if (n<1)
            JOptionPane.showMessageDialog(null, "Dijite un numero del 1 al 10");
            //Si no se cumple ninguna conclusion anterior entonces continue normalmente
        else{
            //Mostrar en la consola
        System.out.println("Tabla del " + n);
        //For bucle hasta el 10
        for(int i = 1; i<=10; i++){
            //Mostrar en la consola
             System.out.println(n + " x " + i + " = " + n*i);                                                     
        }
        }
        
    }
}
