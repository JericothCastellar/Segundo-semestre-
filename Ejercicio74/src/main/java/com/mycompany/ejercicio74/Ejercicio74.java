/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio74;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio74 {

    public static void main(String[] args) {
        //Variables e ingresarlas
        int a=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el Valor de A"));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el Valor de B"));
        int c=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el Valor de C"));
        //Mostrarlos en orden A+B+C
        if (a>b && b>c) {
            JOptionPane.showMessageDialog(null, "Los numeros son\n"+a+" "+b+" "+c);
            //Mostrarlos en A+B+C
        }else if (a>c && c>b ) {
            JOptionPane.showMessageDialog(null, "Los numeros son\n"+a+" "+c+" "+b);
            //Mostrarlos en A+C+B
        }else if (b>a && a>c) {
            JOptionPane.showMessageDialog(null, "Los numeros son\n"+b+" "+a+" "+c);
            //Mostrarlos en B+C+A
        }else if (b>c && c>a) {
           JOptionPane.showMessageDialog(null, "Los numeros son\n"+b+" "+c+" "+a); 
            //Mostrarlos en C+A+B
        }else if (c>a && a>b) {
            JOptionPane.showMessageDialog(null, "Los numeros son\n"+c+" "+a+" "+b);
            //Mostrarlos en C+B+A
        }else if (c>b && b>a) {
            JOptionPane.showMessageDialog(null, "Los numeros son\n"+c+" "+b+" "+a);
        }
    }
}
