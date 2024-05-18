/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package application;

import java.beans.Statement;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Roselyn
 */
public class NoteHolder extends javax.swing.JPanel {

    /**
     * Creates new form NoteHolder
     */
    public NoteHolder() {
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

        noteHolderPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout noteHolderPanelLayout = new javax.swing.GroupLayout(noteHolderPanel);
        noteHolderPanel.setLayout(noteHolderPanelLayout);
        noteHolderPanelLayout.setHorizontalGroup(
            noteHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        noteHolderPanelLayout.setVerticalGroup(
            noteHolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noteHolderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noteHolderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNotePreview(String title, String content) {
    JPanel notePreviewPanel = new JPanel();
    notePreviewPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 195, 150)));
    notePreviewPanel.setLayout(new java.awt.BorderLayout());
    
    JLabel titleLabel = new JLabel(title);
    JTextArea contentPreview = new JTextArea(content);
    contentPreview.setEditable(false);
    contentPreview.setLineWrap(true);
    contentPreview.setWrapStyleWord(true);
    contentPreview.setOpaque(false);
    contentPreview.setBorder(null);
    
    notePreviewPanel.add(titleLabel, java.awt.BorderLayout.NORTH);
    notePreviewPanel.add(contentPreview, java.awt.BorderLayout.CENTER);
    
    notePreviewPanel.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            openNoteForEditing(title, content);
        }

        private void openNoteForEditing(String title, String content) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    });
    
    noteHolderPanel.add(notePreviewPanel);
    noteHolderPanel.revalidate();
    noteHolderPanel.repaint();
}
    
    private void openNoteForEditing(String title, String content) {
    titleField.setText(title);
    textField.setText(content);
    NotePanel1.setVisible(true);
}
   
    private void saveNoteData() {
    String title = titleField.getText();
    String text = textField.getText();
    String currentDate = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    if (title.length() <= 0 && text.length() <= 0) {
        return; // Do not save if title and text are empty
    }

    // SQL query to insert data into the database
    String sqlquery = "INSERT INTO login.notes (title, text, date) VALUES (?, ?, ?)";

    try {
        Class.forName("org.postgresql.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "studyflow", "1234");
             PreparedStatement pat = conn.prepareStatement(sqlquery)) {

            pat.setString(1, title);
            pat.setString(2, text);
            pat.setString(3, currentDate);

            int rowsInserted = pat.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Note saved successfully!");
                addNotePreview(title, text); // Add the new note preview
            }
        }
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
    }
}

    private void loadNotes() {
    String sqlquery = "SELECT title, text FROM login.notes";
    
    try {
        Class.forName("org.postgresql.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserInfo", "studyflow", "1234");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlquery)) {

            while (rs.next()) {
                String title = rs.getString("title");
                String text = rs.getString("text");
                addNotePreview(title, text);
            }
        }
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
    }
}

// Call this method in the constructor after initComponents();
loadNotes();

private void BackMouseClicked(java.awt.event.MouseEvent evt) {
    NotePanel1.setVisible(false);
    
    // Clear or empty the notes.
    titleField.setText("");
    textField.setText("");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel noteHolderPanel;
    // End of variables declaration//GEN-END:variables
}