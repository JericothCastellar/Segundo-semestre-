import javax.swing.JOptionPane;

public class SalarioNominas_131roEjercicio extends FuncionaesNumericas {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		SalarioNominas(); // Llamar al método SalarioNominas()
	}

	public static void SalarioNominas() {
		// Método para calcular la nómina de los trabajadores de una empresa que son pagados por hora
		
		float m = 0; // Variable para almacenar la tarifa de pago por hora
		int h = 0; // Variable para almacenar las horas trabajadas

		JOptionPane.showMessageDialog(null, "131. Programa que calcule la nómina de los trabajadores de una empresa a los\ncuales se les paga por hora de acuerdo a una tarifa, ambos datos capturados por\nteclado, tomando en cuenta que las horas excedentes a 40 serán pagadas al doble\n(horas extra).", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		// Solicitar al usuario que ingrese las horas trabajadas y la tarifa de pago por hora
		while (h <= 0) {
			h = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las horas trabajadas de los trabajadores"));
		}
		while (m <= 0) {
			m = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la tarifa de pago por hora"));
		}
	
		// Calcular el salario de cada trabajador y mostrar el resultado
		float salario = Sueldo(h, 40, m, 1.0f); // Calcula el salario en base a las horas trabajadas, la tarifa por hora y el factor de incremento (1.0 para horas normales)
		JOptionPane.showMessageDialog(null, "La nómina de cada trabajador es de " + salario + "$", "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
