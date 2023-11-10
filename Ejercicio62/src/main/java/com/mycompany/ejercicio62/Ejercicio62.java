/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio62;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
//Entrada
public class Ejercicio62 {

    public static void main(String[] args) {
        //Menor y mayor
        double mayor = 0,menor = 0;
        //Ingresar la primer temperatura
        double temp1=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la primera temperatura"));
        //Ingresar que la primera temperatura sera clasificada como mayor y tambien menor
        if (temp1>mayor) {
            mayor=temp1;
            menor=temp1;
        }
        //Se vuelve a ingresar una temperatura
        double temp2=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la segunda temperatura"));
        //Determinar si esa temperatura es la mayor y la menor, el proceso se repite con cada variable
        if (temp2>mayor) {
            mayor=temp2;
        }else if (temp2<menor) {
            menor=temp2;
            
        }
        double temp3=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la tercera temperatura"));
        if (temp3>mayor) {
            mayor=temp3;
        }else if (temp3<menor) {
            menor=temp3;
            
        }
        double temp4=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la cuarta temperatura"));
        if (temp4>mayor) {
            mayor=temp4;
        }else if (temp4<menor) {
            menor=temp4;
            
        }
        double temp5=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la quinta temperatura"));
        if (temp5>mayor) {
            mayor=temp5;
        }else if (temp5<menor) {
            menor=temp5;
            
        }
        double temp6=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite la sexta temperatura"));
        if (temp6>mayor) {
            mayor=temp6;
        }else if (temp6<menor) {
            menor=temp6;
            
    
        }
        //Formula para la media:
        double media=(temp1+temp2+temp3+temp4+temp5+temp6)/6;
        //Mostrar
        JOptionPane.showMessageDialog(null,"La media temperatura es"+ media
        +"\n El mayor es: "+mayor+"\n El menor es: "+menor);
    }
}
