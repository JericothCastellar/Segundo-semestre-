/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio69;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio69 {

    public static void main(String[] args) {
        //Ingresar
   int n=Integer.parseInt(  JOptionPane.showInputDialog(null, "Cuantas iteraciones desea hacer"));
   //Suma inicia en 0
   int suma=0;
   //la variable en 21
   int variable=21;
   //Suma hasta el numero
    for(int i=0;i<n;i++){
        //Se suma + la varibable
     suma=suma+variable;
     //se le suma 1 a la variable
     variable=variable+1;
     //Mostrar
    }
    JOptionPane.showMessageDialog(null, "Realizando | " + n+ " |"+" | \ncomenzando desde 21 la sumatoria es igual " +suma);
    }
    }

