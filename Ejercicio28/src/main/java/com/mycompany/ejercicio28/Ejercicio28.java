/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio28;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        //variables
        int numero;
        //ingresar numero
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
     //bucle For en el cual se resta i hasta que llegue a 0
    for(int i=numero;i!=0;i--){
        //mostrar en la consola
      System.out.println(i);
    }
    }
}
