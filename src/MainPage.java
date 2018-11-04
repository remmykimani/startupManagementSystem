
import java.sql.ResultSet;
import javax.swing.*;

public class MainPage extends javax.swing.JFrame {

   
    
    public MainPage() {
        initComponents();
         executeFunctions();
    }

    public void executeFunctions()
    {
        admRadioAuthGroup();
        fillcomboxStartupID();
    }
    public void admRadioAuthGroup()
    {
        ButtonGroup arg =new ButtonGroup();
        arg.add(radioUser);
        arg.add(radioAdmin);
        
    }
    public void initializeManageUsers()
    {
        txtManageUserName.setText("");
        
        
    }
    public void fillcomboxStartupID()
    {
         try
        {
            
            QueryProcess qry1=new QueryProcess();
            ResultSet rs;
            rs=qry1.exQuery("SELECT * FROM `startup`");
            while(rs.next())
            {
                comboxStartupID.addItem(Integer.toString(rs.getInt("Startup_ID")));
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "QUERY ERROR in filling comboxStartupID "+e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioAuth = new javax.swing.ButtonGroup();
        menuPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        functionTab = new javax.swing.JTabbedPane();
        admManageUsers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtManageUserName = new javax.swing.JTextField();
        comboxStartupID = new javax.swing.JComboBox<>();
        txtManageUserPass = new javax.swing.JPasswordField();
        radioAdmin = new javax.swing.JRadioButton();
        radioUser = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnManageUsersNew = new javax.swing.JButton();
        btnManageUsersUpdate = new javax.swing.JButton();
        btnManageUsersSubmit = new javax.swing.JButton();
        btnManageUsersDelete = new javax.swing.JButton();
        userManageStartup = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblManageStartupID = new javax.swing.JLabel();
        txtManageStartupName = new javax.swing.JTextField();
        txtManageFounder = new javax.swing.JTextField();
        dateChooserJoinDate = new com.toedter.calendar.JDateChooser();
        comboxStartupManageDomain = new javax.swing.JComboBox<>();
        txtManageStartupContact = new javax.swing.JTextField();
        txtManageStartupEmail = new javax.swing.JTextField();
        txtManageStartupTel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStartupManage = new javax.swing.JTable();
        btnManageStartupDelete = new javax.swing.JButton();
        btnManageStartupNew = new javax.swing.JButton();
        btnManageStartupUpdate = new javax.swing.JButton();
        btnManageStartupSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setName("mainFrame"); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(menuPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(infoPanel, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("USER ID:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NAME:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("STARTUP ID :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("AUTH:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("N/A");

        txtManageUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManageUserNameActionPerformed(evt);
            }
        });

        radioAdmin.setText("ADMIN");

        radioUser.setText("USER");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER ID", "NAME", "STARTUP", "AUTHORITY"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnManageUsersNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageUsersNew.setText("NEW");
        btnManageUsersNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersNewActionPerformed(evt);
            }
        });

        btnManageUsersUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageUsersUpdate.setText("UPDATE");

        btnManageUsersSubmit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageUsersSubmit.setForeground(new java.awt.Color(51, 153, 0));
        btnManageUsersSubmit.setText("SUBMIT");

        btnManageUsersDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageUsersDelete.setForeground(new java.awt.Color(255, 0, 51));
        btnManageUsersDelete.setText("DELETE");

        javax.swing.GroupLayout admManageUsersLayout = new javax.swing.GroupLayout(admManageUsers);
        admManageUsers.setLayout(admManageUsersLayout);
        admManageUsersLayout.setHorizontalGroup(
            admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admManageUsersLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboxStartupID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtManageUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtManageUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(radioAdmin)
                    .addComponent(radioUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(admManageUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageUsersDelete)
                .addGap(10, 10, 10)
                .addComponent(btnManageUsersNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageUsersUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageUsersSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        admManageUsersLayout.setVerticalGroup(
            admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admManageUsersLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(admManageUsersLayout.createSequentialGroup()
                        .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(admManageUsersLayout.createSequentialGroup()
                                .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGap(52, 52, 52)
                                .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtManageUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(comboxStartupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4))
                            .addComponent(txtManageUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(radioAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(admManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageUsersNew)
                    .addComponent(btnManageUsersUpdate)
                    .addComponent(btnManageUsersSubmit)
                    .addComponent(btnManageUsersDelete))
                .addGap(37, 37, 37))
        );

        functionTab.addTab("Manage User", admManageUsers);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("STARTUP ID:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("STARTUP NAME:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("FOUNDER:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("JOIN  DATE");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("DOMAIN:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("CONTACT PERSON:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("EMAIL ADDRESS:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("TEL.NO:");

        lblManageStartupID.setText("N/A");

        tblStartupManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "FOUNDER", "JOIN DATE", "DOMAIN", "CONTACT", "EMAIL", "TEL.NO"
            }
        ));
        jScrollPane2.setViewportView(tblStartupManage);

        btnManageStartupDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageStartupDelete.setForeground(new java.awt.Color(255, 0, 51));
        btnManageStartupDelete.setText("DELETE");

        btnManageStartupNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageStartupNew.setText("NEW");
        btnManageStartupNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStartupNewActionPerformed(evt);
            }
        });

        btnManageStartupUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageStartupUpdate.setText("UPDATE");
        btnManageStartupUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStartupUpdateActionPerformed(evt);
            }
        });

        btnManageStartupSubmit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnManageStartupSubmit.setForeground(new java.awt.Color(51, 153, 0));
        btnManageStartupSubmit.setText("SUBMIT");

        javax.swing.GroupLayout userManageStartupLayout = new javax.swing.GroupLayout(userManageStartup);
        userManageStartup.setLayout(userManageStartupLayout);
        userManageStartupLayout.setHorizontalGroup(
            userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManageStartupLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(userManageStartupLayout.createSequentialGroup()
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManageFounder)
                            .addComponent(txtManageStartupName)
                            .addComponent(lblManageStartupID, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManageStartupContact)
                            .addComponent(txtManageStartupEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtManageStartupTel)))
                    .addGroup(userManageStartupLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChooserJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(comboxStartupManageDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnManageStartupNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageStartupDelete, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(44, 44, 44)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageStartupUpdate)
                            .addComponent(btnManageStartupSubmit))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        userManageStartupLayout.setVerticalGroup(
            userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManageStartupLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userManageStartupLayout.createSequentialGroup()
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userManageStartupLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtManageStartupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtManageStartupEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(userManageStartupLayout.createSequentialGroup()
                                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtManageStartupContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblManageStartupID))
                                .addGap(172, 172, 172)
                                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel9)
                                    .addComponent(txtManageFounder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManageStartupTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(80, 80, 80)
                        .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(userManageStartupLayout.createSequentialGroup()
                                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateChooserJoinDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(comboxStartupManageDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(userManageStartupLayout.createSequentialGroup()
                                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnManageStartupDelete)
                                    .addComponent(btnManageStartupUpdate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(userManageStartupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnManageStartupNew)
                                    .addComponent(btnManageStartupSubmit))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        functionTab.addTab("Manage Startup", userManageStartup);

        getContentPane().add(functionTab, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtManageUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManageUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManageUserNameActionPerformed

    private void btnManageUsersNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageUsersNewActionPerformed

    private void btnManageStartupNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStartupNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageStartupNewActionPerformed

    private void btnManageStartupUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStartupUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageStartupUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admManageUsers;
    private javax.swing.JButton btnManageStartupDelete;
    private javax.swing.JButton btnManageStartupNew;
    private javax.swing.JButton btnManageStartupSubmit;
    private javax.swing.JButton btnManageStartupUpdate;
    private javax.swing.JButton btnManageUsersDelete;
    private javax.swing.JButton btnManageUsersNew;
    private javax.swing.JButton btnManageUsersSubmit;
    private javax.swing.JButton btnManageUsersUpdate;
    private javax.swing.JComboBox<String> comboxStartupID;
    private javax.swing.JComboBox<String> comboxStartupManageDomain;
    private com.toedter.calendar.JDateChooser dateChooserJoinDate;
    private javax.swing.JTabbedPane functionTab;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblManageStartupID;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.ButtonGroup radioAuth;
    private javax.swing.JRadioButton radioUser;
    private javax.swing.JTable tblStartupManage;
    private javax.swing.JTextField txtManageFounder;
    private javax.swing.JTextField txtManageStartupContact;
    private javax.swing.JTextField txtManageStartupEmail;
    private javax.swing.JTextField txtManageStartupName;
    private javax.swing.JTextField txtManageStartupTel;
    private javax.swing.JTextField txtManageUserName;
    private javax.swing.JPasswordField txtManageUserPass;
    private javax.swing.JPanel userManageStartup;
    // End of variables declaration//GEN-END:variables
}
