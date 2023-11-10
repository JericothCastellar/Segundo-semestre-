/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio27;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        //Variables
         String nombre;
         int genero;
         //Ingresar nombre y Genero
      genero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su genero\n 1.masculino\n 2.femenino\n 3.no binario"));
      nombre= JOptionPane.showInputDialog(null,"Ingrese su nombre");
    //Si genero es igual a 1 hombre
    if(genero==1){
      JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }else{
        //Si genero es igual a 2 Femenino
      if(genero==2){
JOptionPane.showMessageDialog(null, "Bienvenida " + nombre);
      }else{
          //Mostrar que es no binario o no se decide
        JOptionPane.showMessageDialog(null, "hola indeciso");
      }
    }
    }
}
