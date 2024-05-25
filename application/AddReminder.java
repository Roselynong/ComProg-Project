/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

/**
 *
 * @author Roselyn
 */
public class AddReminder extends javax.swing.JFrame {

    /**
     * Creates new form AddReminder
     */
    public AddReminder() {
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

        ReminderPanel = new javax.swing.JPanel();
        saveNote = new javax.swing.JButton();
        CurrentDate = new javax.swing.JLabel();
        schoolIdField = new javax.swing.JTextField();
        school_id = new javax.swing.JLabel();
        reminderentryLabel = new javax.swing.JLabel();
        reminderentryField = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        titleField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        descriptionField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReminderPanel.setBackground(new java.awt.Color(255, 245, 228));
        ReminderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 195, 150)));

        saveNote.setBackground(new java.awt.Color(255, 204, 153));
        saveNote.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveNote.setText("Save");
        saveNote.setBorder(null);
        saveNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNoteActionPerformed(evt);
            }
        });

        CurrentDate.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        CurrentDate.setText("Date");

        schoolIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolIdFieldActionPerformed(evt);
            }
        });

        school_id.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        school_id.setText("School ID:");
        school_id.setToolTipText("");
        school_id.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        school_id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        school_id.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        school_id.setVerifyInputWhenFocusTarget(false);

        reminderentryLabel.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        reminderentryLabel.setText("Reminder Entry:");
        reminderentryLabel.setToolTipText("");
        reminderentryLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        reminderentryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reminderentryLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        reminderentryLabel.setVerifyInputWhenFocusTarget(false);

        reminderentryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderentryFieldActionPerformed(evt);
            }
        });

        titleField.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        titleField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titleField.setToolTipText("Insert Title");
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        titleLabel.setText("Title:");
        titleLabel.setToolTipText("");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        titleLabel.setVerifyInputWhenFocusTarget(false);

        descriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionFieldActionPerformed(evt);
            }
        });

        descriptionLabel.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        descriptionLabel.setText("Description");
        descriptionLabel.setToolTipText("");
        descriptionLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        descriptionLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descriptionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        descriptionLabel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout ReminderPanelLayout = new javax.swing.GroupLayout(ReminderPanel);
        ReminderPanel.setLayout(ReminderPanelLayout);
        ReminderPanelLayout.setHorizontalGroup(
            ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReminderPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ReminderPanelLayout.createSequentialGroup()
                            .addComponent(titleLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(titleField))
                        .addGroup(ReminderPanelLayout.createSequentialGroup()
                            .addComponent(CurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveNote, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ReminderPanelLayout.createSequentialGroup()
                            .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(school_id)
                                .addComponent(schoolIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reminderentryLabel)
                                .addComponent(reminderentryField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(descriptionField)
                        .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        ReminderPanelLayout.setVerticalGroup(
            ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReminderPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReminderPanelLayout.createSequentialGroup()
                        .addComponent(school_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schoolIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReminderPanelLayout.createSequentialGroup()
                        .addComponent(reminderentryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reminderentryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveNote, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrentDate))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReminderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReminderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNoteActionPerformed

    }//GEN-LAST:event_saveNoteActionPerformed

    private void reminderentryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderentryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reminderentryFieldActionPerformed

    private void schoolIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolIdFieldActionPerformed

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void descriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddReminder().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentDate;
    private javax.swing.JPanel ReminderPanel;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField reminderentryField;
    private javax.swing.JLabel reminderentryLabel;
    private javax.swing.JButton saveNote;
    private javax.swing.JTextField schoolIdField;
    private javax.swing.JLabel school_id;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}