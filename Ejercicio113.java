
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
public class Ejercicio113 {
  public static void main(String[] abc){
		
		Monterrey();
		
	}

	public static void Monterrey(){
		
		
		Object opcion;
		Object [] Transporte = {"Seleccione","Motocicleta","Automóvil","Pickup"};
		
		float n=-1;
		
		
		do{

			opcion = JOptionPane.showInputDialog(null,"¿Qué transporte desea tomar para ir a Monterrey?", "Seleccionar",JOptionPane.QUESTION_MESSAGE,null,Transporte, Transporte[0]);
			
		}while(opcion==Transporte[0]);
		
		if (opcion==Transporte[1]){
			
			JOptionPane.showMessageDialog(null,"Una motocicleta consumiría "+(500/20)+" l de gasolina");
			
		}else if (opcion==Transporte[2]){
			
			JOptionPane.showMessageDialog(null,"Un automóvil consumiría "+(500/10)+" l de gasolina");
			
		}else if (opcion==Transporte[3]){
			
			JOptionPane.showMessageDialog(null,"Una pickup consumiría "+(500/5)+" l de gasolina");
			
		}
		
	}

}