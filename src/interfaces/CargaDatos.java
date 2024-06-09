package interfaces;

import clases.Controlador;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CargaDatos extends javax.swing.JFrame {

    public File archivoSeleccionado;

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
        jComboBoxMascota = new javax.swing.JComboBox<>();
        labelPhoneMen2 = new javax.swing.JLabel();
        jTextFieldPhoneMen = new javax.swing.JTextField();
        labelPrecioTotal3 = new javax.swing.JLabel();
        jButtonSelectImagen1 = new javax.swing.JButton();
        jTextFieldRaza = new javax.swing.JTextField();
        jLabelImagenSelected = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        jDateChooserDateSignUp = new com.toedter.calendar.JDateChooser();

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

        labelFecha1.setText("Fecha de Ingreso:");

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

        jComboBoxMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato" }));
        jComboBoxMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMascotaActionPerformed(evt);
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

        jButtonSelectImagen1.setText("Seleccionar Foto:");
        jButtonSelectImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectImagen1ActionPerformed(evt);
            }
        });

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

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PerroPayaso.png"))); // NOI18N
        labelLogo.setText("jLabel1");

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jComboBoxMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jDateChooserDateSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelPhoneMen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombreDueño1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNameMen)
                            .addComponent(jTextFieldPhoneMen)
                            .addComponent(jTextFieldAge)
                            .addComponent(jTextFieldRaza))
                        .addGap(38, 38, 38))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addComponent(jButtonSelectImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelImagenSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 161, Short.MAX_VALUE))))
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
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreDueño1)
                            .addComponent(jTextFieldNameMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMascota1)
                                    .addComponent(jComboBoxMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelRaza)
                                    .addComponent(jTextFieldRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(14, 14, 14)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFecha1)
                            .addComponent(jDateChooserDateSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButtonSelectImagen1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormLayout.createSequentialGroup()
                        .addComponent(jLabelImagenSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFormLayout.createSequentialGroup()
                    .addContainerGap(279, Short.MAX_VALUE)
                    .addComponent(labelPrecioTotal3)
                    .addGap(0, 351, Short.MAX_VALUE)))
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
                        .addGap(387, 387, 387)
                        .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(774, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
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
        Date dateSignUpMascota = jDateChooserDateSignUp.getDate();
        String nameMascota = jTextFieldName.getText();
        String tipoMascota = (String) jComboBoxMascota.getSelectedItem();
        String nameMen = jTextFieldNameMen.getText();
        String phoneMen = jTextFieldPhoneMen.getText();
        String raza = jTextFieldRaza.getText();
        String imagePath = jLabelImagenSelected.getText();

        byte[] imageBytes = null;
        if (imagePath != null && !imagePath.isEmpty() && Files.exists(Paths.get(imagePath))) {
            try {
                imageBytes = Files.readAllBytes(Paths.get(imagePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Error: La ruta de la imagen no es válida o el archivo no existe.");
        }

        if (imageBytes != null) {
            control.guardar(raza, edadMascota, colorMascota, dateSignUpMascota, nameMascota, tipoMascota, nameMen, phoneMen, imageBytes);
            JOptionPane optionPane = new JOptionPane("Guardado Exitosamente");
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("GUARDADO");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } else {
            JOptionPane optionPane = new JOptionPane("Error al cargar la imagen");
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("ERROR");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

        jTextFieldAge.setText("");
        jTextFieldColor.setText("");
        jDateChooserDateSignUp.setCalendar(null);
        jTextFieldName.setText("");
        jTextFieldNameMen.setText("");
        jTextFieldAge.setText("");
        jTextFieldPhoneMen.setText("");
        jTextFieldRaza.setText("");
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void ButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpiarActionPerformed

        jTextFieldAge.setText("");
        jTextFieldColor.setText("");
        jDateChooserDateSignUp.setCalendar(null);
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

    private void jComboBoxMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMascotaActionPerformed

    private void jTextFieldPhoneMenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenFocusGained

    private void jTextFieldPhoneMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenActionPerformed

    private void jButtonSelectImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectImagen1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            archivoSeleccionado = fileChooser.getSelectedFile();
            jLabelImagenSelected.setText(archivoSeleccionado.getName());

            try {
                Image img = ImageIO.read(archivoSeleccionado);
                ImageIcon originalIcon = new ImageIcon(img);

                int lblAnchura = jLabelImagenSelected.getWidth();
                int lblAltura = jLabelImagenSelected.getHeight();

                Image scaleImage = originalIcon.getImage().getScaledInstance(lblAnchura, lblAltura, Image.SCALE_SMOOTH);
                jLabelImagenSelected.setIcon(new ImageIcon(scaleImage));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR IMAGEN");
            }
        }
    }//GEN-LAST:event_jButtonSelectImagen1ActionPerformed

    private void jTextFieldRazaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRazaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazaFocusGained

    private void jTextFieldRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonSelectImagen1;
    private javax.swing.JComboBox<String> jComboBoxMascota;
    private com.toedter.calendar.JDateChooser jDateChooserDateSignUp;
    private javax.swing.JLabel jLabelImagenSelected;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameMen;
    private javax.swing.JTextField jTextFieldPhoneMen;
    private javax.swing.JTextField jTextFieldRaza;
    private javax.swing.JLabel labelColor1;
    private javax.swing.JLabel labelEdad1;
    private javax.swing.JLabel labelFecha1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMascota1;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombreDueño1;
    private javax.swing.JLabel labelPhoneMen2;
    private javax.swing.JLabel labelPrecioTotal3;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelVeterinaria;
    // End of variables declaration//GEN-END:variables
}
