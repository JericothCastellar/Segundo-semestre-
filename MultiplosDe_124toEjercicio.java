import javax.swing.JOptionPane;

public class MultiplosDe_124toEjercicio extends FuncionaesNumericas {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		MultiplosDe(); // Llamar al método MultiplosDe()
	}

	public static void MultiplosDe() {
		// Método para encontrar y mostrar los múltiplos de 3 en el rango del 1 al 1000
		
		String a = "", ln = "", ln2 = ""; // Inicializar cadenas de caracteres
		
		JOptionPane.showMessageDialog(null, "124. Escribir un programa que muestre en pantalla todos los múltiplos de 3 de los\nnúmeros comprendidos del 1 al 1000.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		for (int i = 1; i <= 1000; i++) {
			// Ciclo for para iterar a través de los números del 1 al 1000
			
			if (i == 1000) {
				ln = ""; // Cuando llegamos al número 1000, no necesitamos una coma
			} else {
				ln = ", "; // Para los demás números, agregamos una coma
			}
			
			if (i % 50 == 0 && i != 0) {
				ln2 = "\n"; // Cada 50 números, añadimos un salto de línea para mejorar la legibilidad
			} else {
				ln2 = "";
			}
			
			// Llamamos a la función Multiplo() de la clase "FuncionaesNumericas" para verificar si el número es múltiplo de 3
			a += Multiplo(3, i) + ln + ln2;
		}
		
		JOptionPane.showMessageDialog(null, a, "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}

