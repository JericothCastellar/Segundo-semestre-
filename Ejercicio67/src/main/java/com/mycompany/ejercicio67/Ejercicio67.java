/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio67;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio67 {

    public static void main(String[] args) {
        //variables se inicia el 1 para que multiplique x0
        int multiplicacion=1;
        //Ingresar numeros
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        //Bucle for hasta numero ingresado
        for (int i =1; i <=n; i++) {
            //Multiplicar i por la variable mientras el bucle for siga
            multiplicacion=(i*multiplicacion);
            
        }
        //Mostrar
        JOptionPane.showMessageDialog(null,"Numero ingresado"+n+"\nFactorial"+multiplicacion);
    }
}
