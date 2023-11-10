/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio61;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio61 {

    public static void main(String[] args) {
        //Variables
        int enteros,suma = 0;
        //bucle for de 1 hasta 10
        for (int i = 1; i <=10; i++) {
            //Multiplicar i por 2 o su potencia
            enteros=(int) Math.pow(i, 2);
            //Sumar los resultados anteriores
           suma=(suma+enteros);
           //Mostrar
            System.out.println("La suma de los cuadrados de 1-10 es:"+suma);
        }
    }
}
