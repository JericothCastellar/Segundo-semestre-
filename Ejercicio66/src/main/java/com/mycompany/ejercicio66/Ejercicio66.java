/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio66;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio66 {

    public static void main(String[] args) {
        //Variables
        int suma=0;
        //Dijite un numero
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
        //Bucle for en el cual se realizara la operacion que pidio
       for (int i=1;i<=(2*n-1);i+=2){
           //Se sume constantemente
        suma=(i+suma);
        }
       //Mostrsar
        JOptionPane.showMessageDialog(null, "Ingresado:"+n+"\nSuma="+suma);

    }
}
