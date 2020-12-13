package dragonRestaurant.Model;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Deserts extends javax.swing.JFrame {
    public Deserts() {
        initComponents();
    }
//Generated Code is the View
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        DesertsComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        desertsSelectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DesertsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Deserts Menu:");

        DesertsComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DesertsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Cakes", "Donuts", "Ice Cream", "Muffins", "Sweets" }));
        DesertsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesertsComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Note: Highlight what you like then press button to order");

        desertsSelectButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        desertsSelectButton.setText("Take Selected Deserts");
        desertsSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desertsSelectButtonActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(DesertsComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(desertsSelectButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(DesertsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(desertsSelectButton)))
                .addGap(22, 22, 22))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesertsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desertsSelectButton))
                .addContainerGap())
        );

        DesertsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(DesertsTable);

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
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesertsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesertsComboBoxActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_deserts";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            String selectedItem=DesertsComboBox.getSelectedItem().toString();
            String dQuery;
            
            if(selectedItem.equals("Select...")){
                JOptionPane.showMessageDialog(null, "Please Select an Item!!");
            }
            if(selectedItem.equals("Cakes")){
                dQuery="Select * from cakes";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Donuts")){
                dQuery="Select * from donuts";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Ice Cream")){
                dQuery="Select * from ice_cream";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Muffins")){
                dQuery="Select * from muffins";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Sweets")){
                dQuery="Select * from sweets";
                PreparedStatement query=connect.prepareStatement(dQuery);
                ResultSet rs=query.executeQuery();
                DesertsTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
             
         }
         catch(HeadlessException | ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null, "Deserts Select Box Not Working!");
         } 
    }//GEN-LAST:event_DesertsComboBoxActionPerformed

    private void desertsSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desertsSelectButtonActionPerformed
        if(DesertsTable.getRowCount()!=0){
            int[] selected=DesertsTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]= DesertsTable.getValueAt(selected[count], 0);
                rows[1]=DesertsTable.getValueAt(selected[count], 2);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Deserts table is Empty!");
        }
    }//GEN-LAST:event_desertsSelectButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Deserts().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DesertsComboBox;
    private javax.swing.JTable DesertsTable;
    private javax.swing.JButton desertsSelectButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
