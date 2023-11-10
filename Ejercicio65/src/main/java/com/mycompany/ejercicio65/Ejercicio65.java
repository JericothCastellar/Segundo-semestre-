/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio65;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio65 {

    public static void main(String[] args) {
        //Variables
        int suma=0;
        //Digita un numero
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
        //Bucle for para que i cuente hasta el numero ingresado
        for (int i =0; i <=n; i++) {
            //formula para que i se sume constantemente con suma
            suma=(i+suma);
        }
        //Mostrar
        JOptionPane.showMessageDialog(null, "Ingresado| "+n+"\nSuma= "+suma);
    }
}
