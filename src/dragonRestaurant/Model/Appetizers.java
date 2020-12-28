package dragonRestaurant.Model;

import dragonRestaurant.Controller.FastFoodsButton;
import dragonRestaurant.Controller.appetizersSelectButton;
import dragonRestaurant.Controller.SoupsButton;

public class Appetizers extends javax.swing.JFrame {
    public Appetizers() {
        initComponents();
    }
    
//Generated Code is the View    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        FastFoodsButton = new javax.swing.JButton();
        SoupsButton = new javax.swing.JButton();
        appetizersSelectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppetizersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Appetizers Menu");
        jLabel1.setToolTipText("");

        FastFoodsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FastFoodsButton.setText("Fast Foods");
        FastFoodsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastFoodsButtonActionPerformed(evt);
            }
        });

        SoupsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SoupsButton.setText("Soups");
        SoupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoupsButtonActionPerformed(evt);
            }
        });

        appetizersSelectButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        appetizersSelectButton.setText("Take Selected Appetizers");
        appetizersSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appetizersSelectButtonActionPerformed(evt);
            }
        });

        AppetizersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(AppetizersTable);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(FastFoodsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SoupsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(appetizersSelectButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FastFoodsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SoupsButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(appetizersSelectButton))
                    .addComponent(jLabel1))
                .addGap(23, 23, 23))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appetizersSelectButton)
                .addGap(11, 11, 11)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoupsButton)
                    .addComponent(FastFoodsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appetizersSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appetizersSelectButtonActionPerformed
        appetizersSelectButton asb = new appetizersSelectButton();
        asb.actionPerformed();
    }//GEN-LAST:event_appetizersSelectButtonActionPerformed

    private void FastFoodsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastFoodsButtonActionPerformed
          FastFoodsButton ffb = new FastFoodsButton();
          ffb.actionPerformed();
    }//GEN-LAST:event_FastFoodsButtonActionPerformed

    private void SoupsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoupsButtonActionPerformed
        SoupsButton sb = new SoupsButton();
        sb.actionPerformed();
    }//GEN-LAST:event_SoupsButtonActionPerformed
  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appetizers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Appetizers().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable AppetizersTable;
    private javax.swing.JButton FastFoodsButton;
    private javax.swing.JButton SoupsButton;
    private javax.swing.JButton appetizersSelectButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
