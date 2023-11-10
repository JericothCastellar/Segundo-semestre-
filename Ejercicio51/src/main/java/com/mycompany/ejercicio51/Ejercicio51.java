/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio51;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio51 {

    public static void main(String[] args) {
        //Variables:
        double base, altura, area, perimetro;
        //Ingresar variables:
        base=Double.parseDouble(JOptionPane.showInputDialog(null,"Dijite la base del rectangulo"));
        altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Dijite la altura del rectangulo"));
        //Formulas:
        //Perimetro= (Base+base)+(Altura+Altura) es la suma de todos sus lados
        perimetro=base+base+altura+altura;
        //Area=Base*Altura La base multiplicada por la altura
        area=base*altura;
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: "+perimetro+
                "\n El area es:"+area);
        
        
    }
}
