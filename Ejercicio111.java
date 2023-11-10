
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cleodeth Ospino P
 */
public class Ejercicio111 {
    
		
public static void main(String[] args) {
    DiaSemana();
}

public static void DiaSemana() {
    int n = 0;

    while (n <= 0 || n > 7) {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número natural del 1 al 7"));
    }

    DayOfWeek dayOfWeek = DayOfWeek.of(n);
    String nombreDia = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

    JOptionPane.showMessageDialog(null, "El " + nombreDia + " es el día número " + n + " de la semana.");
}
}