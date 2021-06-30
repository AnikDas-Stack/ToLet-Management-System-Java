package Package01;

import java.awt.PopupMenu;

public class HomePage extends javax.swing.JFrame {

    private PopupMenu SelectPanel;
    private PopupMenu PanelFirst;

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tolet_Icon = new javax.swing.JLabel();
        TO_LET_Option = new javax.swing.JLabel();
        create = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        LEBEL2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Welcome...!!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(140, 200, 216, 188);
        jPanel3.add(jLabel2, gridBagConstraints);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 610, 400));

        jLabel1.setFont(new java.awt.Font("Curlz MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TO-LET");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 670, 500));

        Tolet_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/T.png"))); // NOI18N
        Tolet_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tolet_IconMouseClicked(evt);
            }
        });
        jPanel1.add(Tolet_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        TO_LET_Option.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TO_LET_Option.setForeground(new java.awt.Color(255, 255, 255));
        TO_LET_Option.setText("TO-LET");
        TO_LET_Option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TO_LET_Option_OptionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TO_LET_Option_OptionMouseExited(evt);
            }
        });
        jPanel1.add(TO_LET_Option, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 70, 20));

        create.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("CREATE");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setText("EXIT");
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });
        jPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 400, 50, -1));

        LEBEL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-create-filled-50.png"))); // NOI18N
        LEBEL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LEBEL2MouseClicked(evt);
            }
        });
        jPanel1.add(LEBEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-cancel-filled-50.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 860, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TO_LET_Option_OptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TO_LET_Option_OptionMouseClicked
        ToLet tolet = new ToLet();
        tolet.setVisible(true);
    }//GEN-LAST:event_TO_LET_Option_OptionMouseClicked

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        Create create = new Create();
        create.setVisible(true);
    }//GEN-LAST:event_createMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
     
        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void TO_LET_Option_OptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TO_LET_Option_OptionMouseExited
       
    }//GEN-LAST:event_TO_LET_Option_OptionMouseExited

    private void Tolet_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tolet_IconMouseClicked
        ToLet tolet = new ToLet();
        tolet.setVisible(true);
        tolet.add(PanelFirst);
        
    }//GEN-LAST:event_Tolet_IconMouseClicked

    private void LEBEL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEBEL2MouseClicked
        // TODO add your handling code here:
        Create create = new Create();
        create.setVisible(true);
    }//GEN-LAST:event_LEBEL2MouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel LEBEL2;
    private javax.swing.JLabel TO_LET_Option;
    private javax.swing.JLabel Tolet_Icon;
    private javax.swing.JLabel close;
    private javax.swing.JLabel create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
