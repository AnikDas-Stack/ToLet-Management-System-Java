package Package01;

public class Create extends javax.swing.JFrame {

    public Create() {
        initComponents();
    }
public String identity;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        AshPanel = new javax.swing.JPanel();
        HomeLogo = new javax.swing.JLabel();
        HomeVariable = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        OK = new javax.swing.JButton();
        Backward = new javax.swing.JLabel();
        Forward = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        GreenPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AshPanel.setBackground(new java.awt.Color(102, 102, 102));
        AshPanel.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.insets = new java.awt.Insets(31, 70, 0, 0);
        AshPanel.add(HomeLogo, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 40, 0, 0);
        AshPanel.add(HomeVariable, gridBagConstraints);

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House Rent", "Car Rent", "Shop Rent" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(78, 30, 0, 20);
        AshPanel.add(ComboBox1, gridBagConstraints);

        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/button_ok (1).png"))); // NOI18N
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -31;
        gridBagConstraints.ipady = -11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 66, 0, 0);
        AshPanel.add(OK, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(13, 52, 0, 0);
        AshPanel.add(Backward, gridBagConstraints);

        Forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-right-32.png"))); // NOI18N
        Forward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForwardMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 0, 0);
        AshPanel.add(Forward, gridBagConstraints);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-cancel-filled-50.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(114, 69, 0, 0);
        AshPanel.add(close, gridBagConstraints);

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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 76, 35, 0);
        AshPanel.add(EXIT, gridBagConstraints);

        getContentPane().add(AshPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        GreenPanel.setBackground(new java.awt.Color(0, 153, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("At first, You have to select...!!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        javax.swing.GroupLayout GreenPanelLayout = new javax.swing.GroupLayout(GreenPanel);
        GreenPanel.setLayout(GreenPanelLayout);
        GreenPanelLayout.setHorizontalGroup(
            GreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GreenPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        GreenPanelLayout.setVerticalGroup(
            GreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GreenPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(GreenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 670, 500));

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

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
       if(ComboBox1.getSelectedItem().equals("House Rent"))
       {
           House house = new House();
           house.setVisible(true);
       }
       else if(ComboBox1.getSelectedItem().equals("Car Rent"))
       {
           Car car = new Car();
           car.setVisible(true);
       }
       else if(ComboBox1.getSelectedItem().equals("Shop Rent"))
       {
           Shop shop = new Shop();
           shop.setVisible(true);
       }
    }//GEN-LAST:event_OKMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked

        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void BackwardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackwardMouseClicked

        this.hide();
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_BackwardMouseClicked

    private void ForwardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForwardMouseClicked

        if(identity == "House")
        {
            this.hide();
            House house = new House();
            house.setVisible(true);
        }
        if(identity == "Car")
        {
            this.hide();
            Car car = new Car();
            car.setVisible(true);
        }
        if(identity == "Shop")
        {
            this.hide();
            Shop shop = new Shop();
            shop.setVisible(true);
        }
    }//GEN-LAST:event_ForwardMouseClicked

    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AshPanel;
    private javax.swing.JLabel Backward;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel Forward;
    private javax.swing.JPanel GreenPanel;
    private javax.swing.JLabel HomeLogo;
    private javax.swing.JLabel HomeVariable;
    private javax.swing.JButton OK;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
