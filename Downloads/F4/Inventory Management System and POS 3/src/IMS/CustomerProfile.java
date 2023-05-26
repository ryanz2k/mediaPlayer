package IMS;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raidi
 * 
 */
public class CustomerProfile extends javax.swing.JFrame {
    public CustomerProfile() {
        initComponents();
    }
    
    private String username;
    private String abalance;
    private String statmember;
    
    public String getusername(){
        return this.username;
    }
    public void setusername(String username){
        this.username = username;
        profileusername.setText(username);
    }
    
    public String getabalance(){
        return this.abalance;
    }
    public void setabalance(String abalance){
        this.abalance = abalance;
        profilemoney.setText(abalance);
    }
    
    public String getstatmember(){
        return this.statmember;
    }
    public void setstatmember(String statmember){
        this.statmember = statmember;
        membership.setText(statmember);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        orderproduct = new javax.swing.JButton();
        usernamepresent = new javax.swing.JLabel();
        checkorders = new javax.swing.JButton();
        profileusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        profilemoney = new javax.swing.JTextField();
        editprofile = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        getfullname = new javax.swing.JTextField();
        editedpassword = new javax.swing.JPasswordField();
        editedusername = new javax.swing.JTextField();
        editedCardCN = new javax.swing.JTextField();
        editedCardCP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        membership = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        orderproduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        orderproduct.setText("Order Now!");
        orderproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderproductActionPerformed(evt);
            }
        });

        usernamepresent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernamepresent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamepresent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LiquorPics/userprofilepicture.jpg"))); // NOI18N
        usernamepresent.setToolTipText("");
        usernamepresent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usernamepresent.setMinimumSize(new java.awt.Dimension(268, 225));
        usernamepresent.setPreferredSize(new java.awt.Dimension(250, 250));
        usernamepresent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        checkorders.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkorders.setText("Check Orders");
        checkorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkordersActionPerformed(evt);
            }
        });

        profileusername.setEditable(false);
        profileusername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profileusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        profileusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileusernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Balance:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("$");

        profilemoney.setEditable(false);
        profilemoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        profilemoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        profilemoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilemoneyActionPerformed(evt);
            }
        });

        editprofile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editprofile.setText("Edit Profile");
        editprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Full Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("New Username:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("New Password:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("New Credit Card No#:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("New Credit Card Pin#:");

        getfullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getfullname.setName(""); // NOI18N

        editedpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editedpassword.setName(""); // NOI18N

        editedusername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editedusername.setName(""); // NOI18N

        editedCardCN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editedCardCN.setName(""); // NOI18N

        editedCardCP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editedCardCP.setName(""); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Membership:");

        membership.setEditable(false);
        membership.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(membership, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileusername, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usernamepresent, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orderproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkorders))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editedCardCP, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editedCardCN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editedusername, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editedpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(logout)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilemoney, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderproduct)
                            .addComponent(checkorders))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editprofile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(getfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(editedusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(editedpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(editedCardCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(editedCardCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(usernamepresent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(profilemoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(membership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // Sends the user to the Log-in page
        dispose();
        CustomerLogin profiletologin = new CustomerLogin();
        profiletologin.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void orderproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderproductActionPerformed
        // Sends the user to the Order page
        dispose();
        CustomerOrder profiletoorder = new CustomerOrder();
        profiletoorder.setVisible(true);
    }//GEN-LAST:event_orderproductActionPerformed

    private void checkordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkordersActionPerformed
        // Sends the user to the Invoice page
        dispose();
        CustomerOrderList profiletoinvoice = new CustomerOrderList();
        profiletoinvoice.setVisible(true);
    }//GEN-LAST:event_checkordersActionPerformed


    private void profileusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileusernameActionPerformed

    private void profilemoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilemoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilemoneyActionPerformed

    /**
     * @param args the command line arguments
     */

    /**
     * @param args the command line arguments
     */

    private void editprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editprofileActionPerformed
        // Lets the user edit his/her profile detail
        String getfile = getfullname.getText();
        String ediusername = editedusername.getText();
        String edipassword = new String(editedpassword.getPassword());
        String edicardcn = editedCardCN.getText();
        String edicardcp = editedCardCP.getText();
        
        if(getfile.isEmpty() || ediusername.isEmpty() || edipassword.isEmpty() || edicardcn.isEmpty() || edicardcp.isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill all Detials","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                BufferedWriter replacetext = new BufferedWriter(new FileWriter("NetbeansProject\\Inventory Management and POS\\ F4 Data\\Customer Data\\"+getfile+".txt"));
                
                for(int searchline = 0; searchline < 15; searchline++){
                    if(searchline == 3){
                        replacetext.write("\nUsername: "+ediusername);
                    }
                    if(searchline == 4){
                        replacetext.write("\nPassword: "+edipassword);
                    }
                    if(searchline == 7){
                        replacetext.write("\nCredit Card No#: "+edicardcn);
                    }
                    if(searchline == 8){
                        replacetext.write("\nCredit Card Pin: "+edicardcp);
                    }
                }
                
                replacetext.close();
                getfullname.setText("");
                profileusername.setText(ediusername);
                editedpassword.setText("");
                editedCardCN.setText("");
                editedCardCP.setText("");
            } catch (IOException ex) {
                Logger.getLogger(CustomerProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Successfully Edited your Profile!");
        }
    }//GEN-LAST:event_editprofileActionPerformed


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
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkorders;
    private javax.swing.JTextField editedCardCN;
    private javax.swing.JTextField editedCardCP;
    private javax.swing.JPasswordField editedpassword;
    private javax.swing.JTextField editedusername;
    private javax.swing.JToggleButton editprofile;
    private javax.swing.JTextField getfullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logout;
    private javax.swing.JTextField membership;
    private javax.swing.JButton orderproduct;
    private javax.swing.JTextField profilemoney;
    private javax.swing.JTextField profileusername;
    private javax.swing.JLabel usernamepresent;
    // End of variables declaration//GEN-END:variables
}
