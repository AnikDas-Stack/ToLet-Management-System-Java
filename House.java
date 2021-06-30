package Package01;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.text.PlainDocument;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.lang.Number;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class House extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public House() {
        initComponents();
            TextF3.setLineWrap(true);
            TextF3.setWrapStyleWord(true);
            T_3.setLineWrap(true);
            T_3.setWrapStyleWord(true);
    }

    @Override
    public Component add(Component comp) {
        return super.add(comp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        HomeLogo = new javax.swing.JLabel();
        HomeVariable = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        Backward = new javax.swing.JLabel();
        Forward = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_5 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextF3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        T_3 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        T_6 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        T_2 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        T_1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        TextF1 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        TextF2 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        TextF5 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        TextF6 = new javax.swing.JTextArea();
        Bachelor_Submit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_4 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextF4 = new javax.swing.JTextArea();
        House_Submit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        HomeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-home-page-50.png"))); // NOI18N
        HomeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLogoMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 0, 0);
        jPanel1.add(HomeLogo, gridBagConstraints);

        HomeVariable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HomeVariable.setForeground(new java.awt.Color(255, 255, 255));
        HomeVariable.setText("HOME PAGE");
        HomeVariable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeVariableMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 42);
        jPanel1.add(HomeVariable, gridBagConstraints);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-cancel-filled-50.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(262, 66, 0, 0);
        jPanel1.add(close, gridBagConstraints);

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setText("EXIT");
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 73, 39, 0);
        jPanel1.add(EXIT, gridBagConstraints);

        Backward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-left-32.png"))); // NOI18N
        Backward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackwardMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 44, 0, 0);
        jPanel1.add(Backward, gridBagConstraints);

        Forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-right-32.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 0, 0);
        jPanel1.add(Forward, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-home-page-40.png"))); // NOI18N
        jLabel1.setText("Description");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Number of Flat:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Location:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Rent:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Phone:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 30));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 10, 270));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("For Family");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Number of Room:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8.setText("For Bachelor");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Location:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Phone:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, 22));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Number of Seat:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Rent:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Occupation:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        T_5.setColumns(20);
        T_5.setRows(5);
        T_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_5KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(T_5);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 179, 20));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TextF3.setColumns(5);
        TextF3.setRows(5);
        TextF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextF3KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(TextF3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 188, 170, 80));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        T_3.setColumns(20);
        T_3.setRows(5);
        T_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_3KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(T_3);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 179, 80));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        T_6.setColumns(20);
        T_6.setRows(5);
        jScrollPane7.setViewportView(T_6);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 179, 20));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        T_2.setColumns(20);
        T_2.setRows(5);
        T_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_2KeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(T_2);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 179, 19));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        T_1.setColumns(20);
        T_1.setRows(5);
        T_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_1KeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(T_1);

        jPanel3.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 179, 20));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TextF1.setColumns(1);
        TextF1.setLineWrap(true);
        TextF1.setRows(1);
        TextF1.setWrapStyleWord(true);
        TextF1.setMaximumSize(new java.awt.Dimension(24, 0));
        TextF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextF1KeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(TextF1);

        jPanel3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 134, 172, 20));

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TextF2.setColumns(20);
        TextF2.setRows(5);
        TextF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextF2KeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(TextF2);

        jPanel3.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 161, 172, 20));

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TextF5.setColumns(20);
        TextF5.setRows(5);
        TextF5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextF5KeyPressed(evt);
            }
        });
        jScrollPane12.setViewportView(TextF5);

        jPanel3.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 307, 170, 20));

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TextF6.setColumns(20);
        TextF6.setRows(5);
        jScrollPane13.setViewportView(TextF6);

        jPanel3.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 334, 170, 20));

        Bachelor_Submit.setBackground(new java.awt.Color(51, 51, 51));
        Bachelor_Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/button_submit (1).png"))); // NOI18N
        Bachelor_Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bachelor_SubmitMouseClicked(evt);
            }
        });
        Bachelor_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bachelor_SubmitActionPerformed(evt);
            }
        });
        jPanel3.add(Bachelor_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 100, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Available From:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        T_4.setColumns(20);
        T_4.setRows(5);
        T_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_4KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(T_4);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 180, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel16.setText("Available From:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TextF4.setColumns(20);
        TextF4.setRows(5);
        TextF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextF4KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(TextF4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 170, 20));

        House_Submit1.setBackground(new java.awt.Color(51, 51, 51));
        House_Submit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/button_submit (1).png"))); // NOI18N
        House_Submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                House_Submit1MouseClicked(evt);
            }
        });
        House_Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                House_Submit1ActionPerformed(evt);
            }
        });
        jPanel3.add(House_Submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 100, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLogoMouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_HomeLogoMouseClicked

    private void HomeVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeVariableMouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_HomeVariableMouseClicked

    private void Bachelor_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bachelor_SubmitActionPerformed

    }//GEN-LAST:event_Bachelor_SubmitActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void TextF1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextF1KeyPressed

        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
           //TextF2.requestFocus();
       }
           
    }//GEN-LAST:event_TextF1KeyPressed

    private void TextF2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextF2KeyPressed
       //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
           //TextF3.requestFocus();
       }
    }//GEN-LAST:event_TextF2KeyPressed

    private void TextF3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextF3KeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
           //// TextF4.requestFocus();
        }
    }//GEN-LAST:event_TextF3KeyPressed

    private void TextF4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextF4KeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            /////TextF5.requestFocus();
        }
    }//GEN-LAST:event_TextF4KeyPressed

    private void TextF5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextF5KeyPressed
       //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
           //TextF6.requestFocus();
       }
    }//GEN-LAST:event_TextF5KeyPressed

    private void T_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_1KeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            //T_2.requestFocus();
        }
    }//GEN-LAST:event_T_1KeyPressed

    private void T_2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_2KeyPressed
        //////if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            //T_3.requestFocus();
        }
    }//GEN-LAST:event_T_2KeyPressed

    private void T_3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_3KeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            //T_4.requestFocus();
        }
    }//GEN-LAST:event_T_3KeyPressed

    private void T_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_4KeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
          //  T_5.requestFocus();
        }
    }//GEN-LAST:event_T_4KeyPressed

    private void T_5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_5KeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            //T_6.requestFocus();
        }
    }//GEN-LAST:event_T_5KeyPressed

    private void BackwardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackwardMouseClicked
        this.hide();
        Create create = new Create();
        create.identity = "House";
        create.setVisible(true);
    }//GEN-LAST:event_BackwardMouseClicked

    private void House_Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_House_Submit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_House_Submit1ActionPerformed

    private void House_Submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_House_Submit1MouseClicked
        conn= Mysqlconnect.ConnectDB("jdbc:mysql://localhost:3306/tolet?autoReconnect=true&useSSL=false");
       String sql="Insert into family (NumberOfFlat, NumberOfRoom, Location, AvailableFrom, Rent, Phone) value (?,?,?,?,?,?)";
       
       try
       {
         
           pst=conn.prepareStatement(sql);
           pst.setString(1,TextF1.getText());
           pst.setString(2,TextF2.getText());
           pst.setString(3,TextF3.getText());
           pst.setString(4,TextF4.getText());
           pst.setString(5,TextF5.getText());
           pst.setString(6,TextF6.getText());
  
           pst.execute();
                 
           JOptionPane.showMessageDialog(null, "Sccessfully Submitted");
           HomePage object_2 = new HomePage(); 
           object_2.setVisible(true);
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, "Not Submitted");
       }
    }//GEN-LAST:event_House_Submit1MouseClicked

    private void Bachelor_SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bachelor_SubmitMouseClicked
       conn= Mysqlconnect.ConnectDB("jdbc:mysql://localhost:3306/tolet?autoReconnect=true&useSSL=false");
       String sql="Insert into bachelor (NumberOfSeat, Occupation, Location, AvailableFrom, Rent, Phone) value (?,?,?,?,?,?)";
       
       try
       {
           pst=conn.prepareStatement(sql);
           pst.setString(1,T_1.getText());
           pst.setString(2,T_2.getText());
           pst.setString(3,T_3.getText());
           pst.setString(4,T_4.getText());
           pst.setString(5,T_5.getText());
           pst.setString(6,T_6.getText());
  
           pst.execute();
           
           
           JOptionPane.showMessageDialog(null, "Successfully Submitted");
           HomePage object_2 = new HomePage(); 
           object_2.setVisible(true);
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, "Not Submitted");
       }
    }//GEN-LAST:event_Bachelor_SubmitMouseClicked

    public static void main(String args[]) throws SQLException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new House().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bachelor_Submit;
    private javax.swing.JLabel Backward;
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel Forward;
    private javax.swing.JLabel HomeLogo;
    private javax.swing.JLabel HomeVariable;
    private javax.swing.JButton House_Submit1;
    private javax.swing.JTextArea T_1;
    private javax.swing.JTextArea T_2;
    private javax.swing.JTextArea T_3;
    private javax.swing.JTextArea T_4;
    private javax.swing.JTextArea T_5;
    private javax.swing.JTextArea T_6;
    public javax.swing.JTextArea TextF1;
    public javax.swing.JTextArea TextF2;
    private javax.swing.JTextArea TextF3;
    private javax.swing.JTextArea TextF4;
    private javax.swing.JTextArea TextF5;
    private javax.swing.JTextArea TextF6;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
