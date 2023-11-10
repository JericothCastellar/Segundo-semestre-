/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio50;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio50 {

    public static void main(String[] args) {
        //Variables
        double numero1, numero2;
 int suma,  multiplicacion;
 //Ingresar variables en reales
        numero1=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer número: "));
        numero2=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer número: "));
//Formula para pasarlas a enteros
         suma = (int) (numero1 + numero2);
        multiplicacion = (int) (numero1 * numero2);
        //Mostrar
           System.out.println("Suma: " + suma+"\nMultiplicacion: "+multiplicacion);
    }
}
