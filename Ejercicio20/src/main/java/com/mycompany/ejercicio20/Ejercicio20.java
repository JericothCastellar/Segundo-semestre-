/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        float nota1,nota2,nota3,nota4,nota5,suma, promedio, doble1,doble2,doble3,doble4,doble5;
        nota1=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijite la primera nota"));
        nota2=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijite la segunda nota"));
        nota3=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijite la tercera nota"));
        nota4=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijite la cuarta nota"));
        nota5=Float.parseFloat(JOptionPane.showInputDialog(null, "Dijite la quinta nota"));
        suma=(nota1+nota2+nota3+nota4+nota5);
        promedio=suma/5;
        doble1=nota1*2; doble2=nota2*2; doble3=nota3*2; doble4=nota4*2; doble5=nota5*2;
        
        JOptionPane.showMessageDialog(null,"La suma de las notas es: "+suma+"\n Promedio"+promedio+"\n Y el doble es: "+
                doble1+ " "+ doble2+ " "+doble3+" "+doble4+" "+doble5);
    }
}
