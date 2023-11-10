
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
public class Ejercicio119 {
  	public static void main(String[] abc){
		
		WeirdLogin();
		
	}

	public static void WeirdLogin(){
		
		String n="";
		String password="passwd";
				
		for (int i=1; i<=4; i++){

			n = JOptionPane.showInputDialog(null,"Digite su contraseña (Intento "+i+"/4)");
			
			if (password.equalsIgnoreCase(n)==true){break;}
			
		}
		
		if (password.equalsIgnoreCase(n)==true){
			
			JOptionPane.showMessageDialog(null,"Bienvenido","Output",JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"Su contraseña era "+password,"Output",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
	}
	

}  

