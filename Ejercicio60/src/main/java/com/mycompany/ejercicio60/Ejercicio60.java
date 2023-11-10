/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio60;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio60 {

    public static void main(String[] args) {
        //variables
       int numero, conteo=0;
       //Ciclo do while para que se repita una y otra vez la accion
        do {            
            //Dijite un numero
            numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero"));
            //si el numero es mayor a 0 aumente el conteo en 1
            if (numero>0) {
                conteo++;
                
            }
            //El bucle seguira siempre y cuando numero sea diferente de 0, por ultimo mostrar el conteo de numeros mayores a 0
        } while (numero !=0);
        JOptionPane.showMessageDialog(null, "El conteo de numeros mayores a 0 fue de: "+conteo);
        
    }
}
