import javax.swing.JOptionPane;

public class CajeroAutomatico_132doEjercicio {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		CajeroAutomatico(); // Llamar al método CajeroAutomatico()
	}

	public static void CajeroAutomatico() {
		// Método para simular un cajero automático con opciones de depósito, retiro y saldo
		
		Object opcion;
		Object[] Accion = {"Seleccione", "Deposito", "Retiro", "Salir"}; // Opciones disponibles para el usuario
		float s = 1000; // Saldo inicial del cajero
		float wd = -1; // Variable para el monto a retirar (inicializada a -1 para que entre en el bucle)
		float dep = -1; // Variable para el monto a depositar (inicializada a -1 para que entre en el bucle)

		JOptionPane.showMessageDialog(null, "132. Programa que simula un cajero automático con un saldo inicial de $1000 y que\npida al usuario elegir entre las opciones 1.-Depósito 2.Retiro 3.Salir. En cada\ndepósito y en cada retiro se pedirá la cantidad a retirar o a depositar. Al elegir salir,\nel programa mostrará el saldo final en pantalla.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		do {
			do {
				// Solicitar al usuario que elija una acción
				opcion = JOptionPane.showInputDialog(null, "¿Qué acción desea hacer?", "Seleccionar", JOptionPane.QUESTION_MESSAGE, null, Accion, Accion[0]);
			} while (opcion == Accion[0]);

			if (opcion == Accion[1]) { // Opción de depósito
				while (dep < 0) {
					dep = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la cantidad a depositar"));
				}
				s += dep; // Actualizar el saldo con el monto depositado
				JOptionPane.showMessageDialog(null, "Nuevo saldo es " + s + "$", "Output", JOptionPane.INFORMATION_MESSAGE);
				dep = -1; // Restablecer la variable de depósito
			} else if (opcion == Accion[2]) { // Opción de retiro
				while (wd < 0 || wd > s) {
					wd = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la cantidad a retirar"));
					if (wd > s) {
						JOptionPane.showMessageDialog(null, "No puede retirar más de su saldo actual (" + s + "$)", "Output", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				s -= wd; // Actualizar el saldo restando el monto retirado
				JOptionPane.showMessageDialog(null, "Nuevo saldo es " + s + "$", "Output", JOptionPane.INFORMATION_MESSAGE);
				wd = -1; // Restablecer la variable de retiro
			}
		} while (opcion != Accion[3]); // Continuar hasta que el usuario elija "Salir"

		JOptionPane.showMessageDialog(null, "El saldo final es " + s + "$", "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
