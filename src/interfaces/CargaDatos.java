package interfaces;

import clases.Controlador;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CargaDatos extends javax.swing.JFrame {
    
    Controlador control = new Controlador();
    
    
    public CargaDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        labelVeterinaria = new javax.swing.JLabel();
        PanelForm = new javax.swing.JPanel();
        labelRaza = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelNombreDueño = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jTextFieldPhoneMen = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldDateBirth = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        labelPhoneMen = new javax.swing.JLabel();
        jTextFieldNameMen = new javax.swing.JTextField();
        jComboBoxRaza = new javax.swing.JComboBox<>();
        PanelButtons = new javax.swing.JPanel();
        ButtonLimpiar = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 165, 0));

        labelVeterinaria.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        labelVeterinaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVeterinaria.setText("PELUQUERIA");

        PanelForm.setBackground(new java.awt.Color(255, 165, 0));

        labelRaza.setText("Raza:");

        labelColor.setText("Color:");

        labelNombreDueño.setText("Nombre de Dueño:");

        labelEdad.setText("Edad:");

        labelFecha.setText("Fecha de Nacimiento:");

        labelNombre.setText("Nombre:");

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

        jTextFieldDateBirth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDateBirthFocusGained(evt);
            }
        });
        jTextFieldDateBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateBirthActionPerformed(evt);
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

        labelPhoneMen.setText("Celular del Dueño:");

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

        jComboBoxRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato" }));
        jComboBoxRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFormLayout = new javax.swing.GroupLayout(PanelForm);
        PanelForm.setLayout(PanelFormLayout);
        PanelFormLayout.setHorizontalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                        .addComponent(labelFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addComponent(labelNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNameMen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                        .addComponent(labelRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                        .addComponent(labelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                        .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPhoneMen, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhoneMen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        PanelFormLayout.setVerticalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRaza)
                    .addComponent(jComboBoxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEdad)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNameMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreDueño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhoneMen)
                    .addComponent(jTextFieldPhoneMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PerroPayaso.png"))); // NOI18N
        labelLogo.setText("jLabel1");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(labelVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPhoneMenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenFocusGained

    private void jTextFieldPhoneMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneMenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneMenActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        String edadMascota = (String) jTextFieldAge.getText();
        String colorMascota = jTextFieldColor.getText();
        String dateBirthMascota = jTextFieldDateBirth.getText();
        String nameMascota = jTextFieldName.getText();
        String razaMascota = (String) jComboBoxRaza.getSelectedItem();
        String nameMen = jTextFieldNameMen.getText();
        String phoneMen = jTextFieldPhoneMen.getText();
        
        control.guardar(edadMascota, colorMascota, dateBirthMascota, nameMascota, razaMascota,nameMen,phoneMen);
        
        JOptionPane optionPane = new JOptionPane("Guardado Exitosamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("GUARDADO");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_ButtonGuardarActionPerformed

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

    private void jTextFieldDateBirthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDateBirthFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateBirthFocusGained

    private void jTextFieldDateBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateBirthActionPerformed

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

    private void ButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpiarActionPerformed
        jTextFieldAge.setText("");
        jTextFieldColor.setText("");
        jTextFieldDateBirth.setText("");
        jTextFieldName.setText("");
        jTextFieldNameMen.setText("");
        jTextFieldPhoneMen.setText("");
    }//GEN-LAST:event_ButtonLimpiarActionPerformed

    private void jComboBoxRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRazaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JPanel PanelForm;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JComboBox<String> jComboBoxRaza;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldDateBirth;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameMen;
    private javax.swing.JTextField jTextFieldPhoneMen;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreDueño;
    private javax.swing.JLabel labelPhoneMen;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelVeterinaria;
    // End of variables declaration//GEN-END:variables
}
