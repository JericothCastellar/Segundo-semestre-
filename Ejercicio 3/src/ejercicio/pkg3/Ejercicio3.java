/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar las variables:
        int base, altura; 
        float area;
        //Ingresar las variables
        base=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la base"));
        altura=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la altura"));
        //Formular 
        area=(base*altura)/2;
        //Mostrar el resuultado
        JOptionPane.showMessageDialog(null, "El area del triangulo es: \n"+area);
        
    }
    
}
