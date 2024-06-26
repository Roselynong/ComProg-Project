/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project;

/**
 *
 * @author Roselyn
 */
public class AddNote extends javax.swing.JPanel {

    /**
     * Creates new form AddNote
     */
    public AddNote() {
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

        NoteDiplay = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Title = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        choice2 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        Bold = new javax.swing.JLabel();
        Italics = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        WordCount = new javax.swing.JLabel();
        Number = new javax.swing.JLabel();

        NoteDiplay.setBackground(new java.awt.Color(255, 245, 228));

        Title.setBackground(new java.awt.Color(255, 245, 228));
        Title.setColumns(20);
        Title.setRows(5);
        Title.setToolTipText("Insert Title");
        Title.setWrapStyleWord(true);
        Title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Title.setName(""); // NOI18N
        Title.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(Title);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setText("Back_Icon");

        Bold.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bold.setText("B");

        Italics.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Italics.setText("I");

        Date.setText("Date");

        WordCount.setText("Word Count");

        Number.setText("Number Count");

        javax.swing.GroupLayout NoteDiplayLayout = new javax.swing.GroupLayout(NoteDiplay);
        NoteDiplay.setLayout(NoteDiplayLayout);
        NoteDiplayLayout.setHorizontalGroup(
            NoteDiplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoteDiplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NoteDiplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoteDiplayLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoteDiplayLayout.createSequentialGroup()
                        .addGroup(NoteDiplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NoteDiplayLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Number))
                            .addGroup(NoteDiplayLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Bold)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Italics)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Date)
                                .addGap(52, 52, 52)
                                .addComponent(WordCount))
                            .addGroup(NoteDiplayLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane2)))
                        .addGap(20, 20, 20))))
            .addGroup(NoteDiplayLayout.createSequentialGroup()
                .addGroup(NoteDiplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NoteDiplayLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NoteDiplayLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        NoteDiplayLayout.setVerticalGroup(
            NoteDiplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoteDiplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NoteDiplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(Number)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NoteDiplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bold)
                    .addComponent(Italics)
                    .addComponent(Date)
                    .addComponent(WordCount))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NoteDiplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NoteDiplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bold;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Italics;
    private java.awt.Panel NoteDiplay;
    private javax.swing.JLabel Number;
    private javax.swing.JTextArea Title;
    private javax.swing.JLabel WordCount;
    private java.awt.Choice choice2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
