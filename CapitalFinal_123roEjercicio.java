import javax.swing.JOptionPane; 

public class CapitalFinal_123roEjercicio extends FuncionaesNumericas {
    
    public static void main(String[] abc) {
        // Método principal, punto de entrada del programa
        CapitalFinal(); // Llamar al método CapitalFinal()
    }

    public static void CapitalFinal() {
        // Método para calcular el monto de capital final
        
        float ca = 0, in = 0, di = 0; // Inicializar variables ca (capital), in (tasa de interés), y di (número de días)
        
        JOptionPane.showMessageDialog(null, "123. Programa que calcula el capital final de un interés simple de forma diaria, de\nacuerdo a los datos dados por el usuario (capital, interés y días). El resultado se\nmostrará en pantalla.", "Ejercicio", JOptionPane.INFORMATION_MESSAGE);
        
        while (ca <= 0) {
            ca = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el capital"));
        }
        while (in <= 0) {
            in = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el interés (%)"));
            in = in / 100;
        }
        while (di <= 0) {
            di = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la cantidad de días"));
        }
        
        JOptionPane.showMessageDialog(null, "El capital final es de " + InteresSimple(ca, in, di) + "$", "Output", JOptionPane.INFORMATION_MESSAGE);
        // La función InteresSimple() se encuentra en la clase "FuncionaesNumericas"
    }
}
