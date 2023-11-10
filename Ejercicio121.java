
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
public class Ejercicio121 {
   public static void main(String[] abc){
		
		SumatoriaCinco();
		
	}

	public static void SumatoriaCinco(){
		
		double[] n=new double[5];
		
		String a="",ln="";
				
		for (int i=0; i<n.length; i++){
			
			n[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite cualquier número"));
			
		}
		
		for (int i=0; i<n.length; i++){
			
			if (i==n.length-1){ln=" = ";}else{ln=" + ";}
			
			a+=n[i]+ln;
			
		}
		
		JOptionPane.showMessageDialog(null,a+Sumatoria(n));
		
	}
	public static double Sumatoria(double[] numeros) {
    double suma = 0.0;
    for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }
    return suma;
}


} 

