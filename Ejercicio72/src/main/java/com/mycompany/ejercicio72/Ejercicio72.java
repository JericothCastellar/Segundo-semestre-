/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio72;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio72 {

    public static void main(String[] args) {
        //Varibales
        int total, hextra, extra;
        //Ingresar variables
        int tarifa=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la tarifa"));
        int horas=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las horas trabajadas"));
        //Si horas extra es mayor a 40
        if (horas>40) {
            //Se resta 40 a las horas extra y se guarda en hextra que son el numero de horas superior a 40 que se pasaron
            hextra=(horas-40);
            //extra se resta entre 40 y se multiplica x50
            extra=(horas-40)*50;
            //Calcular el total que es la tarifa por el extra
            total=(tarifa*extra);
            //Mostrar mensaje con todos los datos
        JOptionPane.showMessageDialog(null, "Tarifa | "+tarifa+" | "+"\nHoras | "+horas+" | "+"\nHoras extra | "+
                hextra+" | "+"\nTotal | "+total+" | "  );
        
            //Caso contrario
        }else{
            //Calcular la el total simplemente y mostrar
        total=(tarifa*horas);    
            JOptionPane.showMessageDialog(null, "Tarifa | "+tarifa+" | "+"\nHoras | "+horas+" | "+
             "\nTotal | "+total+" | ");
        }
      
        
    }
}
