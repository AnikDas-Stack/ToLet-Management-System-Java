package Package01;

public class ToLet extends javax.swing.JFrame {

    public ToLet() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        PanelHouse = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SelectPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelShop = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        PanelCar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        PanelBachelor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("tolet?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        familyQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Family f");
        familyList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : familyQuery1.getResultList();
        car_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Car_1 c");
        car_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : car_1Query.getResultList();
        shop_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Shop_1 s");
        shop_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : shop_1Query.getResultList();
        bachelorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bachelor b");
        bachelorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bachelorQuery.getResultList();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        HomeLogo = new javax.swing.JLabel();
        HomeVariable = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        Backward = new javax.swing.JLabel();
        Forward = new javax.swing.JLabel();
        LabelFamily = new javax.swing.JLabel();
        LabelBachelor = new javax.swing.JLabel();
        LabelCar = new javax.swing.JLabel();
        LabelShop = new javax.swing.JLabel();
        PanelFirst = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        PanelHouse.setBackground(new java.awt.Color(0, 153, 153));
        PanelHouse.setPreferredSize(new java.awt.Dimension(650, 440));
        PanelHouse.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Family");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 284, 0, 0);
        PanelHouse.add(jLabel7, gridBagConstraints);

        jTable1.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, familyList1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numberOfFlat}"));
        columnBinding.setColumnName("Number Of Flat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numberOfRoom}"));
        columnBinding.setColumnName("Number Of Room");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${location}"));
        columnBinding.setColumnName("Location");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${availableFrom}"));
        columnBinding.setColumnName("Available From");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rent}"));
        columnBinding.setColumnName("Rent");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 623;
        gridBagConstraints.ipady = 359;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 1, 0);
        PanelHouse.add(jScrollPane1, gridBagConstraints);

        SelectPanel.setBackground(new java.awt.Color(255, 255, 255));
        SelectPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        SelectPanel.setPreferredSize(new java.awt.Dimension(650, 440));
        SelectPanel.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Select First...!!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(189, 237, 216, 232);
        SelectPanel.add(jLabel5, gridBagConstraints);

        PanelShop.setBackground(new java.awt.Color(0, 153, 153));
        PanelShop.setPreferredSize(new java.awt.Dimension(650, 440));
        PanelShop.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Shops");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 283, 0, 0);
        PanelShop.add(jLabel4, gridBagConstraints);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, shop_1List, jTable3);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${shopType}"));
        columnBinding.setColumnName("Shop Type");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${shopSize}"));
        columnBinding.setColumnName("Shop Size");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${location}"));
        columnBinding.setColumnName("Location");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rentPerMonth}"));
        columnBinding.setColumnName("Rent Per Month");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(jTable3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 627;
        gridBagConstraints.ipady = 354;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        PanelShop.add(jScrollPane4, gridBagConstraints);

        PanelCar.setBackground(new java.awt.Color(0, 153, 153));
        PanelCar.setPreferredSize(new java.awt.Dimension(650, 440));
        PanelCar.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Cars");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 292, 0, 0);
        PanelCar.add(jLabel3, gridBagConstraints);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, car_1List, jTable4);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${companyName}"));
        columnBinding.setColumnName("Company Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ownerName}"));
        columnBinding.setColumnName("Owner Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${officeAddress}"));
        columnBinding.setColumnName("Office Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${website}"));
        columnBinding.setColumnName("Website");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTable4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 623;
        gridBagConstraints.ipady = 354;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        PanelCar.add(jScrollPane3, gridBagConstraints);

        PanelBachelor.setBackground(new java.awt.Color(0, 153, 153));
        PanelBachelor.setPreferredSize(new java.awt.Dimension(650, 440));
        PanelBachelor.setLayout(new java.awt.GridBagLayout());

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bachelorList, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numberOfSeat}"));
        columnBinding.setColumnName("Number Of Seat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${occupation}"));
        columnBinding.setColumnName("Occupation");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${location}"));
        columnBinding.setColumnName("Location");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${availableFrom}"));
        columnBinding.setColumnName("Available From");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rent}"));
        columnBinding.setColumnName("Rent");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 623;
        gridBagConstraints.ipady = 354;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        PanelBachelor.add(jScrollPane2, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Bachelor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 267, 0, 0);
        PanelBachelor.add(jLabel2, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 62, 0, 0);
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
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 34, 0, 34);
        jPanel1.add(HomeVariable, gridBagConstraints);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-cancel-filled-50.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 61, 0, 0);
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
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 68, 43, 0);
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
        gridBagConstraints.insets = new java.awt.Insets(13, 42, 0, 0);
        jPanel1.add(Backward, gridBagConstraints);

        Forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-right-32.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 26, 0, 0);
        jPanel1.add(Forward, gridBagConstraints);

        LabelFamily.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LabelFamily.setForeground(new java.awt.Color(255, 255, 255));
        LabelFamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-family-50.png"))); // NOI18N
        LabelFamily.setText("Family");
        LabelFamily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelFamilyMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 34, 0, 0);
        jPanel1.add(LabelFamily, gridBagConstraints);

        LabelBachelor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LabelBachelor.setForeground(new java.awt.Color(255, 255, 255));
        LabelBachelor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-user-40.png"))); // NOI18N
        LabelBachelor.setText("Bechelor");
        LabelBachelor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBachelorMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 34, 0, 0);
        jPanel1.add(LabelBachelor, gridBagConstraints);

        LabelCar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LabelCar.setForeground(new java.awt.Color(255, 255, 255));
        LabelCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-car-48.png"))); // NOI18N
        LabelCar.setText("Car");
        LabelCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 34, 0, 0);
        jPanel1.add(LabelCar, gridBagConstraints);

        LabelShop.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LabelShop.setForeground(new java.awt.Color(255, 255, 255));
        LabelShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package01/icons8-shop-48.png"))); // NOI18N
        LabelShop.setText("Shop");
        LabelShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelShopMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 34, 0, 0);
        jPanel1.add(LabelShop, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel1, gridBagConstraints);

        PanelFirst.setBackground(new java.awt.Color(255, 255, 255));
        PanelFirst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        PanelFirst.setPreferredSize(new java.awt.Dimension(650, 440));
        PanelFirst.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setText("Select First...!!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(185, 221, 218, 213);
        PanelFirst.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 12, 0, 12);
        jPanel2.add(PanelFirst, gridBagConstraints);

        getContentPane().add(jPanel2, new java.awt.GridBagConstraints());

        bindingGroup.bind();

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

    private void LabelFamilyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelFamilyMouseClicked
        PanelFirst.removeAll();
        PanelFirst.repaint();
        PanelFirst.revalidate();
        
        PanelFirst.add(PanelHouse);
        PanelFirst.repaint();
        PanelFirst.revalidate();
        
    }//GEN-LAST:event_LabelFamilyMouseClicked

    private void LabelBachelorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBachelorMouseClicked
        PanelFirst.removeAll();
        PanelFirst.repaint();
        PanelFirst.revalidate();
        
        PanelFirst.add(PanelBachelor);
        PanelFirst.repaint();
        PanelFirst.revalidate();
    }//GEN-LAST:event_LabelBachelorMouseClicked

    private void LabelCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCarMouseClicked
        PanelFirst.removeAll();
        PanelFirst.repaint();
        PanelFirst.revalidate();
        
        PanelFirst.add(PanelCar);
        PanelFirst.repaint();
        PanelFirst.revalidate();
    }//GEN-LAST:event_LabelCarMouseClicked

    private void LabelShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelShopMouseClicked
        PanelFirst.removeAll();
        PanelFirst.repaint();
        PanelFirst.revalidate();
        
        PanelFirst.add(PanelShop);
        PanelFirst.repaint();
        PanelFirst.revalidate();
    }//GEN-LAST:event_LabelShopMouseClicked

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToLet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backward;
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel Forward;
    private javax.swing.JLabel HomeLogo;
    private javax.swing.JLabel HomeVariable;
    private javax.swing.JLabel LabelBachelor;
    private javax.swing.JLabel LabelCar;
    private javax.swing.JLabel LabelFamily;
    private javax.swing.JLabel LabelShop;
    private javax.swing.JPanel PanelBachelor;
    private javax.swing.JPanel PanelCar;
    public javax.swing.JPanel PanelFirst;
    private javax.swing.JPanel PanelHouse;
    private javax.swing.JPanel PanelShop;
    private javax.swing.JPanel SelectPanel;
    private java.util.List<Package01.Bachelor> bachelorList;
    private javax.persistence.Query bachelorQuery;
    private java.util.List<Package01.Car_1> car_1List;
    private javax.persistence.Query car_1Query;
    private javax.swing.JLabel close;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<Package01.Family> familyList1;
    private javax.persistence.Query familyQuery1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private java.util.List<Package01.Shop_1> shop_1List;
    private javax.persistence.Query shop_1Query;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
