
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
public class Ejercicio110 {
    
public static void main(String[] abc){
		
		Temperatura();
		
	}

	public static void Temperatura(){
		
		float n=-1;
				
		while (n<0 || n>40){n = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite una temperatura (°C)"));}
		
		if (n>=0 && n<=10){
			
			JOptionPane.showMessageDialog(null,"Mucho frío");
			
		}else if (n>10 && n<=18){
			
			JOptionPane.showMessageDialog(null,"Frío");
			
		}else if (n>18 && n<=25){
			
			JOptionPane.showMessageDialog(null,"Templado");
			
		}else if (n>25 && n<=40){
			
			JOptionPane.showMessageDialog(null,"Caluroso");
			
		}
		
	}

}