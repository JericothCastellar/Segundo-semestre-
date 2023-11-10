/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class pantalla extends javax.swing.JFrame {

    /**
     * Creates new form pantalla
     */
    public pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("activar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("eliga la opcion del 1 al 3:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Scanner scanner = new Scanner(System.in);
        String numero1 = texto1.getText();
        int opcion = Integer.parseInt(numero1);
        do {
            mostrarMenu();

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Saliendo del programa.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Ingrese un número para calcular la sumatoria: ");
                    int numSumatoria = scanner.nextInt();
                    int sumatoria = calcularSumatoria(numSumatoria);
                    JOptionPane.showMessageDialog(null,"La sumatoria de " + numSumatoria + " es " + sumatoria);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Ingrese un número para calcular el factorial: ");
                    int numFactorial = scanner.nextInt();
                    long factorial = calcularFactorial(numFactorial);
                    JOptionPane.showMessageDialog(null,"El factorial de " + numFactorial + " es " + factorial);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 1);

        scanner.close();
    }

    public static void mostrarMenu() {
        JOptionPane.showMessageDialog(null,"Menú:");
        JOptionPane.showMessageDialog(null,"1) Salir");
        JOptionPane.showMessageDialog(null,"2) Sumatoria");
        JOptionPane.showMessageDialog(null,"3) Factorial");
        JOptionPane.showMessageDialog(null,"Elija una opción (1/2/3): ");
    }

    public static int calcularSumatoria(int n) {
        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField texto1;
    // End of variables declaration//GEN-END:variables
}
