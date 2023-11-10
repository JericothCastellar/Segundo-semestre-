/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio47;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio47 {

    public static void main(String[] args) {
        //variables
        int cantidadComprada, precioCompra,preciopagado,descuento,porcentajeDescuento;
        //Ingresar variables
       cantidadComprada=Integer.parseInt(JOptionPane.showInputDialog(null, "Incerte la cantiada comprada"));
        precioCompra=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el precio de la compra"));
        preciopagado=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el precio de pagado"));
          //Formula para el descuento y el porcentaje de descuento
         descuento = precioCompra - preciopagado;
         porcentajeDescuento = (descuento / precioCompra) * 100;
      //mostrar.
        JOptionPane.showMessageDialog(null, "El porcentaje descontado es: " + porcentajeDescuento + "%");
    }
}
