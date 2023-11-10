/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio73;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio73 {

    public static void main(String[] args) {
        //Variables
        int total = 0;
        //Ingresar variables
        int sueldo=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el sueldo"));
        //Si el sueldo es menor o igual a 1000
        if (sueldo<=1000) {
            //Aplicando un 10%
            total=(sueldo*90)/100;
            //Si sueldo es mayor a mil pero menor o igual a 2000
        }else if (sueldo>1000 && sueldo<=2000) {
            //Aplicando un 5% extra
            total=(sueldo*85)/100;
            //Si el sueldo es mayor a 2000
        }else if (sueldo>2000) {
            //aplicar un 3% extra
            total=(sueldo*82)/100;
        }
        //mostrar
        JOptionPane.showMessageDialog(null, "Sueldo "+sueldo+"\nCon descuento el total es: "+total);
        
    }
}
