package dragonRestaurant.Model;

import dragonRestaurant.Controller.BiscuitsButton;
import dragonRestaurant.Controller.BreadsButton;
import dragonRestaurant.Controller.CheeseButton;
import dragonRestaurant.Controller.SaucesButton;
import dragonRestaurant.Controller.extrasSelectButton;

public class Extras extends javax.swing.JFrame {
    public Extras() {
        initComponents();
    }
//Generated Code is the View
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        BiscuitsButton = new javax.swing.JRadioButton();
        BreadsButton = new javax.swing.JRadioButton();
        CheeseButton = new javax.swing.JRadioButton();
        SaucesButton = new javax.swing.JRadioButton();
        extrasSelectButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ExtrasTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Extras Menu:");

        buttonGroup1.add(BiscuitsButton);
        BiscuitsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BiscuitsButton.setForeground(new java.awt.Color(255, 153, 0));
        BiscuitsButton.setText("Biscuits");
        BiscuitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiscuitsButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(BreadsButton);
        BreadsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BreadsButton.setForeground(new java.awt.Color(255, 204, 0));
        BreadsButton.setText("Breads");
        BreadsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreadsButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(CheeseButton);
        CheeseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheeseButton.setForeground(new java.awt.Color(255, 255, 0));
        CheeseButton.setText("Cheese");
        CheeseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheeseButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(SaucesButton);
        SaucesButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaucesButton.setForeground(new java.awt.Color(255, 51, 51));
        SaucesButton.setText("Sauces");
        SaucesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaucesButtonActionPerformed(evt);
            }
        });

        extrasSelectButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        extrasSelectButton.setText("Take Selected Extras");
        extrasSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrasSelectButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("NOTE: Highlight what you wish to take and press button to order");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BiscuitsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BreadsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CheeseButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SaucesButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(extrasSelectButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(BiscuitsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(BreadsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(CheeseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(SaucesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extrasSelectButton))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(extrasSelectButton)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BiscuitsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BreadsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheeseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaucesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ExtrasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ExtrasTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BiscuitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiscuitsButtonActionPerformed
        BiscuitsButton bb1 = new BiscuitsButton();
        bb1.actionPerformed();
    }//GEN-LAST:event_BiscuitsButtonActionPerformed

    private void BreadsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreadsButtonActionPerformed
        BreadsButton bb2 = new BreadsButton();
        bb2.actionPerformed();
    }//GEN-LAST:event_BreadsButtonActionPerformed

    private void CheeseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheeseButtonActionPerformed
        CheeseButton cb = new CheeseButton();
        cb.actionPerformed();
    }//GEN-LAST:event_CheeseButtonActionPerformed

    private void SaucesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaucesButtonActionPerformed
        SaucesButton sb = new SaucesButton();
        sb.actionPerformed();
    }//GEN-LAST:event_SaucesButtonActionPerformed

    private void extrasSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrasSelectButtonActionPerformed
        extrasSelectButton esb = new extrasSelectButton();
        esb.actionPerformed();
    }//GEN-LAST:event_extrasSelectButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Extras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton BiscuitsButton;
    public static javax.swing.JRadioButton BreadsButton;
    public static javax.swing.JRadioButton CheeseButton;
    public static javax.swing.JTable ExtrasTable;
    public static javax.swing.JRadioButton SaucesButton;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JButton extrasSelectButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
