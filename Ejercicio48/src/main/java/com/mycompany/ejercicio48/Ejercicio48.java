/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio48;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio48 {

    public static void main(String[] args) {
        //Variables
 double numero1, numero2;
 int suma, resta, multiplicacion, division, modulo;
 //Ingresar variables en reales
        numero1=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer número: "));
        numero2=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer número: "));
//Formula para pasarlas a enteros
         suma = (int) (numero1 + numero2);
        resta = (int) (numero1 - numero2);
        multiplicacion = (int) (numero1 * numero2);
        division = (int) (numero1 / numero2);
        modulo = (int) (numero1 % numero2);
  //Mostrar en la consola
        System.out.println("Suma: " + suma+"\nResta: "+resta+"\nMultiplicacion: "+multiplicacion+"\nDivision: "+division+"\nModulo: "+modulo);
   
    }
}
