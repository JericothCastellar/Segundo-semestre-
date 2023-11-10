/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio19 {

    public static void main(String[] args) {
  //Variables
int salario,salario2, horasextra, valorhorasextra=6000, descuento=80,total,totaldescuento;
//Ingresar variables
 salario=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite el sueldo basico del empleado"));
 horasextra=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de horas extra"));
 //formulas:
 valorhorasextra=(horasextra*valorhorasextra);
 salario2=(salario+valorhorasextra);
 totaldescuento=(salario2*20)/100;
 total=(salario2*descuento)/100;
 //Mostrar
 JOptionPane.showMessageDialog(null, "Salario: "+salario+"\n Total de Descuento: "+totaldescuento+"\n Total ganado: "+total);
 
 
 
    }
}
