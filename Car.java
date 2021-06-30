package Package01;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Car extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Car() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextField_1 = new javax.swing.JTextField();
        TextField_2 = new javax.swing.JTextField();
        TextField_3 = new javax.swing.JTextField();
        TextField_4 = new javax.swing.JTextField();
        TextField_5 = new javax.swing.JTextField();
        TextField_6 = new javax.swing.JTextField();
        Car_Submit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        HomeLogo = new javax.swing.JLabel();
        HomeVariable = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        Forward = new javax.swing.JLabel();
        Backward = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-traffic-jam-48.png"))); // NOI18N
        jLabel2.setText("Information Form");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 136, 0, 139);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Company Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 81, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Owner Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 101, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Office Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 92, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Website:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 135, 0, 0);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 154, 0, 0);
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Phone:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 147, 0, 0);
        jPanel3.add(jLabel7, gridBagConstraints);

        TextField_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_1ActionPerformed(evt);
            }
        });
        TextField_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_1KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 5, 0, 139);
        jPanel3.add(TextField_1, gridBagConstraints);

        TextField_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_2KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 5, 0, 139);
        jPanel3.add(TextField_2, gridBagConstraints);

        TextField_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_3KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.ipady = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 5, 0, 139);
        jPanel3.add(TextField_3, gridBagConstraints);

        TextField_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_4KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 5, 0, 139);
        jPanel3.add(TextField_4, gridBagConstraints);

        TextField_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_5KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 5, 0, 139);
        jPanel3.add(TextField_5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 5, 0, 139);
        jPanel3.add(TextField_6, gridBagConstraints);

        Car_Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/button_submit (1).png"))); // NOI18N
        Car_Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Car_SubmitMouseClicked(evt);
            }
        });
        Car_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Car_SubmitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = -37;
        gridBagConstraints.ipady = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 90, 41, 0);
        jPanel3.add(Car_Submit, gridBagConstraints);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 650, 440));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.insets = new java.awt.Insets(22, 65, 0, 0);
        jPanel4.add(HomeLogo, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 36, 0, 36);
        jPanel4.add(HomeVariable, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(253, 65, 0, 0);
        jPanel4.add(close, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(7, 72, 37, 0);
        jPanel4.add(EXIT, gridBagConstraints);

        Forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-right-32.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 0, 0);
        jPanel4.add(Forward, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(13, 47, 0, 0);
        jPanel4.add(Backward, gridBagConstraints);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Car_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Car_SubmitActionPerformed
        
    }//GEN-LAST:event_Car_SubmitActionPerformed

    private void HomeLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLogoMouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_HomeLogoMouseClicked

    private void HomeVariableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeVariableMouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_HomeVariableMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked

        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void TextField_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            TextField_2.requestFocus();
        }
    }//GEN-LAST:event_TextField_1KeyPressed

    private void TextField_2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_2KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            TextField_3.requestFocus();
        }
    }//GEN-LAST:event_TextField_2KeyPressed

    private void TextField_3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_3KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            TextField_4.requestFocus();
        }
    }//GEN-LAST:event_TextField_3KeyPressed

    private void TextField_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_4KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            TextField_5.requestFocus();
        }
    }//GEN-LAST:event_TextField_4KeyPressed

    private void TextField_5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_5KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            TextField_6.requestFocus();
        }
    }//GEN-LAST:event_TextField_5KeyPressed

    private void BackwardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackwardMouseClicked
        this.hide();
        Create create = new Create();
        create.identity = "Car";
        create.setVisible(true);
    }//GEN-LAST:event_BackwardMouseClicked

    private void TextField_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_1ActionPerformed

    }//GEN-LAST:event_TextField_1ActionPerformed

    private void Car_SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Car_SubmitMouseClicked
        conn= Mysqlconnect.ConnectDB("jdbc:mysql://localhost:3306/tolet?autoReconnect=true&useSSL=false");
       String sql1="Insert into car (CompanyName, OwnerName, OfficeAddress, Website, Email, Phone) value (?,?,?,?,?,?)";
       
       try
       {
         
           pst=conn.prepareStatement(sql1);
           pst.setString(1,TextField_1.getText());
           pst.setString(2,TextField_2.getText());
           pst.setString(3,TextField_3.getText());
           pst.setString(4,TextField_4.getText());
           pst.setString(5,TextField_5.getText());
           pst.setString(6,TextField_6.getText());
  
           pst.execute();
                 
           JOptionPane.showMessageDialog(null, "Sccessfully Submitted");
           HomePage object_2 = new HomePage(); 
           object_2.setVisible(true);
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, "Not Submitted");
       }
    }//GEN-LAST:event_Car_SubmitMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backward;
    private javax.swing.JButton Car_Submit;
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel Forward;
    private javax.swing.JLabel HomeLogo;
    private javax.swing.JLabel HomeVariable;
    private javax.swing.JTextField TextField_1;
    private javax.swing.JTextField TextField_2;
    private javax.swing.JTextField TextField_3;
    private javax.swing.JTextField TextField_4;
    private javax.swing.JTextField TextField_5;
    private javax.swing.JTextField TextField_6;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
