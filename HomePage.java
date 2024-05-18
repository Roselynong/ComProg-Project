package application;

import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Roselyn
 */
public class HomePage extends javax.swing.JFrame {

    
    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        HomePanel = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        addbutton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Notes = new javax.swing.JMenuItem();
        Reminders = new javax.swing.JMenuItem();
        Archive = new javax.swing.JMenuItem();
        Trash = new javax.swing.JMenuItem();
        Settings = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomePanel.setBackground(new java.awt.Color(255, 244, 199));

        LOGO.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        LOGO.setText("STUDYFLOW");

        addbutton.setBackground(new java.awt.Color(255, 204, 153));
        addbutton.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        addbutton.setText("+");
        addbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(206, 153, 67), java.awt.Color.orange));
        addbutton.setBorderPainted(false);
        addbutton.setFocusPainted(false);
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(628, 628, 628)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOGO))
                .addContainerGap(2154, Short.MAX_VALUE))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2232, Short.MAX_VALUE))
        );

        MenuBar.setBackground(new java.awt.Color(204, 204, 204));
        MenuBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MenuBar.setBorderPainted(false);
        MenuBar.setFocusable(false);
        MenuBar.setRequestFocusEnabled(false);
        MenuBar.setSelectionModel(null);
        MenuBar.setVerifyInputWhenFocusTarget(false);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/STUDY_FLOW (1).png"))); // NOI18N
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

        MenuBar.add(Menu);

        setJMenuBar(MenuBar);
        MenuBar.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Select an option:");
        String[] options = {"Add new note", "Add new reminder"};
        JComboBox<String> dropdown = new JComboBox<>(options);

        panel.add(label);
        panel.add(dropdown);
        
        int result = JOptionPane.showOptionDialog(null, dropdown, "Select an option",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

        if (result == JOptionPane.OK_OPTION) {
            String selectedOption = (String) dropdown.getSelectedItem();
        // Depending on the selected option, perform corresponding actions
            if (selectedOption.equals("Add new note")) {
                System.out.println("Adding new note...");
                
                AddNote addNote = new AddNote();
                 JDialog dialog = new JDialog();
            // Create a JFrame to hold the AddNote panel
                dialog.setModal(true); // Make the dialog modal
                dialog.setTitle("Add Note");
                dialog.getContentPane().add(addNote);
                dialog.pack();
                dialog.setLocationRelativeTo(null); // Center the dialog on the screen
                dialog.setVisible(true);
            } else if (selectedOption.equals("Add new reminder")) {
            // Code to add new reminder
            System.out.println("Adding new reminder...");
        }
    }
        
        

    }//GEN-LAST:event_addbuttonActionPerformed

    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {  
            HomePage homePage = new HomePage();
            homePage.setLocationRelativeTo(null);
            homePage.setVisible(true);
        });
    }

    public javax.swing.JPanel maxnotePanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Archive;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel LOGO;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem Notes;
    private javax.swing.JMenuItem Reminders;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JMenuItem Trash;
    private javax.swing.JButton addbutton;
    // End of variables declaration//GEN-END:variables
}