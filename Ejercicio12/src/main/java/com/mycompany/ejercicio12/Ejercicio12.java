/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        //Variables
        int nu1, nu2, nu3, suma, doble,tercer;
        double promedio, cuadrado;
        //Dijite los valores de las variables:
        nu1=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el primer numero: "));
        nu2=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el segundo numero: "));
        nu3=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el tercer numero: "));
        //Formulas:
        suma=nu1+nu2+nu3;
        doble=nu1*2;
        tercer=nu2*3;
        promedio=(nu1+nu2+nu3)/3;
        cuadrado=Math.pow(nu3, 2);
        //Mostrar
        JOptionPane.showMessageDialog(null, "Promedio de los 3 Numeros: "+promedio+"\n Suma total de los numeros: "+suma);
        JOptionPane.showMessageDialog(null, "El doble del primer dijito es:"+doble+"\n El terciario del segundo dijito es:"+tercer);
        JOptionPane.showMessageDialog(null, "Y el cuadrado del tercer dijito es: "+cuadrado);
    }
}
