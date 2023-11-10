/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio43;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio43 {

    public static void main(String[] args) {
        //variables
 int num1,num2,menor;
 //Incertar variables
  num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite Primer numero"));
  num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite Segundo numero"));
  //Si num1 es mayor a num2
        if (num1>num2) {
            //El numero menor es num2
            menor=num2;
            
            //En caso contrario Num1 es el menor.
        }else{
            menor=num1;
        }
        //Mostrar
            JOptionPane.showMessageDialog(null, "Numero Menor:"+menor);

    }
}
