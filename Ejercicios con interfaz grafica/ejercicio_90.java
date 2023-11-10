package ejerciciosprogramacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_90 extends JFrame {

    private JTextField matrizTextField;
    private JTextField vectorTextField;
    private JButton contarButton;
    private JTextArea resultadoTextArea;

    public ejercicio_90() {
        setTitle("Contador de Números Primos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JLabel matrizLabel = new JLabel("Matriz (separada por comas):");
        JLabel vectorLabel = new JLabel("Vector (separado por comas):");

        matrizTextField = new JTextField(20);
        vectorTextField = new JTextField(20);
        contarButton = new JButton("Contar Primos");
        resultadoTextArea = new JTextArea(10, 30);

        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contarPrimos();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(matrizLabel);
        panel.add(matrizTextField);
        panel.add(vectorLabel);
        panel.add(vectorTextField);
        panel.add(contarButton);

        JScrollPane scrollPane = new JScrollPane(resultadoTextArea);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void contarPrimos() {
        String matrizInput = matrizTextField.getText();
        String vectorInput = vectorTextField.getText();

        String[] matrizStr = matrizInput.split(",");
        String[] vectorStr = vectorInput.split(",");

        int contadorPrimos = contarPrimosEnArreglo(matrizStr) + contarPrimosEnArreglo(vectorStr);

        resultadoTextArea.setText("Cantidad de números primos en la matriz y el vector: " + contadorPrimos);
    }

    private int contarPrimosEnArreglo(String[] valores) {
        int contador = 0;

        for (String valor : valores) {
            int numero = Integer.parseInt(valor.trim());
            if (esPrimo(numero)) {
                contador++;
            }
        }

        return contador;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_90().setVisible(true);
            }
        });
    }
}
