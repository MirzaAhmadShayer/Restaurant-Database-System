package dragonRestaurant.Model;

import dragonRestaurant.Controller.*;
import javax.swing.JFrame;

public class MainGUI extends javax.swing.JFrame {
    public MainGUI() {
        initComponents();
    }
//Generated Code is the View
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel16 = new javax.swing.JLabel();
        BeveragesButton = new javax.swing.JButton();
        DesertsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ExtrasButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MainCoursesButton = new javax.swing.JButton();
        TotalPriceLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SpecialsButton = new javax.swing.JButton();
        OrderNowButton = new javax.swing.JButton();
        ResetFullOrderButton = new javax.swing.JButton();
        DeleteOneItemButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrdersTable = new javax.swing.JTable();
        AppetizersButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ContactInfoButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DiscountsButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        YourInfoButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        HomeDeliveryButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        BeveragesButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BeveragesButton.setText("Select Beverages");
        BeveragesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeveragesButtonActionPerformed(evt);
            }
        });

        DesertsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DesertsButton.setText("Select Deserts");
        DesertsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesertsButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Your Orders & Price Show Here:");

        ExtrasButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExtrasButton.setText("Select Extras");
        ExtrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtrasButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Total Price(Tk):");

        MainCoursesButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MainCoursesButton.setText("Select Main Courses");
        MainCoursesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainCoursesButtonActionPerformed(evt);
            }
        });

        TotalPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TotalPriceLabel.setForeground(new java.awt.Color(255, 102, 0));
        TotalPriceLabel.setText("Nothing Ordered!");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Appatizers:");

        SpecialsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpecialsButton.setText("Select Specials");
        SpecialsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialsButtonActionPerformed(evt);
            }
        });

        OrderNowButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OrderNowButton.setText("Order Now");
        OrderNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderNowButtonActionPerformed(evt);
            }
        });

        ResetFullOrderButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ResetFullOrderButton.setText("RESET FULL TABLE");
        ResetFullOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetFullOrderButtonActionPerformed(evt);
            }
        });

        DeleteOneItemButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DeleteOneItemButton.setText("DELETE ONE ITEM");
        DeleteOneItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOneItemButtonActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Main Courses:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("NOTE: Highlight the order you wish to delete");

        OrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(OrdersTable);

        AppetizersButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AppetizersButton.setText("Select Appetizers");
        AppetizersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppetizersButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("Deserts:");

        ContactInfoButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ContactInfoButton.setText("Contact Info");
        ContactInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactInfoButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Beverages:");

        DiscountsButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DiscountsButton.setText("Discounts");
        DiscountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountsButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Select Your Food Here:");

        YourInfoButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YourInfoButton.setText("Your Info");
        YourInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YourInfoButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Extras:");

        HomeDeliveryButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HomeDeliveryButton.setText("Home Delivery");
        HomeDeliveryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeDeliveryButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Specials:");

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\BRACU\\CSE470\\MVC Structure\\Dragon Restaurant\\src\\dragonRestaurant\\View\\DR.jpg")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\BRACU\\CSE470\\MVC Structure\\Dragon Restaurant\\src\\dragonRestaurant\\View\\Dragon stylized word.jpg")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("F:\\BRACU\\CSE470\\MVC Structure\\Dragon Restaurant\\src\\dragonRestaurant\\View\\coolest-restaurant-logos-thumbnail.png")); // NOI18N

        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BeveragesButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(DesertsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ExtrasButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(MainCoursesButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TotalPriceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SpecialsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(OrderNowButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ResetFullOrderButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(DeleteOneItemButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(AppetizersButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ExitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ContactInfoButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(DiscountsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(YourInfoButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(HomeDeliveryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(ContactInfoButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(HomeDeliveryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OrderNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AppetizersButton)
                            .addComponent(ExtrasButton)
                            .addComponent(MainCoursesButton)
                            .addComponent(DesertsButton)
                            .addComponent(BeveragesButton)
                            .addComponent(SpecialsButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(TotalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiscountsButton)
                                    .addComponent(YourInfoButton)
                                    .addComponent(ResetFullOrderButton)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteOneItemButton)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(ExitButton)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ContactInfoButton)
                        .addGap(55, 55, 55)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(AppetizersButton))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(BeveragesButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DesertsButton))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExtrasButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(MainCoursesButton))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(SpecialsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OrderNowButton)
                            .addComponent(HomeDeliveryButton))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotalPriceLabel)
                                .addGap(27, 27, 27)
                                .addComponent(DiscountsButton)
                                .addGap(18, 18, 18)
                                .addComponent(YourInfoButton)
                                .addGap(18, 18, 18)
                                .addComponent(ResetFullOrderButton)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteOneItemButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExitButton)
                                .addGap(21, 21, 21))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BeveragesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeveragesButtonActionPerformed
        Beverages beveragesMenu = new Beverages();
        beveragesMenu.setVisible(true);
        beveragesMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BeveragesButtonActionPerformed

    private void DesertsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesertsButtonActionPerformed
        Deserts desertsMenu = new Deserts();
        desertsMenu.setVisible(true);
        desertsMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_DesertsButtonActionPerformed

    private void ExtrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtrasButtonActionPerformed
        Extras extrasMenu = new Extras();
        extrasMenu.setVisible(true);
        extrasMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ExtrasButtonActionPerformed

    private void MainCoursesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainCoursesButtonActionPerformed
        MainCourses mainCoursesMenu = new MainCourses();
        mainCoursesMenu.setVisible(true);
        mainCoursesMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_MainCoursesButtonActionPerformed

    private void SpecialsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialsButtonActionPerformed
        Specials specialsMenu = new Specials();
        specialsMenu.setVisible(true);
        specialsMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_SpecialsButtonActionPerformed

    private void OrderNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderNowButtonActionPerformed
        OrderNowButton onb = new OrderNowButton();
        onb.actionPerformed();
    }//GEN-LAST:event_OrderNowButtonActionPerformed

    private void ResetFullOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetFullOrderButtonActionPerformed
        ResetFullOrderButton r = new ResetFullOrderButton();
        r.actionPerformed();
    }//GEN-LAST:event_ResetFullOrderButtonActionPerformed

    private void DeleteOneItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOneItemButtonActionPerformed
        DeleteOneItemButton d= new DeleteOneItemButton();
        d.actionPerformed();
    }//GEN-LAST:event_DeleteOneItemButtonActionPerformed

    private void AppetizersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppetizersButtonActionPerformed
        Appetizers appetizersMenu = new Appetizers();
        appetizersMenu.setVisible(true);
        appetizersMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_AppetizersButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        ExitButton e = new ExitButton();
        e.actionPerformed();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ContactInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactInfoButtonActionPerformed
        ContactInfoButton c = new ContactInfoButton();
        c.ActionPerformed();
    }//GEN-LAST:event_ContactInfoButtonActionPerformed

    private void DiscountsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountsButtonActionPerformed
        DiscountsButton db = new DiscountsButton();
        db.actionPerformed();
    }//GEN-LAST:event_DiscountsButtonActionPerformed

    private void YourInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YourInfoButtonActionPerformed
        YourInfoButton yib = new YourInfoButton();
        yib.actionPerformed();
    }//GEN-LAST:event_YourInfoButtonActionPerformed

    private void HomeDeliveryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeDeliveryButtonActionPerformed
        HomeDeliveryButton hdb = new HomeDeliveryButton();
        hdb.actionPerformed();
    }//GEN-LAST:event_HomeDeliveryButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppetizersButton;
    private javax.swing.JButton BeveragesButton;
    private javax.swing.JButton ContactInfoButton;
    private javax.swing.JButton DeleteOneItemButton;
    private javax.swing.JButton DesertsButton;
    private javax.swing.JButton DiscountsButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ExtrasButton;
    private javax.swing.JButton HomeDeliveryButton;
    private javax.swing.JButton MainCoursesButton;
    private javax.swing.JButton OrderNowButton;
    public static javax.swing.JTable OrdersTable;
    private javax.swing.JButton ResetFullOrderButton;
    private javax.swing.JButton SpecialsButton;
    public static javax.swing.JLabel TotalPriceLabel;
    private javax.swing.JButton YourInfoButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
