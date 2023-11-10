
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
public class Ejercicio114 {
 	public static void main(String[] abc){
		
		SecuenciaMil();
		
	}

	public static void SecuenciaMil(){
		
		String a="",ln="",ln2="";
		
		
		for (int i=1; i<=1000; i++){
			
			if (i==1000){ln="";}else{ln=", ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a+=i+""+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a);
		
	}
	
}   

