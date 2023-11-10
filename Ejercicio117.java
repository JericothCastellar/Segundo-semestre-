
import java.util.ArrayList;
import java.util.List;
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
public class Ejercicio117 {
   	public static void main(String[] abc){
		
		HastaCeroV3();
		
	}

	public static void HastaCeroV3(){
		
		List<Float> n = new ArrayList<>();
		
		
		do{
			
			n.add(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un número cualquiera")));
			
		}while(n.get(n.size()-1)!=0);
		
		JOptionPane.showMessageDialog(null,"Usted a ingresado "+n.size()+" números","Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
} 

