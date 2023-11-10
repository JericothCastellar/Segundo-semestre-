import javax.swing.JOptionPane;

public class MayorOMenorV2_134toEjercicio extends FuncionaesNumericas {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		MayorOMenorV2(); // Llamar al método MayorOMenorV2()
	}

	public static void MayorOMenorV2() {
		// Método para determinar cuál de tres números ingresados por el usuario es mayor y cuál es menor, con validación para evitar números iguales
		
		float[] n = new float[3]; // Arreglo para almacenar los tres números ingresados por el usuario
		String[] a = {"un", "otro", "el último"}; // Etiquetas para indicar cuál número se está ingresando
		
		JOptionPane.showMessageDialog(null, "134. Programa que pida 3 números enteros y determine cuál de ellos es el mayor y\ncuál el menor. Incluir una validación que evite que los 2 de esos números sean\niguales.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		// Solicitar al usuario que ingrese los tres números
		for (int i = 0; i < n.length; i++) {
			do {
				n[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite " + a[i] + " número cualquiera"));
			} while (Verify(n, n[i], i)); // Validar que el número no sea igual a los números anteriores
		}
		
		// Ordenar los números para determinar cuál es el mayor y cuál es el menor
		n = Ordenar(n);
	
		JOptionPane.showMessageDialog(null, "El número mayor es " + n[0] + " y el menor es " + n[n.length - 1], "Output", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static boolean Verify(float[] arr, float num, int index) {
		// Método para verificar si el número ingresado ya existe en el arreglo hasta el índice especificado
		
		for (int i = 0; i < index; i++) {
			if (arr[i] == num) {
				JOptionPane.showMessageDialog(null, "El número ingresado ya existe, ingrese un número diferente.", "Error", JOptionPane.ERROR_MESSAGE);
				return true; // El número ya existe en el arreglo
			}
		}
		return false; // El número es válido y no existe en el arreglo
	}
}
