package Package01;

public class OpeningFrame extends javax.swing.JFrame {

    public OpeningFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoadingIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 51), new java.awt.Color(0, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/clock.gif"))); // NOI18N
        jPanel1.add(LoadingIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new OpeningFrame().setVisible(true);
            }
        });
        OpeningFrame object_1 = new OpeningFrame();
        object_1.setVisible(true);
        try
        {
            for(int i=1; i<=50; i++)
            {
                Thread.sleep(50);
                HomePage object_2 = new HomePage();
                if(i == 50)
                {
                    object_1.dispose();
                    object_2.show();
                }
            }
        }
        catch(Exception e)
        {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadingIcon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
