package IMS;

import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Raidi
 * 
 * 
 */
public class CustomerRegister extends javax.swing.JFrame {

    public CustomerRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        yesorno = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        customerusernamereg = new javax.swing.JTextField();
        customeremailreg = new javax.swing.JTextField();
        customerbdday = new javax.swing.JTextField();
        customerccn = new javax.swing.JTextField();
        customerccp = new javax.swing.JTextField();
        customerca = new javax.swing.JTextField();
        customerbdmonth = new javax.swing.JTextField();
        customerbdyear = new javax.swing.JTextField();
        gotologin = new javax.swing.JButton();
        confirmregister = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        customerfullname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        customeraddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Yes = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        customerpasswordreg = new javax.swing.JPasswordField();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Register Form");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Email Adress:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Credit Card Pin:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Credit Amount:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("(day/month/year)Birthday:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Credit Card No#:");

        customerusernamereg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerusernamereg.setPreferredSize(new java.awt.Dimension(60, 25));

        customeremailreg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customeremailreg.setPreferredSize(new java.awt.Dimension(60, 25));

        customerbdday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerbdday.setPreferredSize(new java.awt.Dimension(60, 25));

        customerccn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerccn.setPreferredSize(new java.awt.Dimension(60, 25));

        customerccp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerccp.setPreferredSize(new java.awt.Dimension(60, 25));

        customerca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerca.setPreferredSize(new java.awt.Dimension(60, 25));

        customerbdmonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerbdmonth.setPreferredSize(new java.awt.Dimension(60, 25));

        customerbdyear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerbdyear.setPreferredSize(new java.awt.Dimension(60, 25));

        gotologin.setText("Back");
        gotologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotologinActionPerformed(evt);
            }
        });

        confirmregister.setText("Register");
        confirmregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmregisterActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Full Name:");

        customerfullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerfullname.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Address:");

        customeraddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customeraddress.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("($100)Membership:");

        yesorno.add(Yes);
        Yes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Yes.setText("Yes");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });

        yesorno.add(No);
        No.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        No.setText("No");

        customerpasswordreg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerpasswordreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerpasswordregActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customeremailreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customerccn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customerccp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(customerbdday, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(customerbdmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(customerbdyear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gotologin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(confirmregister))
                                    .addComponent(customerusernamereg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(customerpasswordreg)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(customerfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel11))
                                    .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(No)
                                    .addComponent(Yes))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(customerfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Yes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(No)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerusernamereg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(customerpasswordreg, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(customeremailreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(customerbdday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerbdmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerbdyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(customerccn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(customerccp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(customerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gotologin)
                    .addComponent(confirmregister))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmregisterActionPerformed
        // Creates a text file for the user
        // Note: Check the text file for the line location of the username, password, and email incase for logging function
        String fullnamereg = customerfullname.getText();
        String addressreg = customeraddress.getText();
        String usernamereg = customerusernamereg.getText();
        String passwordreg = new String(customerpasswordreg.getPassword());
        String emailreg = customeremailreg.getText();
        String bddayreg = customerbdday.getText();
        String bdmonthreg = customerbdmonth.getText();
        String bddayyearreg = customerbdyear.getText();
        String creditnumreg = customerccn.getText();
        String creditpinreg = customerccp.getText();
        String creditmoneyreg = customerca.getText();
        String membershipyn = "";
        
        if(Yes.isSelected()){
            membershipyn = "Yes";
            int accountbalance = Integer.parseInt(creditmoneyreg);
            int balanceminus = accountbalance - 100;
            
            String balance = Integer.toString(balanceminus);
            customerca.setText(balance);
        }
        else if(No.isSelected()){
            membershipyn = "No";
        }
        
        if(fullnamereg.isEmpty() || usernamereg.isEmpty() || 
                passwordreg.isEmpty() || emailreg.isEmpty() || 
                bddayreg.isEmpty() || bdmonthreg.isEmpty() || 
                bddayyearreg.isEmpty() || creditnumreg.isEmpty() || 
                creditpinreg.isEmpty() || creditmoneyreg.isEmpty() || 
                addressreg.isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill all Detials","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                BufferedWriter customerdetials = new BufferedWriter(new FileWriter("NetbeansProject\\Inventory Management and POS\\ F4 Data\\Customer Data\\"+fullnamereg+".txt"));
                customerdetials.write("Fullname: "+fullnamereg);
                customerdetials.write("\nAddress: "+addressreg);
                customerdetials.write("\nUsername: "+usernamereg);
                customerdetials.write("\nPassword: "+passwordreg);
                customerdetials.write("\nEmail: "+emailreg);
                customerdetials.write("\n(day/month/year)Birthday: "+bddayreg);
                customerdetials.write("/"+bdmonthreg);
                customerdetials.write("/"+bddayyearreg);
                customerdetials.write("\nCredit Card No#: "+creditnumreg);
                customerdetials.write("\nCredit Card Pin: "+creditpinreg);
                customerdetials.write("\nCredit on Account: "+creditmoneyreg);
                customerdetials.write("\nMembership Status: "+membershipyn);
                customerdetials.close();
                
                CustomerProfile registertoprofile = new CustomerProfile();
                registertoprofile.setabalance(creditmoneyreg);
                registertoprofile.setstatmember(membershipyn);
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Successfully made the account!");
        }
    }//GEN-LAST:event_confirmregisterActionPerformed

    private void gotologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotologinActionPerformed
        // To go the Login Page
        dispose();
        CustomerLogin registertologin = new CustomerLogin();
        registertologin.setVisible(true);
    }//GEN-LAST:event_gotologinActionPerformed

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesActionPerformed

    private void customerpasswordregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerpasswordregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerpasswordregActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton No;
    private javax.swing.JRadioButton Yes;
    private javax.swing.JButton confirmregister;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JTextField customerbdday;
    private javax.swing.JTextField customerbdmonth;
    private javax.swing.JTextField customerbdyear;
    private javax.swing.JTextField customerca;
    private javax.swing.JTextField customerccn;
    private javax.swing.JTextField customerccp;
    private javax.swing.JTextField customeremailreg;
    private javax.swing.JTextField customerfullname;
    private javax.swing.JPasswordField customerpasswordreg;
    private javax.swing.JTextField customerusernamereg;
    private javax.swing.JButton gotologin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.ButtonGroup yesorno;
    // End of variables declaration//GEN-END:variables
}
