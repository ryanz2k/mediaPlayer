package IMS;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.Timer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class POSOrderList extends javax.swing.JFrame {
    int overallprice = 0;
    int ordernumber = 0;
    DefaultTableModel cartlist;
    static char[] getlogFilename() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Timer timer;
    private final TimeZone philippineTimeZone;
    private String fullName;

    public POSOrderList() {
        initComponents();
        philippineTimeZone = TimeZone.getTimeZone("Asia/Manila");
        loadDateTime();
        startTimer();
        cartlist = (DefaultTableModel)customercart.getModel();
    }

    public void setFullName(String fullName) {
        fullNameLabel.setText(fullName);
        
    }
    
    

    public final void loadDateTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
        sdf.setTimeZone(philippineTimeZone);
        sdf2.setTimeZone(philippineTimeZone);
        timeLabel.setText(sdf2.format(date));
        dateLabel.setText(sdf.format(date));
    }

    private void startTimer() {
        timer = new Timer(1000, (evt) -> updateTimeLabel());
        timer.start();
    }

    private void updateTimeLabel() {
        Date time = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
        sdf2.setTimeZone(philippineTimeZone);
        timeLabel.setText(sdf2.format(time));
    }
    
    public String getLogoutTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            .withLocale(Locale.ENGLISH)
            .withZone(ZoneId.of("Asia/Manila"));
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Manila"));
        String logoutTime = now.format(formatter);
        return logoutTime;
    } 
   

    
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        orderList = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        fullNameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        schwarzbier = new javax.swing.JButton();
        bourbonwhisky = new javax.swing.JButton();
        fruitvodka = new javax.swing.JButton();
        plainvodka = new javax.swing.JButton();
        plymouthgin = new javax.swing.JButton();
        chardonnaywine = new javax.swing.JButton();
        cabernetsauvignonwine = new javax.swing.JButton();
        oldtomgin = new javax.swing.JButton();
        distilledsoju = new javax.swing.JButton();
        navyrum = new javax.swing.JButton();
        sweetcider = new javax.swing.JButton();
        stoutbeer = new javax.swing.JButton();
        scotchwhisky = new javax.swing.JButton();
        bittercider = new javax.swing.JButton();
        rhumagricole = new javax.swing.JButton();
        productprice = new javax.swing.JTextField();
        productname = new javax.swing.JTextField();
        productquantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        calculateTotal = new javax.swing.JToggleButton();
        addtoCart = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customercart = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        overallcost = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        orderaddress = new javax.swing.JTextField();
        comfirmcart = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS System");
        setPreferredSize(new java.awt.Dimension(1330, 580));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Return Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        orderList.setBackground(new java.awt.Color(102, 102, 102));
        orderList.setForeground(new java.awt.Color(255, 255, 255));
        orderList.setText("Order List");
        orderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderListActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add Discount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Report Logs");

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Get Total");

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Process Order ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(102, 102, 102));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderList, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(15, 15, 15)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(orderList, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(730, 30, 170, 250);

        jPanel5.setLayout(null);

        fullNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(51, 51, 51));
        fullNameLabel.setText("jLabel2");
        jPanel5.add(fullNameLabel);
        fullNameLabel.setBounds(80, 0, 130, 40);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(" Name:");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(20, -10, 130, 60);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Time:");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(250, 0, 38, 40);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText(" Date: ");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(370, 0, 43, 40);

        timeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 51, 51));
        timeLabel.setText("jLabel1");
        jPanel5.add(timeLabel);
        timeLabel.setBounds(290, 0, 100, 40);

        dateLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 51, 51));
        dateLabel.setText("jLabel3");
        jPanel5.add(dateLabel);
        dateLabel.setBounds(410, 0, 100, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(720, 340, 590, 40);

        jPanel3.setLayout(null);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 0, 3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TOTAL AMOUNT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(410, 10, 160, 100);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SUB TOTAL:");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DISCOUNT:");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TAX:");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TOTAL ITEMS:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(186, 186, 186))
        );

        jPanel3.add(jPanel8);
        jPanel8.setBounds(10, 10, 380, 100);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(730, 400, 580, 120);

        schwarzbier.setText("Schwarzbier");
        schwarzbier.setPreferredSize(new java.awt.Dimension(120, 50));
        schwarzbier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schwarzbierActionPerformed(evt);
            }
        });
        jPanel1.add(schwarzbier);
        schwarzbier.setBounds(40, 30, 110, 50);

        bourbonwhisky.setText("Bourbon Whisky");
        bourbonwhisky.setPreferredSize(new java.awt.Dimension(120, 50));
        bourbonwhisky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bourbonwhiskyActionPerformed(evt);
            }
        });
        jPanel1.add(bourbonwhisky);
        bourbonwhisky.setBounds(420, 150, 140, 50);

        fruitvodka.setText("Fruit Vodka");
        fruitvodka.setPreferredSize(new java.awt.Dimension(120, 50));
        fruitvodka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitvodkaActionPerformed(evt);
            }
        });
        jPanel1.add(fruitvodka);
        fruitvodka.setBounds(290, 30, 120, 50);

        plainvodka.setText("Plain Vodka");
        plainvodka.setPreferredSize(new java.awt.Dimension(120, 50));
        plainvodka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainvodkaActionPerformed(evt);
            }
        });
        jPanel1.add(plainvodka);
        plainvodka.setBounds(160, 30, 120, 50);

        plymouthgin.setText("Plymouth Gin");
        plymouthgin.setPreferredSize(new java.awt.Dimension(120, 50));
        plymouthgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plymouthginActionPerformed(evt);
            }
        });
        jPanel1.add(plymouthgin);
        plymouthgin.setBounds(580, 30, 130, 50);

        chardonnaywine.setText("Chardonnay Wine");
        chardonnaywine.setPreferredSize(new java.awt.Dimension(120, 50));
        chardonnaywine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chardonnaywineActionPerformed(evt);
            }
        });
        jPanel1.add(chardonnaywine);
        chardonnaywine.setBounds(420, 30, 140, 50);

        cabernetsauvignonwine.setText("Cabernet Sauvignon Wine");
        cabernetsauvignonwine.setPreferredSize(new java.awt.Dimension(120, 50));
        cabernetsauvignonwine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabernetsauvignonwineActionPerformed(evt);
            }
        });
        jPanel1.add(cabernetsauvignonwine);
        cabernetsauvignonwine.setBounds(290, 150, 120, 50);

        oldtomgin.setText("Old Tom Gin");
        oldtomgin.setPreferredSize(new java.awt.Dimension(120, 50));
        oldtomgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldtomginActionPerformed(evt);
            }
        });
        jPanel1.add(oldtomgin);
        oldtomgin.setBounds(580, 150, 130, 50);

        distilledsoju.setText("Distilled Soju");
        distilledsoju.setPreferredSize(new java.awt.Dimension(120, 50));
        distilledsoju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distilledsojuActionPerformed(evt);
            }
        });
        jPanel1.add(distilledsoju);
        distilledsoju.setBounds(160, 150, 120, 50);

        navyrum.setText("Navy Rum");
        navyrum.setPreferredSize(new java.awt.Dimension(120, 50));
        navyrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navyrumActionPerformed(evt);
            }
        });
        jPanel1.add(navyrum);
        navyrum.setBounds(40, 90, 110, 50);

        sweetcider.setText("Sweet Cider");
        sweetcider.setPreferredSize(new java.awt.Dimension(120, 50));
        sweetcider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetciderActionPerformed(evt);
            }
        });
        jPanel1.add(sweetcider);
        sweetcider.setBounds(160, 90, 120, 50);

        stoutbeer.setText("Stout Beer");
        stoutbeer.setPreferredSize(new java.awt.Dimension(120, 50));
        stoutbeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoutbeerActionPerformed(evt);
            }
        });
        jPanel1.add(stoutbeer);
        stoutbeer.setBounds(290, 90, 120, 50);

        scotchwhisky.setText("Scotch Whisky");
        scotchwhisky.setPreferredSize(new java.awt.Dimension(120, 50));
        scotchwhisky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scotchwhiskyActionPerformed(evt);
            }
        });
        jPanel1.add(scotchwhisky);
        scotchwhisky.setBounds(420, 90, 140, 50);

        bittercider.setText("Bitter Cider");
        bittercider.setPreferredSize(new java.awt.Dimension(120, 50));
        bittercider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitterciderActionPerformed(evt);
            }
        });
        jPanel1.add(bittercider);
        bittercider.setBounds(580, 90, 130, 50);

        rhumagricole.setText("Rhum Agricole");
        rhumagricole.setPreferredSize(new java.awt.Dimension(120, 50));
        rhumagricole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhumagricoleActionPerformed(evt);
            }
        });
        jPanel1.add(rhumagricole);
        rhumagricole.setBounds(40, 150, 110, 50);

        productprice.setEditable(false);
        jPanel1.add(productprice);
        productprice.setBounds(100, 300, 100, 30);

        productname.setEditable(false);
        jPanel1.add(productname);
        productname.setBounds(100, 220, 100, 30);
        jPanel1.add(productquantity);
        productquantity.setBounds(100, 260, 100, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order No.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 510, 60, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 220, 60, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 260, 60, 30);

        totalprice.setEditable(false);
        totalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpriceActionPerformed(evt);
            }
        });
        jPanel1.add(totalprice);
        totalprice.setBounds(100, 340, 100, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 300, 60, 30);

        calculateTotal.setText("Calculate Total");
        calculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotalActionPerformed(evt);
            }
        });
        jPanel1.add(calculateTotal);
        calculateTotal.setBounds(20, 390, 190, 40);

        addtoCart.setText("Add to Cart");
        addtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartActionPerformed(evt);
            }
        });
        jPanel1.add(addtoCart);
        addtoCart.setBounds(20, 440, 190, 40);

        customercart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customercart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customercartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customercart);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 220, 490, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LiquorPics/FantasticFourLogo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(920, 60, 200, 180);

        overallcost.setEditable(false);
        overallcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallcostActionPerformed(evt);
            }
        });
        jPanel1.add(overallcost);
        overallcost.setBounds(310, 510, 100, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Price");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 340, 70, 30);

        orderaddress.setEditable(false);
        orderaddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orderaddress.setText("1");
        orderaddress.setPreferredSize(new java.awt.Dimension(72, 25));
        jPanel1.add(orderaddress);
        orderaddress.setBounds(500, 510, 100, 30);

        comfirmcart.setText("Add Order");
        comfirmcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfirmcartActionPerformed(evt);
            }
        });
        jPanel1.add(comfirmcart);
        comfirmcart.setBounds(20, 490, 190, 40);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Cost");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(240, 510, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 295, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderListActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        
        String logoutTime = getLogoutTime(); // Call the method to get the logout time

        POSLogin POSLoginFrame = new POSLogin();
        POSLoginFrame.setVisible(true);
        POSLoginFrame.pack();
        POSLoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void bourbonwhiskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bourbonwhiskyActionPerformed
        // TODO add your handling code here:
        productname.setText("Bourbon-Whisky");
        productquantity.setText("1");
        productprice.setText("28");
    }//GEN-LAST:event_bourbonwhiskyActionPerformed

    private void fruitvodkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitvodkaActionPerformed
        // TODO add your handling code here:
        productname.setText("Fruit-Vodka");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_fruitvodkaActionPerformed

    private void plainvodkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainvodkaActionPerformed
        // TODO add your handling code here:
        productname.setText("Plain-Vodka");
        productquantity.setText("1");
        productprice.setText("23");
    }//GEN-LAST:event_plainvodkaActionPerformed

    private void plymouthginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plymouthginActionPerformed
        // TODO add your handling code here:
        productname.setText("Plymouth-Gin");
        productquantity.setText("1");
        productprice.setText("28");
    }//GEN-LAST:event_plymouthginActionPerformed

    private void chardonnaywineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chardonnaywineActionPerformed
        // TODO add your handling code here:
        productname.setText("Chardonnay-Wine");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_chardonnaywineActionPerformed

    private void cabernetsauvignonwineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabernetsauvignonwineActionPerformed
        // TODO add your handling code here:
        productname.setText("Cabernet-Sauvignon-Wine");
        productquantity.setText("1");
        productprice.setText("26");
    }//GEN-LAST:event_cabernetsauvignonwineActionPerformed

    private void oldtomginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldtomginActionPerformed
        // TODO add your handling code here:
        productname.setText("Old-Tom-Gin");
        productquantity.setText("1");
        productprice.setText("32");
    }//GEN-LAST:event_oldtomginActionPerformed

    private void distilledsojuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distilledsojuActionPerformed
        // TODO add your handling code here:
        productname.setText("Distilled-Soju");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_distilledsojuActionPerformed

    private void navyrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navyrumActionPerformed
        // TODO add your handling code here:
        productname.setText("Navy-Rum");
        productquantity.setText("1");
        productprice.setText("24");
    }//GEN-LAST:event_navyrumActionPerformed

    private void sweetciderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetciderActionPerformed
        // TODO add your handling code here:
        productname.setText("Sweet-Cider");
        productquantity.setText("1");
        productprice.setText("18");
    }//GEN-LAST:event_sweetciderActionPerformed

    private void stoutbeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoutbeerActionPerformed
        // TODO add your handling code here:
        productname.setText("Stout-Beer");
        productquantity.setText("1");
        productprice.setText("18");
    }//GEN-LAST:event_stoutbeerActionPerformed

    private void scotchwhiskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scotchwhiskyActionPerformed
        // TODO add your handling code here:
        productname.setText("Scotch-Whisky");
        productquantity.setText("1");
        productprice.setText("39");
    }//GEN-LAST:event_scotchwhiskyActionPerformed

    private void bitterciderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitterciderActionPerformed
        // TODO add your handling code here:
        productname.setText("Bitter-Cider");
        productquantity.setText("1");
        productprice.setText("18");
    }//GEN-LAST:event_bitterciderActionPerformed

    private void rhumagricoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhumagricoleActionPerformed
        // TODO add your handling code here:
        productname.setText("Rhum-Agricole");
        productquantity.setText("1");
        productprice.setText("42");
    }//GEN-LAST:event_rhumagricoleActionPerformed

    private void schwarzbierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schwarzbierActionPerformed
        // TODO add your handling code here:
        productname.setText("Schwarzbier");
        productquantity.setText("1");
        productprice.setText("22");
    }//GEN-LAST:event_schwarzbierActionPerformed

    private void totalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalpriceActionPerformed

    private void calculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateTotalActionPerformed
        // TODO add your handling code here:
        String quantityString = productquantity.getText();
        String priceString = productprice.getText();
        
        int quantityInt = Integer.parseInt(quantityString);
        int priceInt = Integer.parseInt(priceString);
        int totalpriceInt = quantityInt * priceInt;
        String totalpriceString = String.valueOf(totalpriceInt);
        totalprice.setText(totalpriceString);
    }//GEN-LAST:event_calculateTotalActionPerformed

    private void addtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartActionPerformed
        // TODO add your handling code here:
        if(productname.getText().equals("") || productquantity.getText().equals("") || productprice.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Pick a Product!");
        }
        else if(totalprice.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Calculate the Total Price!");
        }
        else{
            int eachtotalprice = Integer.parseInt(totalprice.getText());
            overallprice += eachtotalprice;
        
            String getoverallprice = Integer.toString(overallprice);
            overallcost.setText(getoverallprice);
            
            String productpicked[] = {productname.getText(),productquantity.getText(),productprice.getText(),totalprice.getText()};
            
            DefaultTableModel cartlist = (DefaultTableModel)customercart.getModel();
            cartlist.addRow(productpicked);
            
            productname.setText("");
            productquantity.setText("");
            productprice.setText("");
            totalprice.setText("");
        }
    }//GEN-LAST:event_addtoCartActionPerformed

    private void customercartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customercartMouseClicked
        // This the customer cart list
        String productname = customercart.getValueAt(customercart.getSelectedRow(), 0).toString();
        String productquantity = customercart.getValueAt(customercart.getSelectedRow(), 1).toString();
        String productprice = customercart.getValueAt(customercart.getSelectedRow(), 2).toString();
        String producttotalprice = customercart.getValueAt(customercart.getSelectedRow(), 3).toString();
    }//GEN-LAST:event_customercartMouseClicked

    private void overallcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overallcostActionPerformed

    private void comfirmcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfirmcartActionPerformed
        // Stores the User's Cart List
        ordernumber += 1;
        String orderID = Integer.toString(ordernumber);
        orderaddress.setText(orderID);
        String customeraddress = orderaddress.getText();
        String totaladdedcost = overallcost.getText();

        if(customercart.getRowCount() != 0){
            String thefilepath = "NetbeansProject\\Inventory Management and POS\\ F4 Data\\Customer Data\\COI"+customeraddress+".txt";
            File makefile = new File(thefilepath);
            try {
                FileWriter file = new FileWriter(makefile);
                BufferedWriter writethefile = new BufferedWriter(file);

                for(int r = 0; r < customercart.getRowCount(); r++){
                    for(int c = 0; c < customercart.getColumnCount(); c++){
                        writethefile.write(customercart.getValueAt(r, c).toString()+" ");
                    }
                    writethefile.newLine();
                }
                writethefile.write("Over All Cost($): "+totaladdedcost);
                writethefile.close();
                file.close();

            } catch (IOException ex) {
                
            }
            overallcost.setText("");
            JOptionPane.showMessageDialog(this, "Your Cart has been Saved!\n Your Order Number is " +orderaddress.getText().toString());
        }
        else{
            JOptionPane.showMessageDialog(this, "No Data to be Saved");
        }

        cartlist.setRowCount(0);
    }//GEN-LAST:event_comfirmcartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addtoCart;
    private javax.swing.JButton bittercider;
    private javax.swing.JButton bourbonwhisky;
    private javax.swing.JButton cabernetsauvignonwine;
    private javax.swing.JToggleButton calculateTotal;
    private javax.swing.JButton chardonnaywine;
    private javax.swing.JButton comfirmcart;
    private javax.swing.JTable customercart;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton distilledsoju;
    private javax.swing.JButton fruitvodka;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton navyrum;
    private javax.swing.JButton oldtomgin;
    private javax.swing.JButton orderList;
    private javax.swing.JTextField orderaddress;
    private javax.swing.JTextField overallcost;
    private javax.swing.JButton plainvodka;
    private javax.swing.JButton plymouthgin;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField productprice;
    private javax.swing.JTextField productquantity;
    private javax.swing.JButton rhumagricole;
    private javax.swing.JButton schwarzbier;
    private javax.swing.JButton scotchwhisky;
    private javax.swing.JButton stoutbeer;
    private javax.swing.JButton sweetcider;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField totalprice;
    // End of variables declaration//GEN-END:variables

    
}

