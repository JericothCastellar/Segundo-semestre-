/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio63;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio63 {

    public static void main(String[] args) {
        //Variables
        int suma = 0,num;
        //Bucle do while en el cual seguira siempre que sea diferente de 0 el numero ingresado
        do {
            //Ingresar un numero siempre 
            num=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
            //Sumar enteros
            suma=(num+suma);
            //Si el numero esta entre 20-30 se rompe el bucle
            if (num>=20 && num<=30) {
            break; 
            }        
        } while (num!=0);
        //Mostrar resultados
        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: "+suma);
    }
}
