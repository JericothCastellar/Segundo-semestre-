/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;

import javax.swing.JOptionPane;

/**


 * @author JERICOTH
 */
public class Ejercicio23 {

    public static void main(String[] args) {
 //variables
  int a, b, c, d, f, g, contador = 0;
  //Ingresarles valores aleatorios entre 0-9
  a=(int) (Math.random()*9);
  b=(int) (Math.random()*9);
  c=(int) (Math.random()*9);
        JOptionPane.showMessageDialog(null, ""+a+""+b+""+c);
 //Bucle DO WHILE
        do {
            //ingresar variables/intentos
            d=Integer.parseInt(JOptionPane.showInputDialog(null, "Adivine 1"));
            f=Integer.parseInt(JOptionPane.showInputDialog(null, "Adivine 2"));
            g=Integer.parseInt(JOptionPane.showInputDialog(null, "Adivine 3"));
            //Si el primer numero es correcto
               if (d==a) {
                JOptionPane.showMessageDialog(null, "PRIMER NUMERO: VERDE");
                //Si es es otro
            }else if (d==b) {
                JOptionPane.showMessageDialog(null, "PRIMER NUMERO: AMARILLO");
                //Si es otro
            }else if (d==c) {
                JOptionPane.showMessageDialog(null, "PRIMER NUMERO: AMARILLO");
                //Si no es
            }else 
                JOptionPane.showMessageDialog(null, "PRIMER NUMERO: ROJO");
            //Si el segundo numero es correcto
            if (f==b) {
                JOptionPane.showMessageDialog(null, "SEGUNDO NUMERO: VERDE");
                //Si es otro
            }else if (f==a) {
                JOptionPane.showMessageDialog(null, "SEGUNDO NUMERO: AMARILLO");
                //Si es otro
            }else if (f==c) {
                JOptionPane.showMessageDialog(null, "SEGUNDO NUMERO: AMARILLO");
               //Si no es 
            }else 
                JOptionPane.showMessageDialog(null, "SEGUNDO NUMERO: ROJO");
            // Si tercer numero es correcto
            if (g==c) {
                JOptionPane.showMessageDialog(null, "TERCER NUMERO: VERDE");
                //Si es otro
            }else if (g==b) {
                JOptionPane.showMessageDialog(null, "TERCER NUMERO: AMARILLO");
                //Si es otro
            }else if (g==a) {
                JOptionPane.showMessageDialog(null, "TERCER NUMERO AMARILLO");
                //Si no es 
            }else
                JOptionPane.showMessageDialog(null, "TERCER NUMERO: ROJO");
            //Si adivinas todo correctamente
            if (d==a && f==b && g==c) {
                JOptionPane.showMessageDialog(null, "ADIVINASTE FELICIADES \n Intentos:"+contador);
                break;
            }
            //contador:
            contador++;
            //terminar bucle cuando se acabe el contador
        } while (contador<4);
    }
}
