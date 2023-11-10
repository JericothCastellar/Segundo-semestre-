
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cleodeth Ospino P
 */
public class Ejercicio118 {
   public static void main(String[] abc){
		
		DiezProductos();
		
	}

	public static void DiezProductos(){
		
		double[] n=new double[10];
		
		
		for (int i=0; i<n.length; i++){
			
			n[i]=0;
			
			while (n[i]<=0){n[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el monto de el/los producto N°"+(i+1)));}
			
		}
		
		JOptionPane.showMessageDialog(null,"El total a pagar es "+Sumatoria(n)+"$");
		
	}
	
public static double Sumatoria(double[] numeros) {
    double suma = 0.0;
    for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }
    return suma;
}

} 

