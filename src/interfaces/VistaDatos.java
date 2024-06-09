package interfaces;

import clases.Controlador;
import clases.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaDatos extends javax.swing.JFrame {

    Controlador control = null;

    public VistaDatos() {
        control = new Controlador();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PELUQUERIA PARA MASCOTAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelVeterinaria = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVistaDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonEliminar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        ButtonVolver = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(48, 91, 65));

        labelVeterinaria.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        labelVeterinaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVeterinaria.setText("VISTA DE DATOS");

        jPanel2.setBackground(new java.awt.Color(226, 180, 190));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setBackground(new java.awt.Color(226, 180, 190));

        jTableVistaDatos.setBackground(new java.awt.Color(226, 180, 190));
        jTableVistaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableVistaDatos);

        jLabel1.setText("Datos de Mascotas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2Perros.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel3.setBackground(new java.awt.Color(48, 91, 65));

        jButtonEliminar.setBackground(new java.awt.Color(226, 180, 190));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eliminar.png"))); // NOI18N
        jButtonEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(226, 180, 190));
        jButtonEditar.setForeground(new java.awt.Color(187, 14, 25));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Editar.png"))); // NOI18N
        jButtonEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        ButtonVolver.setBackground(new java.awt.Color(226, 180, 190));
        ButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atras.png"))); // NOI18N
        ButtonVolver.setText("VOLVER");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        ButtonSalir.setBackground(new java.awt.Color(226, 180, 190));
        ButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir.png"))); // NOI18N
        ButtonSalir.setText("SALIR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonVolver)
                        .addGap(129, 129, 129)
                        .addComponent(labelVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonSalir)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonVolver)
                    .addComponent(ButtonSalir))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if (jTableVistaDatos.getRowCount() > 0) {
            if (jTableVistaDatos.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(jTableVistaDatos.getValueAt(jTableVistaDatos.getSelectedRow(), 0)));

                ModificarDatos pantalla = new ModificarDatos(id);
                pantalla.setVisible(true);
                pantalla.setLocationRelativeTo(null);
                dispose();
            } else {
                mostrarMensajeError("Por favor, selecciona una fila antes de editar.");
            }
            cargarTabla();
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_ButtonVolverActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (jTableVistaDatos.getRowCount() > 0) {
            if (jTableVistaDatos.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(jTableVistaDatos.getValueAt(jTableVistaDatos.getSelectedRow(), 0)));
                control.borrarMascota(id);
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
            } else {
                mostrarMensajeError("Por favor, selecciona una fila antes de eliminar.");
            }
            cargarTabla();
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR);
        }

        JDialog dialog = optionPane.createDialog("GUARDADO");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVistaDatos;
    private javax.swing.JLabel labelVeterinaria;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
    DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    // Nombre de las columnas
    String titulos[] = {"Id", "Raza", "Nombre", "Fec.Nacimiento", "Color", "Edad", "Ti.Mascota", "Nombre Dueño", "Cel.Dueño", "Imagen"};
    tabla.setColumnIdentifiers(titulos);

    // Cargar datos de la base de datos
    List<Mascota> listaMascotas = control.traerMascotas();

    // Recorrer y mostrar los elementos en la tabla
    if (listaMascotas != null) {
        for (Mascota masco : listaMascotas) {
            Object[] objeto;
            if (masco.getUnDuenio() != null) {
                objeto = new Object[]{masco.getId(), masco.getRaza(), masco.getNombre(), masco.getFechaSignUpMascota(), masco.getColor(), masco.getEdad(), masco.getMascota(), masco.getUnDuenio().getNameDuenio(), masco.getUnDuenio().getCelDuenio(), masco.getImagen()};
            } else {
                objeto = new Object[]{masco.getId(), masco.getRaza(), masco.getNombre(), masco.getFechaSignUpMascota(), masco.getColor(), masco.getEdad(), masco.getMascota(), null, null, masco.getImagen()};
            }
            tabla.addRow(objeto);
        }
    }

    jTableVistaDatos.setModel(tabla);
}


    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
