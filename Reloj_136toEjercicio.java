import javax.swing.JOptionPane;

public class Reloj_136toEjercicio {
	
	public static void main(String[] abc) {
		// Método principal, punto de entrada del programa
		Reloj(); // Llamar al método Reloj()
	}

	public static void Reloj() {
		// Método para simular un reloj digital en pantalla
		
		JOptionPane.showMessageDialog(null, "136. Programa que simule en pantalla el funcionamiento de un reloj digital, con el\nformato Horas:Minutos:Segundos.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);

		for (int h = 0; h <= 24; h++) {
			// Bucle para las horas (0-24)
			for (int m = 0; m <= 59; m++) {
				// Bucle para los minutos (0-59)
				for (int s = 0; s <= 59; s++) {
					// Bucle para los segundos (0-59)
					
					// Mostrar la hora actual en la consola con el formato HH:MM:SS
					System.out.print("\r" + formatTwoDigits(h) + ":" + formatTwoDigits(m) + ":" + formatTwoDigits(s));
					
					try {
						Thread.sleep(1000); // Pausar durante 1 segundo (1000 milisegundos)
					} catch (InterruptedException e) {
						System.out.println(e);
					}  
				}
			}
		}
	}
	
	public static String formatTwoDigits(int value) {
		// Método para formatear un entero como una cadena de dos dígitos (agregando un cero al principio si es necesario)
		return (value < 10) ? "0" + value : String.valueOf(value);
	}
}
