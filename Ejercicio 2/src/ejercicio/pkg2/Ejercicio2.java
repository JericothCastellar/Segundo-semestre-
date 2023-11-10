/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;


import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables:
        String texto;
        //Ingresar texto
        texto=JOptionPane.showInputDialog(null, "Dijite el texto");
        //Mostrar texto
        JOptionPane.showMessageDialog(null, "El texto ingresado es: \n"+texto);
    
    }
    
}
