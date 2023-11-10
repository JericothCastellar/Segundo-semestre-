
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
public class Ejercicio115 {
   public static void main(String[] abc){
		
		SecuenciaParesMil();
		
	}

	public static void SecuenciaParesMil(){
		
		String a="",ln="",ln2="";
		
		
		for (int i=1; i<=500; i++){
			
			if (i==500){ln=" = ";}else{ln=" + ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a+=(2*i)+""+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a+ParesSumatoria(500));
		
		
	}
	public static int ParesSumatoria(int limite) {
    int suma = 0;
    for (int i = 2; i <= limite; i += 2) {
        suma += i;
    }
    return suma;
}

} 

