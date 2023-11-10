/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio68;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio68 {

    public static void main(String[] args) {
        //Variables se inicia el factorial en 1
        double factorial=1, suma = 0;
        //Ingresar la variable n
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
        //Bucle for de i=1 hasta el numero ingresado
        for (int i=1;i<=n;i++){
            //Que se realize una multiplicacion de 1*i hasta el numero
            factorial=factorial*i;
            //Se sumen los factoriales
            suma=suma+factorial;
            //Mostrar los factoriales
            System.out.println(factorial);
            
        }
        //Mostrar la suma
        System.out.println("La suma de factoriales es: "+suma);
    }
}
