/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio33;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio33 {

    public static void main(String[] args) {
        //Numero de personas:
       int N=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas personas desea ingresar?"));
       //Arreglo con el sexo y el salario
       int [] sex = new int [N];
       int [] salario = new int [N];
       //Bucle for para el Sexo y el Salario, ingresarlos:
   for(int i=0;i<N;i++){
    sex[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el sexo del trabajador #" + (i+1) + "\nIngrese 1 si es hombre\nIngrese 2 si es mujer"));
    salario[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el salario del trabajador #" + (i+1)));
   }
   //Variables de formulas
     double s=0;
     double sum=0;
     double m=0;
     double h=0;
     //Bucle for para salario
    for(int j=0;j<N;j++){
      if(salario[j]>700){
        s=(s+1);
      }
    sum=(sum+salario[j]);
    if(sex[j]==1){
      h=(h+1);
    }else{
      m=(m+1);
    }
      }
    double pm=(m*100)/N;
    double ph=(h*100)/N;
    double prom=sum/N;

    JOptionPane.showMessageDialog(null, "La cantidad de personas cuyo salario es mayor a 700 es de: " + s+ 
       "\nEl promedio de salarios es de: " + prom + "\nEl porcentaje de mujeres que trabajan en la empresa es de: "+ pm 
            + "%\nEl porcentaje de hombres que trabajan en la empresa es de: "+ ph+"%");

    }
}
