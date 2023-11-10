
import javax.swing.JOptionPane;


public class Ejercicio112 {
    public static void main(String[] abc) {
        MenuViajes();
    }

    public static Object opcion;
    public static Object[] Transporte = {"Seleccione", "a) Cartagena. [$150]", "b) Barranquilla. [$320]", "c) Sincelejo. [$120]", "d) Valledupar. [$90]", "e) Santa Marta.[$110]"};
    public static Object[] Destino = {"", "Cartagena", "Barranquilla", "Sincelejo", "Valledupar", "Santa Marta"};

    public static void MenuViajes() {
        int[] pago = {0, 150, 320, 120, 90, 110};

        int n = 0;

        do {
            opcion = JOptionPane.showInputDialog(null, "Línea de autobuses ADO, seleccione su destino", "Seleccionar", JOptionPane.QUESTION_MESSAGE, null, Transporte, Transporte[0]);
        } while (opcion == Transporte[0]);

        int posicionSeleccionada = -1;
        for (int i = 0; i < Transporte.length; i++) {
            if (opcion.equals(Transporte[i])) {
                posicionSeleccionada = i;
                break;
            }
        }

        if (posicionSeleccionada != -1) {
            JOptionPane.showMessageDialog(null, "Su destino es " + Destino[posicionSeleccionada] + ", tiempo de traslado 2 h. Costo " + pago[posicionSeleccionada] + " $.");
        } else {
            JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }
}
