package IMS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class POSSignUp extends javax.swing.JFrame {
    
    public POSSignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        employeeSignUpButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CreditCardNUM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MoneyDeposit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Sign Up ");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(51, 51, 51));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));
        Left.setLayout(null);
        Left.add(jLabel5);
        jLabel5.setBounds(580, 113, 0, 190);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/FantasticFourLogo.png"))); // NOI18N
        Left.add(jLabel9);
        jLabel9.setBounds(100, 90, 200, 200);

        jLabel6.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME TO POS SYSTEM");
        Left.add(jLabel6);
        jLabel6.setBounds(30, 290, 338, 40);

        jPanel1.add(Left);
        Left.setBounds(0, -10, 400, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SIGN UP");
        Right.add(jLabel1);
        jLabel1.setBounds(120, 20, 170, 43);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Full Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 20));
        Right.add(jLabel2);
        jLabel2.setBounds(20, 80, 141, 20);

        Fullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Fullname.setForeground(new java.awt.Color(102, 102, 102));
        Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameActionPerformed(evt);
            }
        });
        Right.add(Fullname);
        Fullname.setBounds(20, 100, 324, 30);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Deposit Cash Amount");
        Right.add(jLabel3);
        jLabel3.setBounds(20, 310, 160, 60);

        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Right.add(Password);
        Password.setBounds(20, 220, 324, 30);

        employeeSignUpButton.setBackground(new java.awt.Color(102, 102, 102));
        employeeSignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        employeeSignUpButton.setText("Sign Up");
        employeeSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSignUpButtonActionPerformed(evt);
            }
        });
        Right.add(employeeSignUpButton);
        employeeSignUpButton.setBounds(30, 410, 93, 30);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Right.add(jButton2);
        jButton2.setBounds(250, 410, 90, 30);

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Username");
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 20));
        Right.add(jLabel7);
        jLabel7.setBounds(20, 140, 141, 20);

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(102, 102, 102));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        Right.add(Username);
        Username.setBounds(20, 160, 324, 30);

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Password");
        Right.add(jLabel8);
        jLabel8.setBounds(20, 190, 129, 40);
        Right.add(CreditCardNUM);
        CreditCardNUM.setBounds(20, 280, 320, 30);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Credit Card Number ");
        Right.add(jLabel4);
        jLabel4.setBounds(20, 250, 160, 40);

        MoneyDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyDepositActionPerformed(evt);
            }
        });
        Right.add(MoneyDeposit);
        MoneyDeposit.setBounds(20, 350, 320, 30);

        jPanel1.add(Right);
        Right.setBounds(420, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void employeeSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeSignUpButtonActionPerformed
     
        String fullname = Fullname.getText();
        String username = Username.getText();
        String password = new String(Password.getPassword());
        String creditCardNum = CreditCardNUM.getText();
        String moneyDeposit = MoneyDeposit.getText();
        String DIRECTORY_PATH = "NetbeansProject/Inventory Management and POS/ F4 Data"; 
        
         if (fullname.isEmpty() || username.isEmpty() || password.isEmpty() || creditCardNum.isEmpty() || moneyDeposit.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Error: Please fill in all fields");
            return; 
        }
 
         if (creditCardNum.length() != 16) {
                JOptionPane.showMessageDialog(null, "Error: Credit card number must be 16 digits");
                return;
            }

            try {
                long number = Long.parseLong(creditCardNum);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Credit card number must be an integer");
                return;
            }

            File directory = new File(DIRECTORY_PATH);
            if (directory.exists()) {
            } else {
                directory.mkdirs(); // Create the directory if it doesn't exist
        }
            
             try {
                File file = new File(DIRECTORY_PATH,fullname + ".txt");
                
                
                if (file.exists()) {
                    JOptionPane.showMessageDialog(null,"Error: Account already exists");
                    return; 
                }
                
            
                FileWriter writer = new FileWriter(file);
                
            try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                bufferedWriter.write("Full Name: " + fullname);
                bufferedWriter.newLine();
                bufferedWriter.write("Username: " + username);
                bufferedWriter.newLine();
                bufferedWriter.write("Password: " + password);
                bufferedWriter.newLine();
                bufferedWriter.write("Credit Card Number: " + creditCardNum);
                bufferedWriter.newLine();
                bufferedWriter.write("Deposit Cash Amount: " + moneyDeposit);
            }
                JOptionPane.showMessageDialog(null,"Account Successfully Registered!");

                
                 POSLogin POSLoginFrame = new  POSLogin();
                 POSLoginFrame.setVisible(true);
                 POSLoginFrame.pack();
                 POSLoginFrame.setLocationRelativeTo(null); 
                 this.dispose();
                
                
            } catch (IOException e) {
                 JOptionPane.showMessageDialog(null,"An error occurred: " + e.getMessage());
            }
             

          
             
    }//GEN-LAST:event_employeeSignUpButtonActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       POSLogin POSLoginFrame = new  POSLogin();
       POSLoginFrame.setVisible(true);
       POSLoginFrame.pack();
       POSLoginFrame.setLocationRelativeTo(null); 
       this.dispose();
    
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullnameActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void MoneyDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyDepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyDepositActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CreditCardNUM;
    private javax.swing.JTextField Fullname;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField MoneyDeposit;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField Username;
    private javax.swing.JButton employeeSignUpButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

 

    }




