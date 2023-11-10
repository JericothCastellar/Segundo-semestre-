/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio70;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio70 {

    public static void main(String[] args) {
         //Variables
        int suma=0;
        //Ingresar un digito
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        //Bucle for de i hasta n ingresado
        for (int i=1; i <=n; i++) {
            //Si i al dividirlo deja como residual 0 entonces se restara 1
            if (i%2==0) {
                suma=(suma-i);
                //Si no se sumara
            }else{
                suma=(suma+i);
            }
            
        }
        //Mostrar
        JOptionPane.showMessageDialog(null, "Numero ingresado"+n+"\nSuma= "+suma);
    }
}
