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
        PanelButtons = new javax.swing.JPanel();
        ButtonLimpiar = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        ButtonVolver = new javax.swing.JButton();
        jPanelForm = new javax.swing.JPanel();
        labelMascota1 = new javax.swing.JLabel();
        labelColor1 = new javax.swing.JLabel();
        labelNombreDueño1 = new javax.swing.JLabel();
        labelEdad1 = new javax.swing.JLabel();
        labelFecha1 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        labelRaza = new javax.swing.JLabel();
        jTextFieldNameMen = new javax.swing.JTextField();
        jComboBoxMascota1 = new javax.swing.JComboBox<>();
        labelPhoneMen2 = new javax.swing.JLabel();
        jTextFieldPhoneMen = new javax.swing.JTextField();
        labelServicio1 = new javax.swing.JLabel();
        jComboBoxServicio1 = new javax.swing.JComboBox<>();
        labelPrecioTotal2 = new javax.swing.JLabel();
        jTextFieldPrecioTotal = new javax.swing.JTextField();
        labelPrecioTotal3 = new javax.swing.JLabel();
        jButtonSelectImagen1 = new javax.swing.JButton();
        jTextFieldImageSelected = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextFieldAge1 = new javax.swing.JTextField();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 165, 0));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1888, 1276));

        labelVeterinaria.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        labelVeterinaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVeterinaria.setText("PELUQUERIA");

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

        jPanelForm.setBackground(new java.awt.Color(255, 165, 0));

        labelMascota1.setText("Mascota");

        labelColor1.setText("Color:");

        labelNombreDueño1.setText("Nombre de Dueño:");

        labelEdad1.setText("Edad:");

        labelFecha1.setText("Fecha de Nacimiento:");

        labelNombre1.setText("Nombre:");

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

        jComboBoxMascota1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato" }));
        jComboBoxMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMascota1ActionPerformed(evt);
            }
        });

        labelPhoneMen2.setText("Celular del Dueño:");

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

        labelServicio1.setText("Servicio:");

        jComboBoxServicio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baño Basico", "Corte de Pelo y Estilizado", "Corte de Uñas", "Spa (masajes-mascarillas-etc)", "Limpieza de Oidos y Dientes" }));
        jComboBoxServicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicio1ActionPerformed(evt);
            }
        });

        labelPrecioTotal2.setText("Precio Total:");

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

        jButtonSelectImagen1.setText("Seleccionar Foto:");
        jButtonSelectImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectImagen1ActionPerformed(evt);
            }
        });

        jTextFieldAge1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAge1FocusGained(evt);
            }
        });
        jTextFieldAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAge1ActionPerformed(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PerroPayaso.png"))); // NOI18N
        labelLogo.setText("jLabel1");

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPrecioTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxServicio1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPhoneMen2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelFormLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelRaza)))
                                    .addComponent(labelNombreDueño1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNameMen)
                                    .addComponent(jTextFieldPhoneMen)
                                    .addComponent(jTextFieldAge)
                                    .addComponent(jTextFieldAge1)))
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonSelectImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldImageSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFormLayout.createSequentialGroup()
                    .addContainerGap(641, Short.MAX_VALUE)
                    .addComponent(labelPrecioTotal3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMascota1)
                                    .addComponent(jComboBoxMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelRaza)
                                    .addComponent(jTextFieldAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombre1)
                            .addComponent(labelEdad1)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelColor1)
                            .addComponent(labelPhoneMen2)
                            .addComponent(jTextFieldPhoneMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFecha1)))
                    .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNombreDueño1)
                        .addComponent(jTextFieldNameMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelServicio1)
                            .addComponent(jComboBoxServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrecioTotal2)
                            .addComponent(jTextFieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jTextFieldImageSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jButtonSelectImagen1))
                .addGap(18, 18, 18)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFormLayout.createSequentialGroup()
                    .addContainerGap(92, Short.MAX_VALUE)
                    .addComponent(labelPrecioTotal3)
                    .addGap(0, 165, Short.MAX_VALUE)))
        );

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
                        .addGap(481, 481, 481)
                        .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(766, Short.MAX_VALUE))
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
                .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String dateBirthMascota = jDateChooser.getDateFormatString();
        String nameMascota = jTextFieldName.getText();
        String tipoMascota = (String) jComboBoxMascota.getSelectedItem();
        String nameMen = jTextFieldNameMen.getText();
        String phoneMen = jTextFieldPhoneMen.getText();
        String raza = jTextFieldAge.getText();

        control.guardar(raza, edadMascota, colorMascota, dateBirthMascota, nameMascota, tipoMascota, nameMen, phoneMen);

        JOptionPane optionPane = new JOptionPane("Guardado Exitosamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("GUARDADO");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

        jTextFieldAge.setText("");
        jTextFieldColor.setText("");
        jDateChooser.setCalendar(null);
        jTextFieldName.setText("");
        jTextFieldNameMen.setText("");
        jTextFieldAge.setText("");
        jTextFieldPhoneMen.setText("");
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void ButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpiarActionPerformed

        jTextFieldAge.setText("");
        jTextFieldColor.setText("");
        jDateChooser.setCalendar(null);
        jTextFieldName.setText("");
        jTextFieldNameMen.setText("");
        jTextFieldAge.setText("");
        jTextFieldPhoneMen.setText("");
    }//GEN-LAST:event_ButtonLimpiarActionPerformed

    private void jTextFieldAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAgeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeFocusGained

    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeActionPerformed

    private void jTextFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameFocusGained

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldColorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColorFocusGained

    private void jTextFieldColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColorActionPerformed

    private void jTextFieldNameMenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameMenFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameMenFocusGained

    private void jTextFieldNameMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameMenActionPerformed

    private void jComboBoxMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMascota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMascota1ActionPerformed

    private void jTextFieldPhoneMenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenFocusGained

    private void jTextFieldPhoneMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenActionPerformed

    private void jComboBoxServicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicio1ActionPerformed

    private void jTextFieldPrecioTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPrecioTotalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioTotalFocusGained

    private void jTextFieldPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioTotalActionPerformed

    private void jButtonSelectImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectImagen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSelectImagen1ActionPerformed

    private void jTextFieldAge1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAge1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAge1FocusGained

    private void jTextFieldAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAge1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonSelectImagen1;
    private javax.swing.JComboBox<String> jComboBoxMascota1;
    private javax.swing.JComboBox<String> jComboBoxServicio1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldAge1;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldImageSelected;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameMen;
    private javax.swing.JTextField jTextFieldPhoneMen;
    private javax.swing.JTextField jTextFieldPrecioTotal;
    private javax.swing.JLabel labelColor1;
    private javax.swing.JLabel labelEdad1;
    private javax.swing.JLabel labelFecha1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMascota1;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombreDueño1;
    private javax.swing.JLabel labelPhoneMen2;
    private javax.swing.JLabel labelPrecioTotal2;
    private javax.swing.JLabel labelPrecioTotal3;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelServicio1;
    private javax.swing.JLabel labelVeterinaria;
    // End of variables declaration//GEN-END:variables
}
