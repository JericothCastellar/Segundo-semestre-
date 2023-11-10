/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio56;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio56 {

    public static void main(String[] args) {
        //variables
        int segundos, horas, minutos;
        //Ingresar segundos
        segundos=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite los segundos"));
        //Segundos pasan a horas
        horas=segundos/3600;
        //Los segundos se restan para pasar a segundos relaes
        segundos%=3600;
        //Los segundos pasan a minutos
        minutos=segundos/60;
        //Los segundos suman al resto cuando pasan mas de 60
        segundos %=60;
        //Se muestran en la consola¿
        System.out.println("Horas: "+horas+" Minutos: "+minutos+" segundos: "+segundos);
    }
}
