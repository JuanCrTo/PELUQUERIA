package interfaces;

import clases.Controlador;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CargaDatos extends javax.swing.JFrame {

    Controlador control = new Controlador();

    public CargaDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PELUQUERIA PARA MASCOTAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        labelVeterinaria = new javax.swing.JLabel();
        PanelForm = new javax.swing.JPanel();
        labelMascota = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelNombreDueño = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jTextFieldRaza = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        labelRaza = new javax.swing.JLabel();
        jTextFieldNameMen = new javax.swing.JTextField();
        jComboBoxMascota = new javax.swing.JComboBox<>();
        labelPhoneMen1 = new javax.swing.JLabel();
        jTextFieldPhoneMen = new javax.swing.JTextField();
        labelServicio = new javax.swing.JLabel();
        jComboBoxServicio = new javax.swing.JComboBox<>();
        labelPrecioTotal = new javax.swing.JLabel();
        jTextFieldPrecioTotal = new javax.swing.JTextField();
        labelPrecioTotal1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        PanelButtons = new javax.swing.JPanel();
        ButtonLimpiar = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        ButtonVolver = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 165, 0));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1888, 1276));

        labelVeterinaria.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        labelVeterinaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVeterinaria.setText("PELUQUERIA");

        PanelForm.setBackground(new java.awt.Color(255, 165, 0));

        labelMascota.setText("Mascota");

        labelColor.setText("Color:");

        labelNombreDueño.setText("Nombre de Dueño:");

        labelEdad.setText("Edad:");

        labelFecha.setText("Fecha de Nacimiento:");

        labelNombre.setText("Nombre:");

        jTextFieldRaza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldRazaFocusGained(evt);
            }
        });
        jTextFieldRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRazaActionPerformed(evt);
            }
        });

        jTextFieldAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAgeFocusGained(evt);
            }
        });
        jTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgeActionPerformed(evt);
            }
        });

        jTextFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusGained(evt);
            }
        });
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jTextFieldColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldColorFocusGained(evt);
            }
        });
        jTextFieldColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColorActionPerformed(evt);
            }
        });

        labelRaza.setText("Raza:");

        jTextFieldNameMen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNameMenFocusGained(evt);
            }
        });
        jTextFieldNameMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameMenActionPerformed(evt);
            }
        });

        jComboBoxMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato" }));
        jComboBoxMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMascotaActionPerformed(evt);
            }
        });

        labelPhoneMen1.setText("Celular del Dueño:");

        jTextFieldPhoneMen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneMenFocusGained(evt);
            }
        });
        jTextFieldPhoneMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneMenActionPerformed(evt);
            }
        });

        labelServicio.setText("Servicio:");

        jComboBoxServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baño Basico", "Corte de Pelo y Estilizado", "Corte de Uñas", "Spa (masajes-mascarillas-etc)", "Limpieza de Oidos y Dientes" }));
        jComboBoxServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicioActionPerformed(evt);
            }
        });

        labelPrecioTotal.setText("Precio Total:");

        jTextFieldPrecioTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPrecioTotalFocusGained(evt);
            }
        });
        jTextFieldPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFormLayout = new javax.swing.GroupLayout(PanelForm);
        PanelForm.setLayout(PanelFormLayout);
        PanelFormLayout.setHorizontalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFecha)
                                    .addComponent(labelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMascota, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                                    .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46))
                                .addComponent(labelNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelPhoneMen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldNameMen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPhoneMen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPrecioTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addComponent(jTextFieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addComponent(jComboBoxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPrecioTotal1)
                                .addGap(86, 86, 86))))))
        );
        PanelFormLayout.setVerticalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelFormLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(labelEdad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNombre)))
                        .addGroup(PanelFormLayout.createSequentialGroup()
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMascota))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addComponent(labelColor)
                                .addGap(92, 92, 92))
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelFormLayout.createSequentialGroup()
                                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNameMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelNombreDueño))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldPhoneMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPhoneMen1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelRaza)))
                                .addGroup(PanelFormLayout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(labelFecha))))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                        .addComponent(labelServicio)
                        .addGap(29, 29, 29)
                        .addComponent(labelPrecioTotal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPrecioTotal1))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        PanelButtons.setBackground(new java.awt.Color(255, 165, 0));

        ButtonLimpiar.setBackground(new java.awt.Color(255, 20, 147));
        ButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Escoba.png"))); // NOI18N
        ButtonLimpiar.setText("LIMPIAR");
        ButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimpiarActionPerformed(evt);
            }
        });

        ButtonGuardar.setBackground(new java.awt.Color(255, 20, 147));
        ButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Guardar.png"))); // NOI18N
        ButtonGuardar.setText("GUARDAR");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonsLayout = new javax.swing.GroupLayout(PanelButtons);
        PanelButtons.setLayout(PanelButtonsLayout);
        PanelButtonsLayout.setHorizontalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonsLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(ButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        PanelButtonsLayout.setVerticalGroup(
            PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        ButtonSalir.setBackground(new java.awt.Color(255, 20, 147));
        ButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir.png"))); // NOI18N
        ButtonSalir.setText("SALIR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        ButtonVolver.setBackground(new java.awt.Color(255, 20, 147));
        ButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atras.png"))); // NOI18N
        ButtonVolver.setText("VOLVER");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PerroPayaso.png"))); // NOI18N
        labelLogo.setText("jLabel1");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(ButtonVolver)
                        .addGap(137, 137, 137)
                        .addComponent(labelVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(ButtonSalir))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(517, 517, 517)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(822, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSalir)
                    .addComponent(ButtonVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1888, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1276, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_ButtonVolverActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        String edadMascota = (String) jTextFieldAge.getText();
        String colorMascota = jTextFieldColor.getText();
        String dateBirthMascota = jTextFieldDateBirth.getText();
        String nameMascota = jTextFieldName.getText();
        String tipoMascota = (String) jComboBoxMascota.getSelectedItem();
        String nameMen = jTextFieldNameMen.getText();
        String phoneMen = jTextFieldPhoneMen.getText();
        String raza = jTextFieldRaza.getText();

        control.guardar(raza, edadMascota, colorMascota, dateBirthMascota, nameMascota, tipoMascota, nameMen, phoneMen);

        JOptionPane optionPane = new JOptionPane("Guardado Exitosamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("GUARDADO");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

        jTextFieldAge.setText("");
        jTextFieldColor.setText("");
        jTextFieldDateBirth.setText("");
        jTextFieldName.setText("");
        jTextFieldNameMen.setText("");
        jTextFieldRaza.setText("");
        jTextFieldPhoneMen.setText("");
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void ButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpiarActionPerformed

        jTextFieldAge.setText("");
        jTextFieldColor.setText("");
        jTextFieldDateBirth.setText("");
        jTextFieldName.setText("");
        jTextFieldNameMen.setText("");
        jTextFieldRaza.setText("");
        jTextFieldPhoneMen.setText("");
    }//GEN-LAST:event_ButtonLimpiarActionPerformed

    private void jTextFieldPhoneMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenActionPerformed

    private void jTextFieldPhoneMenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenFocusGained

    private void jComboBoxMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMascotaActionPerformed

    private void jTextFieldNameMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameMenActionPerformed

    private void jTextFieldNameMenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameMenFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameMenFocusGained

    private void jTextFieldColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColorActionPerformed

    private void jTextFieldColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldColorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColorFocusGained

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameFocusGained

    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeActionPerformed

    private void jTextFieldAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAgeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeFocusGained

    private void jTextFieldRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazaActionPerformed

    private void jTextFieldRazaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRazaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazaFocusGained

    private void jComboBoxServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicioActionPerformed

    private void jTextFieldPrecioTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPrecioTotalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioTotalFocusGained

    private void jTextFieldPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioTotalActionPerformed
        jTextFieldPrecioTotal.setEnabled(false);
        jTextFieldPrecioTotal.setEditable(false);
    }//GEN-LAST:event_jTextFieldPrecioTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JPanel PanelForm;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JComboBox<String> jComboBoxMascota;
    private javax.swing.JComboBox<String> jComboBoxServicio;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameMen;
    private javax.swing.JTextField jTextFieldPhoneMen;
    private javax.swing.JTextField jTextFieldPrecioTotal;
    private javax.swing.JTextField jTextFieldRaza;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMascota;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreDueño;
    private javax.swing.JLabel labelPhoneMen1;
    private javax.swing.JLabel labelPrecioTotal;
    private javax.swing.JLabel labelPrecioTotal1;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelServicio;
    private javax.swing.JLabel labelVeterinaria;
    // End of variables declaration//GEN-END:variables
}
