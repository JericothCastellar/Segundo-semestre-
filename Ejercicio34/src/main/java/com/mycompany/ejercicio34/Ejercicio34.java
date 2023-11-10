/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio34;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio34 {

    public static void main(String[] args) {
        //Variables
     int monto, total, totaldescuento;
     //Ingresar el monto
    monto=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el Monto de la compra"));
    //Si el monto es mayor a 1000
        if (monto>1000) {
            //El Monto+el Descuento
            total=(90*monto)/100;
            //La cantidad descontada
            totaldescuento=(10*monto)/100;
            //Mostrar
            JOptionPane.showMessageDialog(null, "El monto total "+monto+" con un descuento del 20% es: "+total+" el total de descuento es: "+totaldescuento);
        }
        //Si el monto es mayor a 500 y Menor o igual a 1000
        if (monto>500 && monto<=1000) {
            //Monto+el descuento
            total=(80*monto)/100;
            //La cantidad descontada
            totaldescuento=(20*monto)/100;
            //Mostrar
            JOptionPane.showMessageDialog(null, "El monto total "+monto+" con un descuento del 20% es: "+total+" el total de descuento es: "+totaldescuento);            
        }
        //Si el monto es menor o igual a 500
        if (monto<=500) {
            //Mostrar
            JOptionPane.showMessageDialog(null, "No se aplico descuento, Monto total:"+monto);
            
        }
    }
}
