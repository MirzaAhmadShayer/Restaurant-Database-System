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

public class MainCourses extends javax.swing.JFrame {
    public MainCourses() {
        initComponents();
    }
//Generated Code is the View
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        MainCoursesComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        mainCoursesSelectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainCoursesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Main Courses Menu:");

        MainCoursesComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MainCoursesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Beef", "Chicken", "Egg", "Fish", "Rice", "Vegetable" }));
        MainCoursesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainCoursesComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Note: Highlight what you like then press button to order");

        mainCoursesSelectButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainCoursesSelectButton.setText("Take Selected Main Courses");
        mainCoursesSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainCoursesSelectButtonActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(MainCoursesComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mainCoursesSelectButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(MainCoursesComboBox, 0, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mainCoursesSelectButton)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainCoursesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainCoursesSelectButton))
                .addContainerGap())
        );

        MainCoursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(MainCoursesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainCoursesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainCoursesComboBoxActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1/dr_maincourses";
            String user="root";
            String password="";
            Connection connect=(Connection)DriverManager.getConnection(url, user, password);
            
            String selectedItem=MainCoursesComboBox.getSelectedItem().toString();
            String mcQuery;
            
            if(selectedItem.equals("Select...")){
                JOptionPane.showMessageDialog(null, "Please Select an Item!!");
            }
            if(selectedItem.equals("Beef")){
                mcQuery="Select * from beef";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Chicken")){
                mcQuery="Select * from chicken";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Egg")){
                mcQuery="Select * from egg";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Fish")){
                mcQuery="Select * from fish";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Rice")){
                mcQuery="Select * from rice";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            if(selectedItem.equals("Vegetable")){
                mcQuery="Select * from vegetable";
                PreparedStatement query=connect.prepareStatement(mcQuery);
                ResultSet rs=query.executeQuery();
                MainCoursesTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
             
         }
         catch(HeadlessException | ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null, "Main Courses Select Box Not Working!");
         } 
    }//GEN-LAST:event_MainCoursesComboBoxActionPerformed

    private void mainCoursesSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainCoursesSelectButtonActionPerformed
        if(MainCoursesTable.getRowCount()!=0){
            int[] selected=MainCoursesTable.getSelectedRows();
            Object[] headers=new Object[]{"Dish Name","Price(Tk)"};
            Object[] rows=new Object[2];
            DefaultTableModel tmb=(DefaultTableModel) MainGUI.OrdersTable.getModel();
            tmb.setColumnIdentifiers(headers);
            for(int count=0;count<selected.length;count++){
                rows[0]= MainCoursesTable.getValueAt(selected[count], 0);
                rows[1]=MainCoursesTable.getValueAt(selected[count], 1);
                tmb.addRow(rows);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The Main Courses table is Empty!");
        }
    }//GEN-LAST:event_mainCoursesSelectButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainCourses().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MainCoursesComboBox;
    private javax.swing.JTable MainCoursesTable;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainCoursesSelectButton;
    // End of variables declaration//GEN-END:variables
}
