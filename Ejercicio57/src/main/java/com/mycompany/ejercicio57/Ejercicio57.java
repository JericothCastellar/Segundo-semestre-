/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio57;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio57 {

    public static void main(String[] args) {
        //variables
    int numero, suma=0;
    //ingresar variables
    numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
    //Mientras numero sea diferente de 0
    while (numero!=0){
        //sumar el numumero ingresado modulo de 10
        suma+=numero%10;
        //numero dividido en igual de 10
        numero/=10;
       
    }
    //mostrar:
        JOptionPane.showMessageDialog(null, "La suma de los dijitos ingresados es: "+suma);
    }
}
