/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        //Variables
        int pulgadas;
        double centimetros;
        //Ingresar pulgadas
        pulgadas=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el numero de pulgas"));
        //convertir pulgadas a centimetros 1 plg=2.54cm
        centimetros=pulgadas*2.54;
        //Mostrar pulgadas
        JOptionPane.showMessageDialog(null, pulgadas+" Pulgadas>>> "+centimetros+"CM");
        
    }
}
