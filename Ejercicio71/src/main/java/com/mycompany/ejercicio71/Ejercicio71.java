/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio71;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio71 {

    public static void main(String[] args) {
        //Serie fibonaci 
        //Variables iniciales
        int num1=0, num2=1,num3=1,suma=1;
        //ingresar un numero
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
        //Bucle for 
        for (int i=1; i<n;i++){
            //mostrar suma
            System.out.println(suma);
            //Realizar los conteos de fibonacci
            suma=(num1+num2);
            num1=num2;
            num2=suma;
            
                    
            
        }
        
    }
}
