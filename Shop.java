package Package01;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Shop extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Shop() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        HomeLogo = new javax.swing.JLabel();
        HomeVariable = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        Backward = new javax.swing.JLabel();
        Forward = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Field_1 = new javax.swing.JTextField();
        Field_2 = new javax.swing.JTextField();
        Field_3 = new javax.swing.JTextField();
        Field_4 = new javax.swing.JTextField();
        Field_6 = new javax.swing.JTextField();
        Field_5 = new javax.swing.JTextField();
        Shop_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        HomeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-home-page-50.png"))); // NOI18N
        HomeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLogoMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 70, 0, 0);
        jPanel3.add(HomeLogo, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(2, 40, 0, 32);
        jPanel3.add(HomeVariable, gridBagConstraints);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-cancel-filled-50.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(264, 65, 0, 0);
        jPanel3.add(close, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 72, 35, 0);
        jPanel3.add(EXIT, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(13, 50, 0, 0);
        jPanel3.add(Backward, gridBagConstraints);

        Forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-right-32.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 0, 0);
        jPanel3.add(Forward, gridBagConstraints);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-small-business-48.png"))); // NOI18N
        jLabel1.setText("Shop Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 3, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Shop Type:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 103, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Shop Size:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 132, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Location:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Rent Per Month:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 251, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Phone:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 311, -1, -1));

        Field_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Field_1KeyPressed(evt);
            }
        });
        jPanel2.add(Field_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 102, 256, -1));

        Field_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Field_2KeyPressed(evt);
            }
        });
        jPanel2.add(Field_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 131, 256, -1));

        Field_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Field_3KeyPressed(evt);
            }
        });
        jPanel2.add(Field_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 160, 256, 83));

        Field_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Field_4KeyPressed(evt);
            }
        });
        jPanel2.add(Field_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 250, 256, -1));
        jPanel2.add(Field_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 308, 256, -1));

        Field_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Field_5KeyPressed(evt);
            }
        });
        jPanel2.add(Field_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 279, 256, -1));

        Shop_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/button_submit (1).png"))); // NOI18N
        Shop_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_submitMouseClicked(evt);
            }
        });
        Shop_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Shop_submitActionPerformed(evt);
            }
        });
        jPanel2.add(Shop_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 650, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Shop_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Shop_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_submitActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked

        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void Field_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Field_2.requestFocus();
        }
    }//GEN-LAST:event_Field_1KeyPressed

    private void Field_2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Field_3.requestFocus();
        }
    }//GEN-LAST:event_Field_2KeyPressed

    private void Field_3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_3KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Field_4.requestFocus();
        }
    }//GEN-LAST:event_Field_3KeyPressed

    private void Field_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_4KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Field_5.requestFocus();
        }
    }//GEN-LAST:event_Field_4KeyPressed

    private void Field_5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_5KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Field_6.requestFocus();
        }
    }//GEN-LAST:event_Field_5KeyPressed

    private void BackwardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackwardMouseClicked
        this.hide();
        Create create = new Create();
        create.identity = "Shop";
        create.setVisible(true);
    }//GEN-LAST:event_BackwardMouseClicked

    private void Shop_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_submitMouseClicked
       conn= Mysqlconnect.ConnectDB("jdbc:mysql://localhost:3306/tolet?autoReconnect=true&useSSL=false");
       String sql1="Insert into shop (ShopType, ShopSize, Location, RentPerMonth, Email, Phone) value (?,?,?,?,?,?)";
       
       try
       {
           pst=conn.prepareStatement(sql1);
           pst.setString(1,Field_1.getText());
           pst.setString(2,Field_2.getText());
           pst.setString(3,Field_3.getText());
           pst.setString(4,Field_4.getText());
           pst.setString(5,Field_5.getText());
           pst.setString(6,Field_6.getText());
  
           pst.execute();
                 
           JOptionPane.showMessageDialog(null, "Sccessfully Submitted");
           HomePage object_2 = new HomePage(); 
           object_2.setVisible(true);
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, "Not Submitted");
       }
    }//GEN-LAST:event_Shop_submitMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backward;
    private javax.swing.JLabel EXIT;
    private javax.swing.JTextField Field_1;
    private javax.swing.JTextField Field_2;
    private javax.swing.JTextField Field_3;
    private javax.swing.JTextField Field_4;
    private javax.swing.JTextField Field_5;
    private javax.swing.JTextField Field_6;
    private javax.swing.JLabel Forward;
    private javax.swing.JLabel HomeLogo;
    private javax.swing.JLabel HomeVariable;
    private javax.swing.JButton Shop_submit;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
