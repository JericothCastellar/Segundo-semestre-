
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
public class Ejercicio109 {
    public static void main(String[] abc){
		
		DescuentoV3();
		
	}

	public static void DescuentoV3(){
		
		float n=0,d=0;
				
		
		while (n<=0){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el monto"));}
		
		d=n;
		
		if (n>1000){
			
			d=n-(n*0.1f);
			
		}

		JOptionPane.showMessageDialog(null,"El monto neto es "+d+"$");
		
	}

}

