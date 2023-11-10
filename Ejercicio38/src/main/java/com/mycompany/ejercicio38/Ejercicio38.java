/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio38;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio38 {

    public static void main(String[] args) {
        //Variables
        int edad;
       double gramos, manzanas;
        //Incertar la variable
        edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la edad de la persona"));
        //Formula 1 kilogramo es =1000 gramos
        gramos=(edad*8)*1000;
        //Formula para manzanas 
        manzanas=((edad*8)*1000)/4;
        //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "La edad es: "+edad+"\n Los gramos que ha consumido fueron: "+gramos+"gr"+
                "Suponiendo que solo consume manzanas: "+manzanas);
        
    }
}
