/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio55;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio55 {

    public static void main(String[] args) {
        //Variables
     int n, a = 0;
     //Ingresar variables
     n=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
     //Bucle for 
      for (int i = 1; i <=n; i++) {
          //Si el residuo ingresado es igual a 0 entonces que se sume a a
            if (n%1 == 0){
                a++;
            }
        }
        //Si a es igual a 2 entonces es divisible entre 2 por lo tanto es primo
        if (a ==2){
            //Mostrar
            JOptionPane.showMessageDialog(null,"Es primo "+1);
        } else {
            //Caso contrario no es primo
            JOptionPane.showMessageDialog(null,"No es primo"+0);
        }
     
    }
}
