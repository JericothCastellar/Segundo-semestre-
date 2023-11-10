
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
public class Ejercicio122 {
    public static void main(String[] abc){
		
		SumatoriaInfinito();
		
	}

	public static void SumatoriaInfinito(){
		
		List<Double> ns = new ArrayList<>();
		String a="",ln="",ln2="";
				
		do{
			
			ns.add(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite un número cualquiera"))*1.0d);
			
		}while(ns.get(ns.size()-1)!=0);
		
		double[] n=new double[ns.size()];
		
		for (int i=0; i<n.length; i++){
			
			n[i] = ns.get(i);
			
		}
		
		for (int i=0; i<n.length; i++){
			
			if (i==n.length-1){ln=" = ";}else{ln=" + ";}
			if (i%50==0 && i!=0){ln2="\n";}else{ln2="";}
			
			a+=n[i]+ln+ln2;
			
		}
		
		JOptionPane.showMessageDialog(null,a+Sumatoria(n),"Output",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
public static double Sumatoria(double[] numeros) {
    double suma = 0.0;
    for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }
    return suma;
}

}

