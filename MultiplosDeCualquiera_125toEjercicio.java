import javax.swing.JOptionPane;

public class MultiplosDeCualquiera_125toEjercicio extends FuncionaesNumericas {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		MultiplosDeCualquiera(); // Llamar al método MultiplosDeCualquiera()
	}

	public static void MultiplosDeCualquiera() {
		// Método para encontrar y mostrar múltiplos de un número ingresado por el usuario
		
		String a = "", ln = "", ln2 = ""; // Inicializar cadenas de caracteres
		float n = -3001; // Inicializar n con un valor fuera del rango válido

		JOptionPane.showMessageDialog(null, "125. Modificar el programa anterior para que el número múltiplo pueda ser leído\ndesde un dispositivo externo.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		// Solicitar al usuario que ingrese un número cualquiera dentro del rango [-3000, 3000]
		while (n < -3000 || n > 3000) {
			n = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite un número cualquiera"));
		}

		// Iterar a través de los números desde 1 hasta (3000 / n)
		for (int i = 1; i <= (3000 / n); i++) {
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

			// Llamamos a la función Multiplo() de la clase "FuncionaesNumericas" para verificar si el número es múltiplo de n
			a += Multiplo(n, i) + ln + ln2;
		}

		JOptionPane.showMessageDialog(null, a, "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
