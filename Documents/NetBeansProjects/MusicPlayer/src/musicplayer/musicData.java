/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicplayer;

import java.awt.Image;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

    
public class musicData extends javax.swing.JFrame {
    String title;
    String artist;
    String year;
    String filepath;
    MusicPlayer musicPlayer;
    FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .wav files", "wav");
    
    ImageIcon selectMusicIcon = new ImageIcon("src\\Icon\\selectMusic.png");
    
    
    
    int iconWidth = 32;
    int iconHeight = 32;
    
    JFileChooser fc = new JFileChooser("C:",FileSystemView.getFileSystemView());
    public musicData(MusicPlayer musicPlayer) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Add Music");
        this.musicPlayer = musicPlayer; 
        Image selectMusicImage = selectMusicIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedSelectMusicIcon = new ImageIcon(selectMusicImage);
        addMusicButton.setIcon(resizedSelectMusicIcon);
        confirmButton.setEnabled(false);
    }
    
    void setData() {
        this.title = titleText.getText();
        this.artist = artistText.getText();
        this.year = yearText.getText();
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getArtist() {
        return artist;
    }
    public String getFilePath(){
        return filepath;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        artistText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        addMusicButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fileName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 520));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        mainPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("File:");
        mainPanel.add(jLabel1);
        jLabel1.setBounds(30, 280, 50, 43);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Artist:");
        mainPanel.add(jLabel2);
        jLabel2.setBounds(30, 160, 65, 38);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Title:");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(30, 100, 65, 38);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year:");
        mainPanel.add(jLabel4);
        jLabel4.setBounds(30, 220, 65, 38);

        titleText.setBackground(new java.awt.Color(102, 102, 102));
        titleText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.add(titleText);
        titleText.setBounds(140, 100, 240, 38);

        artistText.setBackground(new java.awt.Color(102, 102, 102));
        artistText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        artistText.setForeground(new java.awt.Color(255, 255, 255));
        artistText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistTextActionPerformed(evt);
            }
        });
        mainPanel.add(artistText);
        artistText.setBounds(140, 160, 240, 38);

        yearText.setBackground(new java.awt.Color(102, 102, 102));
        yearText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yearText.setForeground(new java.awt.Color(255, 255, 255));
        yearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextActionPerformed(evt);
            }
        });
        mainPanel.add(yearText);
        yearText.setBounds(140, 220, 240, 38);

        addMusicButton.setBackground(new java.awt.Color(102, 102, 102));
        addMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMusicButtonActionPerformed(evt);
            }
        });
        mainPanel.add(addMusicButton);
        addMusicButton.setBounds(290, 340, 90, 50);

        confirmButton.setBackground(new java.awt.Color(102, 102, 102));
        confirmButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("CONFIRM");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        mainPanel.add(confirmButton);
        confirmButton.setBounds(280, 420, 110, 40);

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        mainPanel.add(backButton);
        backButton.setBounds(10, 420, 110, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select File:");
        mainPanel.add(jLabel5);
        jLabel5.setBounds(160, 350, 136, 43);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD MUSIC");
        mainPanel.add(jLabel6);
        jLabel6.setBounds(100, 30, 220, 43);

        fileName.setEditable(false);
        fileName.setBackground(new java.awt.Color(102, 102, 102));
        fileName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fileName.setForeground(new java.awt.Color(255, 255, 255));
        fileName.setFocusable(false);
        fileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNameActionPerformed(evt);
            }
        });
        mainPanel.add(fileName);
        fileName.setBounds(140, 280, 240, 38);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, 406, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void artistTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistTextActionPerformed

    private void yearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        titleText.setText("");
        artistText.setText("");
        yearText.setText("");
        fileName.setText("");
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // Check if empty
        if (!titleText.getText().isEmpty() && !artistText.getText().isEmpty() && !yearText.getText().isEmpty()) {
            setData();
            musicPlayer.addMusicData(); // Use the reference to the main class to add data
            // Clean
            titleText.setText("");
            artistText.setText("");
            yearText.setText("");
            fileName.setText("");
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill in the Blanks.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        musicPlayer.addedTrack();
        getFilePath();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void addMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMusicButtonActionPerformed
        // Setting File Chooser
        fc.setDialogTitle("Select Music File");
        fc.addChoosableFileFilter(restrict);
        fc.setAcceptAllFileFilterUsed(false);
        int r = fc.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            // Set the label to the path of the selected file
            fileName.setText(fc.getSelectedFile().getName());
            this.filepath = fc.getSelectedFile().getAbsolutePath();

            // Enable the Confirm button since a file has been chosen
            confirmButton.setEnabled(true);
        }
    }//GEN-LAST:event_addMusicButtonActionPerformed

    private void fileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileNameActionPerformed

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
            java.util.logging.Logger.getLogger(musicData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musicData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musicData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musicData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMusicButton;
    private javax.swing.JTextField artistText;
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField fileName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField titleText;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
