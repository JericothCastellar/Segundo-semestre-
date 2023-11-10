/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23b;
import javax.swing.JOptionPane;


/**
 *
 * @author JERICOTH
 */
public class Ejercicio23B {

    public static void main(String[] args) {
    
       //Variables y Aleatorios
       //Colores
       String r1=" ",r2=" ",r3=" ";  
       //variables aleatorias
       int na1,na2,na3, contador=0;
        na1=(int) (Math.random()*9);
        //Metodo para que no se repitan numeros
        do {
            na2=(int)(Math.random()*9);
        } while (na2==na1);
        do {
            na3=(int) (Math.random()*9);
        } while (na3==na1 && na3==na2);

            //para probar/Revisar los numeros aleatorios:  System.out.println(" | "+na1+" | "+na2+" | "+na3);
        //Bucle do while
        do {
            //
        int n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite primer numero"));
         int n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite primer numero"));
         int n3=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite primer numero"));
         //Condicionales para los colores
         //Numero 1
            if (n1==na1) {
                r1="VERDE";
            }else if (n1==na2) {
                r1="AMARILLO";
            }else if (n1==na3){
                r1="AMARILLO";
            }else{
                r1="ROJO";
                //Numero 2
            }
            if (n2==na2) {
                r2="VERDE";
            }else if (n2==na1) {
                r2="AMARILLO";
            }else if (n2==na3){
                r2="AMARILLO";
            }else{
                r2="ROJO";
            }
            //Numero 3
            if (n3==na3) {
                r3="VERDE";
            }else if (n3==na1){
                r3="AMARILLO";
            }else if (n3==na2) {
                r3="AMARILLO";
            }else{
              r3="ROJO";
            }
            //Mostrar
            System.out.println(" | "+n1+" | "+n2+" | "+n3+ "\n | "+r1+" | "+r2+" | "+r3);
            //Romper bucle si es correcto todo
            if (r1=="VERDE" && r2=="VERDE" && r3=="VERDE") {
                JOptionPane.showMessageDialog(null, "BIEN HECHO ADIVINASTE \n INTENTOS: "+contador);
                break;
            }
        contador++;
        }while (contador<4);
    }
}
