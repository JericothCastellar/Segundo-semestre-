
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
public class Ejercicio120 {
 public static void main(String[] abc){
		
		HolaUsuarioBucle();
		
	}

	public static void HolaUsuarioBucle(){
				
		int op;

		do{

			JOptionPane.showMessageDialog(null,"Hola Usuario!","Respuesta",JOptionPane.INFORMATION_MESSAGE);
			
			op = JOptionPane.showConfirmDialog(null,"¿Desea repetir este mensaje?");
			
		}while(JOptionPane.OK_OPTION==op);
		
		
	}
	

}   

