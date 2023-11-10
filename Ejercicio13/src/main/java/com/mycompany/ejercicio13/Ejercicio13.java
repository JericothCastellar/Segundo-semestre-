/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        //variables:
        int nu1,nu2,nu3,u1,u2,u3;
        //Digitar las variables
        nu1=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite primer numero"));
        nu2=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite segundo numero"));
        nu3=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite tercer numero"));
        //formula para contener el ultimo digito:
       u1=nu1%10;
       u2=nu2%10;
       u3=nu3%10;
       //Mostrar
        JOptionPane.showMessageDialog(null, "Ultimo dijito del primer numero: "+u1);
        JOptionPane.showMessageDialog(null, "Ultimo dijito del segundo numero: "+u2);
        JOptionPane.showMessageDialog(null, "Ultimo dijito del tercer numero: "+u3);
    }
}




