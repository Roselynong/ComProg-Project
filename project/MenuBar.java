/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

/**
 *
 * @author Roselyn
 */
public class MenuBar extends javax.swing.JFrame {

    /**
     * Creates new form MenuBar
     */
    public MenuBar() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Notes = new javax.swing.JMenuItem();
        Reminders = new javax.swing.JMenuItem();
        Schedule = new javax.swing.JMenuItem();
        Archive = new javax.swing.JMenuItem();
        Trash = new javax.swing.JMenuItem();
        Settings = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/STUDY_FLOW (1).png"))); // NOI18N
        Menu.setText("Menu");
        Menu.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        Notes.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Notes.setText("Notes");
        Notes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotesActionPerformed(evt);
            }
        });
        Menu.add(Notes);

        Reminders.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Reminders.setText("Reminders");
        Reminders.setToolTipText("");
        Reminders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemindersActionPerformed(evt);
            }
        });
        Menu.add(Reminders);

        Schedule.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Schedule.setText("Schedule");
        Menu.add(Schedule);

        Archive.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Archive.setText("Archive");
        Menu.add(Archive);

        Trash.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Trash.setText("Trash");
        Trash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrashActionPerformed(evt);
            }
        });
        Menu.add(Trash);

        Settings.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Settings.setText("Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        Menu.add(Settings);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotesActionPerformed

    private void RemindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemindersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemindersActionPerformed

    private void TrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrashActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Archive;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem Notes;
    private javax.swing.JMenuItem Reminders;
    private javax.swing.JMenuItem Schedule;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JMenuItem Trash;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
