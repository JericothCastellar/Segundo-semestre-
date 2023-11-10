/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        //Variables
        int cantidad, total;
        double iva=0.16;
        //La cantidad 
        cantidad=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la cantidad"));
        //El total que es igual a La Cantidad multiplicada por el IVA
         total=(int) (cantidad+(cantidad*iva));
         //Mostrar resultado
         JOptionPane.showMessageDialog(null, "La cantidad+el IVA es: \n"+total);
       
    }
}
