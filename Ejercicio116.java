
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
public class Ejercicio116 {
 public static void main(String[] abc){
		
		SecuenciaParesNonesMil();
		
	}

	public static void SecuenciaParesNonesMil(){
		
		String a="",n="",ln="",ln2="";
		
		
		for (int i=1; i<=500; i++){
			
			if (i==500){ln=" = ";}else{ln=" + ";}
			if (i%50==0){ln2="\n";}else{ln2="";}
			
			a+=(2*i)+""+ln+ln2;
			
		}
		
		for (int i=1; i<=25; i++){
			
			if (i==25){ln=" = ";}else{ln=" x ";}
			
			n+=(2*i-1)+""+ln;
			
		}
		
		JOptionPane.showMessageDialog(null,a+ParesSumatoria(500)+"\n\n"+n+ImparesMultiplicacion(25));
		
	}
	public static int ParesSumatoria(int limite) {
    int suma = 0;
    for (int i = 2; i <= limite; i += 2) {
        suma += i;
    }
    return suma;
}
public static int ImparesMultiplicacion(int limite) {
    int producto = 1;
    for (int i = 1; i <= limite; i += 2) {
        producto *= i;
    }
    return producto;
}

}   

