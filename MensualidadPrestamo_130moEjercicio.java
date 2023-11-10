import javax.swing.JOptionPane;

public class MensualidadPrestamo_130moEjercicio extends FuncionaesNumericas {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		MensualidadPrestamo(); // Llamar al método MensualidadPrestamo()
	}

	public static void MensualidadPrestamo() {
		// Método para calcular el monto total a pagar por mes en un préstamo de 12 o 24 meses
		
		float ca = 0; // Variable para almacenar el monto del préstamo

		JOptionPane.showMessageDialog(null, "130. Programa que calcule el monto total a pagar por mes, si el monto será pagado\nen un plazo de 12 ó 24 meses, tomando en cuenta que por cada mes se aplica un\n2% de interés sobre el saldo. Adicionalmente mostrar el total a pagar.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		// Solicitar al usuario que ingrese el monto del préstamo
		while (ca <= 0) {
			ca = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el préstamo"));
		}

		// Calcular la cuota mensual y mostrar el resultado
		float cuotaMensual = InteresSimple(ca, 0.02f, 24 * 30) / 24; // Calcula la cuota mensual en base al préstamo y la tasa de interés (2% mensual)
		JOptionPane.showMessageDialog(null, "La cuota mensual es de " + cuotaMensual + "$", "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
