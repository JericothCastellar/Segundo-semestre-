import javax.swing.JOptionPane;

public class FechaDate_126toEjercicio extends FuncionesUtilidades {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		FechaDate(); // Llamar al método FechaDate()
	}

	public static void FechaDate() {
		// Método para convertir una fecha en formato AAAA MM DD a formato de texto
		
		int[] n = new int[3]; // Arreglo para almacenar el año, mes y día
		int[][] condición = {{0, 9999999}, {0, 12}, {0, 31}}; // Condiciones para cada elemento del arreglo
		String[] ti = {"año", "mes", "día"}; // Etiquetas para solicitar entrada del usuario
		String[] tiem = {"AAAA", "MM", "DD"}; // Etiquetas para el formato de tiempo

		JOptionPane.showMessageDialog(null, "126. Programa que de acuerdo a la fecha dada por el usuario en formato AAAA MM\nDD y la muestre en formato texto. Ejemplo: 2012 01 23 deberá ser mostrado como:\n23 Enero de 2012.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		// Ciclo para solicitar al usuario que ingrese el año, mes y día, y validar que estén dentro de las condiciones especificadas
		for (int i = 0; i < n.length; i++) {
			while (n[i] <= condición[i][0] || n[i] > condición[i][1]) {
				n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el " + ti[i] + " (" + tiem[i] + ")"));
			}
		}

		// Llamar a la función BigDate() de la clase "FuncionesUtilidades" para convertir la fecha en formato de texto
		JOptionPane.showMessageDialog(null, BigDate(n), "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
