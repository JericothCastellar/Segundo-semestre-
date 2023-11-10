import javax.swing.JOptionPane;

public class MayorOMenor_133roEjercicio extends FuncionaesNumericas {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		MayorOMenor(); // Llamar al método MayorOMenor()
	}

	public static void MayorOMenor() {
		// Método para determinar cuál de dos números ingresados por el usuario es mayor y cuál es menor
		
		float[] n = new float[2]; // Arreglo para almacenar los dos números ingresados por el usuario
		String[] a = {"un", "otro"}; // Etiquetas para indicar cuál número se está ingresando
		
		JOptionPane.showMessageDialog(null, "133. Programa que pida 2 números enteros y determine cuál de ellos es el mayor y\ncuál el menor.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		// Solicitar al usuario que ingrese los dos números
		for (int i = 0; i < n.length; i++) {
			n[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite " + a[i] + " número cualquiera"));
		}
		
		// Ordenar los números para determinar cuál es el mayor y cuál es el menor
		n = Ordenar(n);
	
		JOptionPane.showMessageDialog(null, "El número mayor es " + n[0] + " y el menor es " + n[n.length - 1], "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
