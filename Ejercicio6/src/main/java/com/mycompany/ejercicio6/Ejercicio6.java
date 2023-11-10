/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import com.sun.corba.se.spi.orb.OperationFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        //Variables:
        int n1, n2, n3;
        float media;
        //Ingrese las variables:
        n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
        n3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tercer numero"));
        //Formula
        media=(n1+n2+n3)/3;
        //Mostrar resultado
        JOptionPane.showMessageDialog(null, "La media arimetica es: "+media);
        
               
   }
}
