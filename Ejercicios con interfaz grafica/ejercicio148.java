package ejerciciosprogramacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ejercicio148 extends javax.swing.JFrame {

        List<Integer> listaEnteros = new ArrayList<>();
        List<Double> todosLosDatos = new ArrayList<>();
        List<Double> listaDecimales = new ArrayList<>();
             
        int maximoDatos = 10;
        int datosIngresados = 0;
        
        private double encontrarValorCuartil(List<Double> datosOrdenados, double posicion) {
            int index = (int) posicion;
            double fraccion = posicion - index;

            if (index == 0) {
                return datosOrdenados.get(0);
            } else if (index >= datosOrdenados.size()) {
                return datosOrdenados.get(datosOrdenados.size() - 1);
        }

    double lowerValue = datosOrdenados.get(index - 1);
    double upperValue = datosOrdenados.get(index);

    return lowerValue + fraccion * (upperValue - lowerValue);
}

   
    public ejercicio148() {
        initComponents();
        setTitle("ANALISIS DE DATOS");
        
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        BotonInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        media = new javax.swing.JButton();
        mediana = new javax.swing.JButton();
        moda = new javax.swing.JButton();
        cuartiles = new javax.swing.JButton();
        rango = new javax.swing.JButton();
        iqr = new javax.swing.JButton();
        coeficienteVariacion = new javax.swing.JButton();
        Varianza = new javax.swing.JButton();
        desviacionEstandar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        BotonSalir.setBackground(new java.awt.Color(255, 0, 0));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonInfo.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        BotonInfo.setText("INFO+");
        BotonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInfoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("<html>PROGRAMA DE ANALISIS ESTADISTICO");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>INTRODUCIR DATOS  NO AGRUPADOS<html>");

        jButton2.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jButton2.setText("INTRODUCIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jButton1.setText("DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel2.setText("CALCULAR:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        media.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        media.setText("MEDIA");
        media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaActionPerformed(evt);
            }
        });

        mediana.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        mediana.setText("<html>MEDIANA");
        mediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianaActionPerformed(evt);
            }
        });

        moda.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        moda.setText("MODA");
        moda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modaActionPerformed(evt);
            }
        });

        cuartiles.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        cuartiles.setText("<html>CUARTILES");
        cuartiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuartilesActionPerformed(evt);
            }
        });

        rango.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        rango.setText("RANGO");
        rango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangoActionPerformed(evt);
            }
        });

        iqr.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        iqr.setText("IQR");
        iqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iqrActionPerformed(evt);
            }
        });

        coeficienteVariacion.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        coeficienteVariacion.setText("<html>COEFICIENTE VARIACION");
        coeficienteVariacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeficienteVariacionActionPerformed(evt);
            }
        });

        Varianza.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Varianza.setText("VARIANZA");
        Varianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarianzaActionPerformed(evt);
            }
        });

        desviacionEstandar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        desviacionEstandar.setText("<html>DESVIACION ESTANDAR");
        desviacionEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desviacionEstandarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mediana, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(moda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cuartiles, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rango, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iqr, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(coeficienteVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Varianza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(desviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(BotonInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonSalir)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton3)))))
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediana, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuartiles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rango, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iqr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Varianza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coeficienteVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir)
                    .addComponent(BotonInfo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir de la calculadora?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                   System.exit(0);
            }
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInfoActionPerformed
        JOptionPane.showMessageDialog(null, "Este progrma esta diseñado para calcular almacenar\n"
                + "maximo diez datos no agrupados y con ello calcular:\n"
                + "* La media.\n"
                + "* La mediana.\n"
                + "* La moda.\n"
                + "* Los cuartiles.\n"
                + "* Rango \n"
                + "* Rango intercuartil\n" 
                + "* Coeficiente de variacion\n" 
                + "* Varianza\n"
                + "* Desviacion estandar\n\n"
                + "Al persionar en el boton (INTRODUCIR) aparecera\n"
                + "una ventana emergente para introducir los datos \n"
                + "correctamente, solo se admiten datos numericos\n\n"
                + "Al presionar en el boton (DATOS) se mostraran los datos\n"
                + "previa mente introducidos\n\n"
                + "Para calcular cualquiera de las anterior presione\n"
                + "en el boton correspondiente\n\n"
                + "Para limpiar los datos e introducir datos nuevos\n"
                + "presione el boton (LIMPIAR), se limpiaran los\n"
                + "datos introducidos y podra ingresar nuevos datos\n",
                "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonInfoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (datosIngresados >= maximoDatos) {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el tamaño máximo de la lista (10 datos).", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String input = JOptionPane.showInputDialog(null, "Ingrese el dato número " + (datosIngresados + 1));
        
        if (input != null) {
            try {
                int datoEntero = Integer.parseInt(input);
                listaEnteros.add(datoEntero);
                datosIngresados++;
                todosLosDatos.add((double) datoEntero);
            } catch (NumberFormatException e) {
                try {
                    double datoDecimal = Double.parseDouble(input);
                    listaDecimales.add(datoDecimal);
                    datosIngresados++;
                    todosLosDatos.add(datoDecimal);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor válido.");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            boolean seIngresaronDatos = !listaEnteros.isEmpty() || !listaDecimales.isEmpty();

        if (seIngresaronDatos) {
            StringBuilder mensaje = new StringBuilder("Datos ingresados:\n");

            for (int dato : listaEnteros) {
                mensaje.append(dato).append("").append("\n");
            }

            for (double dato : listaDecimales) {
                mensaje.append(dato).append("").append("\n");
            }

            JOptionPane.showMessageDialog(null, mensaje.toString(), "Datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaActionPerformed
        if (!listaEnteros.isEmpty() || !listaDecimales.isEmpty()) {
            double suma = 0;
            int totalDatos = 0;

            for (int dato : listaEnteros) {
                suma += dato;
                totalDatos++;
            }

            for (double dato : listaDecimales) {
                suma += dato;
                totalDatos++;
            }

            double media = (suma / (totalDatos));
            JOptionPane.showMessageDialog(null, "La media es: " + media, "Media", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Aun no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_mediaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (datosIngresados == 0) {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea limpiar los datos ya introducidos?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            listaEnteros.clear();
            listaDecimales.clear();
            datosIngresados = 0;
            todosLosDatos.clear();
            
            JOptionPane.showMessageDialog(null, "     LOS DATOS SE HAN LIMPIADO\n\nPUEDES INTRODUCIR NUEVOS DATOS.\n", 
                    "Datos Limpiados", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void medianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianaActionPerformed
        if (datosIngresados == 0) {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        todosLosDatos.addAll(listaEnteros.stream().map(Double::valueOf).collect(Collectors.toList()));
        todosLosDatos.addAll(listaDecimales);


        Collections.sort(todosLosDatos);

        int cantidadDatos = todosLosDatos.size();
        double mediana;

        if (cantidadDatos % 2 == 0) {
            int indice1 = cantidadDatos / 2 - 1;
            int indice2 = cantidadDatos / 2;
            mediana = (todosLosDatos.get(indice1) + todosLosDatos.get(indice2)) / 2;
        } else {
            int indice = cantidadDatos / 2;
            mediana = todosLosDatos.get(indice);
        }

            JOptionPane.showMessageDialog(null, "La mediana es: " + mediana);
    }//GEN-LAST:event_medianaActionPerformed

    private void modaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modaActionPerformed
        if (datosIngresados == 0) {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
        todosLosDatos.addAll(listaEnteros.stream().map(Double::valueOf).collect(Collectors.toList()));
        todosLosDatos.addAll(listaDecimales);

        Map<Double, Integer> frecuencias = new HashMap<>();
        Set<Double> modas = new HashSet<>();
        int maxFrecuencia = 0;        

        for (double dato : todosLosDatos) {
            int nuevaFrecuencia = frecuencias.getOrDefault(dato, 0) + 1;
            frecuencias.put(dato, nuevaFrecuencia);
            if (nuevaFrecuencia > maxFrecuencia) {
                maxFrecuencia = nuevaFrecuencia;
                modas.clear();
                modas.add(dato);
            } else if (nuevaFrecuencia == maxFrecuencia) {
                modas.add(dato);
            }
        }

        if (maxFrecuencia == 1) {
            JOptionPane.showMessageDialog(null, "No hay una moda clara.\nTodos los valores son únicos.");
        } else {
            StringBuilder modasMsg = new StringBuilder("Las modas son:\n");
            for (Double moda : modas) {
                modasMsg.append(moda).append("\n");
            }
            JOptionPane.showMessageDialog(null, modasMsg.toString());
        }
    }//GEN-LAST:event_modaActionPerformed

    private void cuartilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuartilesActionPerformed
                                      
    if (datosIngresados == 0) {
        JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    List<Double> todosLosDatos = new ArrayList<>(listaEnteros.size() + listaDecimales.size());

    for (int dato : listaEnteros) {
        todosLosDatos.add((double) dato);
    }

    todosLosDatos.addAll(listaDecimales);
    Collections.sort(todosLosDatos);
    int n = todosLosDatos.size();

    double q1Position = 0.25 * (n + 1);
    double q2Position = 0.50 * (n + 1);
    double q3Position = 0.75 * (n + 1);

    double q1 = encontrarValorCuartil(todosLosDatos, q1Position);
    double q2 = encontrarValorCuartil(todosLosDatos, q2Position);
    double q3 = encontrarValorCuartil(todosLosDatos, q3Position);

    String mensaje = "El primer cuartil (Q1) es: " + q1 + "\n"
                   + "El segundo cuartil (Q2) es: " + q2 + "\n"
                   + "El tercer cuartil (Q3) es: " + q3;

    JOptionPane.showMessageDialog(null, mensaje, "Cuartiles", JOptionPane.DEFAULT_OPTION);            

    }//GEN-LAST:event_cuartilesActionPerformed

    private void rangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangoActionPerformed

        if (datosIngresados == 0) {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double dato : todosLosDatos) {
            if (dato > max) {
                max = dato;
            }
            if (dato < min) {
                min = dato;
            }
        }

        double rango = max - min;

        JOptionPane.showMessageDialog(null, "El rango es: " + rango, "Rango", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_rangoActionPerformed

    private void iqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iqrActionPerformed

        if (datosIngresados == 0) {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        List<Double> todosLosDatos = new ArrayList<>(listaEnteros.size() + listaDecimales.size());

        for (int dato : listaEnteros) {
            todosLosDatos.add((double) dato);
        }

        todosLosDatos.addAll(listaDecimales);
        Collections.sort(todosLosDatos);
        int n = todosLosDatos.size();

        double q1Position = 0.25 * (n + 1);
        double q3Position = 0.75 * (n + 1);

        double q1 = encontrarValorCuartil(todosLosDatos, q1Position);
        double q3 = encontrarValorCuartil(todosLosDatos, q3Position);

        double iqr = q3 - q1;

        JOptionPane.showMessageDialog(null, "El Rango Intercuartil (IQR) es: " + iqr, "IQR", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_iqrActionPerformed

    private void desviacionEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desviacionEstandarActionPerformed
        if (datosIngresados == 0) {
        JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

        double media = calcularMedia();
        double desviacionEstandar = calcularDesviacionEstandar(media);

        JOptionPane.showMessageDialog(null, "La desviación estándar es: " + desviacionEstandar, "Desviación Estándar",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_desviacionEstandarActionPerformed

    private void VarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarianzaActionPerformed
                                            
        if (datosIngresados == 0) {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double media = calcularMedia();
        double varianza = calcularVarianza(media);

        JOptionPane.showMessageDialog(null, "La varianza es: " + varianza, "Varianza", JOptionPane.INFORMATION_MESSAGE);
    }

    private double calcularVarianza(double media) {
        double sumaCuadradosDiferencia = 0;
        int totalDatos = 0;

        for (int dato : listaEnteros) {
            double diferencia = dato - media;
            sumaCuadradosDiferencia += diferencia * diferencia;
            totalDatos++;
        }

        for (double dato : listaDecimales) {
            double diferencia = dato - media;
            sumaCuadradosDiferencia += diferencia * diferencia;
            totalDatos++;
        }

        return (totalDatos > 1) ? (sumaCuadradosDiferencia / (totalDatos - 1)) : 0;

    }//GEN-LAST:event_VarianzaActionPerformed

    private void coeficienteVariacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeficienteVariacionActionPerformed

        if (datosIngresados == 0) {
            JOptionPane.showMessageDialog(null, "Aún no se han ingresado datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double media = calcularMedia();
        double desviacionEstandar = calcularDesviacionEstandar(media);

        if (media == 0) {
            JOptionPane.showMessageDialog(null, "No se puede calcular el coeficiente de variación ya que la media es cero.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            double coeficienteVariacion = (desviacionEstandar / media) * 100 ; // Expresado como porcentaje
            JOptionPane.showMessageDialog(null, "El coeficiente de variación es: " + coeficienteVariacion + "%", "Coeficiente de Variación", JOptionPane.INFORMATION_MESSAGE);
        }
    }          

    private double calcularMedia() {
        double suma = 0;
        int totalDatos = 0;

        for (int dato : listaEnteros) {
            suma += dato;
            totalDatos++;
        }

        for (double dato : listaDecimales) {
            suma += dato;
            totalDatos++;
        }

        return (totalDatos > 0) ? (suma / totalDatos) : 0;
    }

    private double calcularDesviacionEstandar(double media) {
        if (media == 0) {
            return 0; // Evitar división por cero si la media es cero.
        }

        double sumaCuadradosDiferencia = 0;
        int totalDatos = 0;

        for (int dato : listaEnteros) {
            double diferencia = dato - media;
            sumaCuadradosDiferencia += diferencia * diferencia;
            totalDatos++;
        }

        for (double dato : listaDecimales) {
            double diferencia = dato - media;
            sumaCuadradosDiferencia += diferencia * diferencia;
            totalDatos++;
        }

        return Math.sqrt(sumaCuadradosDiferencia / totalDatos);

    }//GEN-LAST:event_coeficienteVariacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio148.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio148.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio148.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio148.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio148().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInfo;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton Varianza;
    private javax.swing.JButton coeficienteVariacion;
    private javax.swing.JButton cuartiles;
    private javax.swing.JButton desviacionEstandar;
    private javax.swing.JButton iqr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton media;
    private javax.swing.JButton mediana;
    private javax.swing.JButton moda;
    private javax.swing.JButton rango;
    // End of variables declaration//GEN-END:variables
}