/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        //Variables
        int numero;
        //Dijite la variable
        numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero: "));
        //Si el numero es mayor o igual a 0 mostrar que es POSITIVO
        if (numero>=0) {
            JOptionPane.showMessageDialog(null, "El numero Ingresado es POSITIVO"); 
            //Si no se cumple la primera condicion entonces es NEGATIVO y mostrar ese mensaje
        }else{
            JOptionPane.showMessageDialog(null, "El numero Ingresado es NEGATIVO");
        }
    }
}
