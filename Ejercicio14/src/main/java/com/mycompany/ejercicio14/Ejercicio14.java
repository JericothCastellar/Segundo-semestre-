/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        //variables
        int numero,ultimo,penultimo,segundo, primero, suma;
        //Ingresar numero
        numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite un numero mayor a 1000"));
        //condicion para que funcione
        if (numero>999 && numero<10000) {
            //Formula
            ultimo=numero%10;
            penultimo=(numero/10)%10;
            segundo=(numero/100)%10;
            primero=(numero/1000)%10;
            suma=primero+segundo+penultimo+ultimo;
            //Mostrar que digitos y la suma de los digitos
        JOptionPane.showMessageDialog(null,
       "Primer digito: "+primero+"\n Segundo digito: "+segundo+"\n Tercer Digito: "+penultimo+" \n Cuarto digito: "+ultimo+"\n Y la Suma es: "+suma);
        //condicion el numero no es mayor que 1000 y menor o igual a 9999
        }else{
         JOptionPane.showMessageDialog(null, "El numero tiene que ser mayor que 1.000 y Menor que 10.000");   
        }
        
    }
}
