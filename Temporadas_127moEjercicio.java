import javax.swing.JOptionPane;

public class Temporadas_127moEjercicio extends FuncionesUtilidades {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		Temporadas(); // Llamar al método Temporadas()
	}

	public static void Temporadas() {
		// Método para determinar a qué estación del año pertenece una fecha dada por el usuario
		
		int[] n = new int[3]; // Arreglo para almacenar el año, mes y día
		int[][] condición = {{0, 9999999}, {0, 12}, {0, 31}}; // Condiciones para cada elemento del arreglo
		String[] ti = {"año", "mes", "día"}; // Etiquetas para solicitar entrada del usuario
		String[] tiem = {"AAAA", "MM", "DD"}; // Etiquetas para el formato de tiempo

		JOptionPane.showMessageDialog(null, "127. Programa que de acuerdo a la fecha dada por el usuario (día, mes, año)\ndetermine a qué estación del año pertenece (primavera, verano, otoño, invierno).", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		// Ciclo para solicitar al usuario que ingrese el año, mes y día, y validar que estén dentro de las condiciones especificadas
		for (int i = 0; i < n.length; i++) {
			while (n[i] <= condición[i][0] || n[i] > condición[i][1]) {
				n[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el " + ti[i] + " (" + tiem[i] + ")"));
			}
		}

		// Llamar a la función BigDate() de la clase "FuncionesUtilidades" para obtener la fecha en formato de texto
		// Llamar a la función Seasons() de la clase "FuncionesUtilidades" para determinar la estación del año
		JOptionPane.showMessageDialog(null, "En el " + BigDate(n) + " es " + Seasons(n[1]), "Output", JOptionPane.INFORMATION_MESSAGE);
		// La función Seasons() se encuentra en la clase "FuncionesUtilidades"
	}
}
