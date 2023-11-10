/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio53;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio53 {

    public static void main(String[] args) {
        //Variables
        double lado, area;
        //Ingresar variables
       lado=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite de cuantos CM es uno de los lados del cuadrado"));
       //El area de un cuadrado es su propio lado multiplicado por si mismo
       area= lado*lado;
       //Mostrar
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+area);

    }
}
