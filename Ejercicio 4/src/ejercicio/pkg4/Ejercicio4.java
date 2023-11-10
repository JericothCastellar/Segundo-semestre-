/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar el radio:
        int radio;
        //Ingresar tamaño:
        radio=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamaño del radio: "));
        //declare el area y formule el Area usando Math.PI multiplicandolo por el radio:
        double Area = Math.PI * Math.pow(radio, 2); 
        //Muestre el resultado:
        JOptionPane.showMessageDialog(null, "El area del circulo es: "+Area);
    }
    
}
