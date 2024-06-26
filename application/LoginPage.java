package application;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Roselyn
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        LoginPanel = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        account = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StudyFlow");
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        LoginPanel.setBackground(new java.awt.Color(255, 244, 199));
        LoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 139, 86), 3), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N
        LoginPanel.setName(""); // NOI18N
        LoginPanel.setPreferredSize(new java.awt.Dimension(677, 400));

        emailField.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        emailField.setToolTipText("");
        emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 139, 86)));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        passwordLabel.setText("Password");

        emailLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        emailLabel.setText("Email");

        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 139, 86)));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        account.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        account.setText("No account yet?");

        signup.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 102, 255));
        signup.setText("Sign-Up");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signupMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signupMouseReleased(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(251, 192, 108));
        loginButton.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailLabel)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(account)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signup))
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(passwordLabel))
                .addGap(203, 203, 203))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addGap(7, 7, 7)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account)
                    .addComponent(signup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        // Application of the Cursor events
        // Opens the window for SignUpPage
        signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        SignUpPage signupPage = new SignUpPage();
        signupPage.setLocationRelativeTo(this);
        signupPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Application of Postgresql Connection
        // Upon fulfillment, it opens the new window for HomePage
        String email = emailField.getText();
        String password = new String (passwordField.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "The contents are empty. Fill up the information first!");
        return; // Stop further execution
    }
        
        // SQL query to insert data into the database
        String sqlquery;
        sqlquery = "SELECT * FROM login.login WHERE email=? AND password=?";
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "studyflow", "1234");
                PreparedStatement pat = conn.prepareStatement(sqlquery)) {

                pat.setString(1, email);
                pat.setString(2, password);


                try (ResultSet rs = pat.executeQuery()) {
                    if(rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        this.dispose();
                        new HomePage().show();
                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid email or password.");
                    }
                }
            }
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        // Change of color and underline effect
        signup.setForeground(new Color(51, 100, 255));
        signup.setText("<html><u>Sign-Up</u></html>");
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        // Removes underline upon exit
        signup.setText("Sign-Up");
    }//GEN-LAST:event_signupMouseExited

    private void signupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMousePressed
        // Change of color
        signup.setForeground(new Color(0, 0, 255).brighter());
    }//GEN-LAST:event_signupMousePressed

    private void signupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseReleased
        // Color returns to original state
        signup.setForeground(new Color(51, 100, 255));
    }//GEN-LAST:event_signupMouseReleased

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            LoginPage loginPage = new LoginPage();
            loginPage.setLocationRelativeTo(null);
            loginPage.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel account;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel signup;
    // End of variables declaration//GEN-END:variables
}
