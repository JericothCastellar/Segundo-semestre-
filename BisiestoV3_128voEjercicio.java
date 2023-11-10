import javax.swing.JOptionPane;

public class BisiestoV3_128voEjercicio extends FuncionaesNumericas {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		BisiestoV3(); // Llamar al método BisiestoV3()
	}

	public static void BisiestoV3() {
		// Método para determinar si un año ingresado por el usuario es bisiesto o no
		
		int n = 0; // Variable para almacenar el año
		
		JOptionPane.showMessageDialog(null, "128. Programa para determinar si el año (en formato de 4 dígitos) indicado por el\nusuario es bisiesto (todo año múltiplo de 4 es bisiesto, excepto aquellos múltiplos\nde 100, aunque si también son múltiplos de 400, entonces, sí serán bisiestos. Ej.\n2000 si es bisiesto, pero 1800 no).", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);
		
		// Solicitar al usuario que ingrese un año de 4 dígitos
		while (n <= 1000 || n > 9999) {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un año"));
		}
		
		// Llamar a la función DetectorBisiesto() para verificar si el año es bisiesto
		if (DetectorBisiesto(n) == true) { // Esta función se encuentra en el ejercicio 99 "BisiestoFuncion_99noEjercicio"
			JOptionPane.showMessageDialog(null, "El año " + n + " es bisiesto", "Output", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "El año " + n + " no es bisiesto", "Output", JOptionPane.ERROR_MESSAGE);
		}
	}
}
