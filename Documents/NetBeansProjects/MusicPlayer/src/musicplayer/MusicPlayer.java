/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicplayer;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Timer;
import java.util.TimerTask;


public class MusicPlayer extends javax.swing.JFrame {
    musicData musicdata;
    lyrics lyrics;
    
    // DATA TYPES
    String currentlyPlaying;
    String filepath = "";
    boolean playing = false;
    boolean paused = false;
    int trackNumberInt;
    AudioInputStream audioInput;
    Clip clip;
    
    ImageIcon pauseIcon = new ImageIcon("src\\Icon\\pause.png");
    ImageIcon playIcon = new ImageIcon("src\\Icon\\play.png");
    ImageIcon forwardIcon = new ImageIcon("src\\Icon\\forward.png");
    ImageIcon backwardIcon = new ImageIcon("src\\Icon\\backward.png");
    ImageIcon addMusicIcon = new ImageIcon("src\\Icon\\addMusic.png");
    
    int iconWidth = 32;
    int iconHeight = 32;
    
    Image pauseImage = pauseIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
    Image playImage = playIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
    Image forwardImage = forwardIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
    Image backwardImage = backwardIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
    Image addMusicImage = addMusicIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
    
    
    ImageIcon resizedPauseIcon = new ImageIcon(pauseImage);
    ImageIcon resizedPlayIcon = new ImageIcon(playImage);
    ImageIcon resizedForwardIcon = new ImageIcon(forwardImage);
    ImageIcon resizedBackwardIcon = new ImageIcon(backwardImage);
    ImageIcon resizedAddMusicIcon = new ImageIcon(addMusicImage);
    
   
    String trackNumber;
    int currentIndex = 4;
    
    String[][] addedTrack = new String[100][100];
    NavigableMap<Long, String> lyricsMap;
    
    //Timer
    private Timer timer;
    private Timer volumeTimer;
    private static final int VOLUME_UPDATE_INTERVAL = 1;
    
    // TABLE MODEL
    DefaultTableModel musicTableModel;
   
    
    // MAIN CLASS
    public MusicPlayer() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ryan's Music Player");
        
        musicdata = new musicData(this);
        lyricsMap = new TreeMap<>();

        //Setting Table Model and Default Music
        musicTableModel = (DefaultTableModel) musicTable.getModel();
        addMusicRow("Cruel Angel's Thesis", "Yoko Takahashi", "1995");
        addMusicRow("Erika", "Herms Niel", "1938");
        addMusicRow("Idol", "Yoasobi", "2023");
        
        //Default
        pausePlayButton.setIcon(resizedPlayIcon);
        forwardButton.setIcon(resizedForwardIcon);
        backwardButton.setIcon(resizedBackwardIcon);
        addMusicButton.setIcon(resizedAddMusicIcon);
        
        
        //Lyrics Map
        lyricsMap = new TreeMap<>();
        lyrics = new lyrics(this);
        
        //Lyrics Timer
        timer = new Timer();
        startLyricsTimer();
        
        volumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeSliderStateChanged(evt);
            }
            });
        }
    
    private void volumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {
        if (volumeTimer != null) {
            volumeTimer.cancel();
        }

        volumeTimer = new Timer();
        volumeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> updateVolume());
            }
        },VOLUME_UPDATE_INTERVAL);
    }
    
    private void updateVolume() {
        // Get the value from the slider (0 to 100) and convert it to a float for volume control
        float volume = (float) volumeSlider.getValue() / 100.0f;

        // Set the volume to the clip
        if (clip != null) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(20.0f * (float) Math.log10(volume));
        }
    }

    
    private void setVolume(float volume) {
        if (clip != null) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float range = gainControl.getMaximum() - gainControl.getMinimum();
            float gain = (range * volume) + gainControl.getMinimum();
            gainControl.setValue(gain);
        }
    }
    
    private void addMusicRow(String title, String artist, String year) {
        int trackNumber = musicTableModel.getRowCount() + 1;
        musicTableModel.addRow(new Object[]{trackNumber, title, artist, year});
    }
    

    void playMusic(String location) {
        try {
            File musicpath = new File(location);
            if (musicpath.exists()) {
                audioInput = AudioSystem.getAudioInputStream(musicpath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String musicPath(String trackNumber) {
    trackNumberInt = Integer.parseInt(trackNumber);
    switch (trackNumberInt) {
        case 1:
            startLyricsTimer();
            lyrics.cruelAngel();
            return "src\\Music\\Cruel Angel's Thesis.wav";
        case 2:
            lyrics.noLyrics();
            return "src\\Music\\Erika.wav";
        case 3:
            lyrics.noLyrics();
            return "src\\Music\\Idol.wav";
        default:
            lyrics.noLyrics();
            return "";
    }
    }
    
    void stopMusic() throws IOException{
        clip.stop();
        clip.close(); // Close the clip to release resources
        audioInput.close(); // Close the audio input stream
        stopLyricsTimer();
    }
    
    void addMusicData(){
        addMusicRow(musicdata.getTitle(), musicdata.getArtist(), musicdata.getYear());
    }
    
    void addedTrack(){
        System.out.println(musicdata.filepath); 
        addedTrack[currentIndex][1] = musicdata.filepath;
        currentIndex++;
    }
    
    private void startLyricsTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateLyrics();
            }
        }, 0, 50);//Interval
    }
    
    private void stopLyricsTimer() {

        if (timer != null) {
            timer.cancel();
        }
    }
    
    private void clearLyrics() {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            lyricsText.setText("");
            durationText.setText("0:00:00");
        }
    });
    }
    
    void updateLyrics() {
    if (clip != null) {
        long currentPosition = clip.getMicrosecondPosition();
        // Convert microseconds to milliseconds
        long currentMilliseconds = currentPosition / 1_000;

        // Calculate minutes, seconds, and milliseconds
        long minutes = (currentMilliseconds / (60 * 1000)) % 60;
        long seconds = (currentMilliseconds / 1000) % 60;
        long milliseconds = currentMilliseconds % 1000;
        
        String formattedTime = String.format("%02d:%02d:%02d", minutes, seconds, milliseconds);
        
        // Find the closest timestamp in the lyrics map that is less than or equal to the current position
        long closestTimestamp = lyricsMap.floorKey(currentPosition);

        if (closestTimestamp != 0L) {
            String currentLyrics = lyricsMap.get(closestTimestamp);

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    lyricsText.setText(currentLyrics);
                    durationText.setText(formattedTime);
                }
            });
        }
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pausePlayButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        musicTable = new javax.swing.JTable();
        addMusicButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        forwardButton = new javax.swing.JButton();
        backwardButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        musicPlaying = new javax.swing.JLabel();
        lyricsText = new javax.swing.JTextField();
        durationText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));

        pausePlayButton.setBackground(new java.awt.Color(102, 102, 102));
        pausePlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausePlayButtonActionPerformed(evt);
            }
        });

        musicTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Title", "Artist", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(musicTable);
        if (musicTable.getColumnModel().getColumnCount() > 0) {
            musicTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            musicTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            musicTable.getColumnModel().getColumn(2).setPreferredWidth(125);
            musicTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        addMusicButton.setBackground(new java.awt.Color(102, 102, 102));
        addMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMusicButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0");
        jLabel1.setToolTipText("");

        forwardButton.setBackground(new java.awt.Color(102, 102, 102));
        forwardButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        forwardButton.setForeground(new java.awt.Color(255, 255, 255));
        forwardButton.setText("FORWARD");
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });

        backwardButton.setBackground(new java.awt.Color(102, 102, 102));
        backwardButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backwardButton.setForeground(new java.awt.Color(255, 255, 255));
        backwardButton.setText("BACKWARD");
        backwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Volume");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("100");
        jLabel5.setToolTipText("");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        musicPlaying.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        musicPlaying.setForeground(new java.awt.Color(255, 255, 255));

        lyricsText.setEditable(false);
        lyricsText.setBackground(new java.awt.Color(102, 102, 102));
        lyricsText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lyricsText.setForeground(new java.awt.Color(255, 255, 255));
        lyricsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lyricsText.setFocusable(false);

        durationText.setEditable(false);
        durationText.setBackground(new java.awt.Color(102, 102, 102));
        durationText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        durationText.setForeground(new java.awt.Color(255, 255, 255));
        durationText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        durationText.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Song List");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lyrics");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Currently Playing:");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(addMusicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lyricsText, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(durationText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(backwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pausePlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(musicPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(addMusicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(musicPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lyricsText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(durationText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pausePlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMusicButtonActionPerformed
        musicdata.setVisible(true);
    }//GEN-LAST:event_addMusicButtonActionPerformed

    private void pausePlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausePlayButtonActionPerformed
        int selectedRow = musicTable.getSelectedRow();
        if (selectedRow >= 0){
            if (!musicTable.getValueAt(selectedRow, 0).toString().equals(trackNumber)) {//Play
                try {
                    if (playing){
                        stopMusic();
                        System.out.println(playing);
                    }
                    trackNumber = musicTable.getValueAt(selectedRow, 0).toString();
                    filepath = musicPath(trackNumber);
                    String trackFilePath = addedTrack[selectedRow+1][1];
                        
                    if (!filepath.isEmpty() || !trackFilePath.isEmpty()) {
                        //Display Currently Playing
                        currentlyPlaying = musicTable.getValueAt(selectedRow, 1).toString();
                        setTitle("Ryan's Music Player - "+currentlyPlaying);
                        musicPlaying.setText(currentlyPlaying);
                        //Playing Music
                        if (selectedRow >= 3){
                            playMusic(trackFilePath);
                        }else{
                            playMusic(filepath);
                        }

                        pausePlayButton.setIcon(resizedPauseIcon);
                        paused = false;
                        playing = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid track number or missing file.", "Error", JOptionPane.ERROR_MESSAGE);
                        pausePlayButton.setIcon(resizedPlayIcon);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid track number.", "Error", JOptionPane.ERROR_MESSAGE);
                    pausePlayButton.setIcon(resizedPlayIcon);
                } catch (IOException ex) {
                    Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {//Paused
                if (paused){
                    clip.start();
                    pausePlayButton.setIcon(resizedPauseIcon);
                    paused = false;
                }else{//Music Playing
                    clip.stop();
                    pausePlayButton.setIcon(resizedPlayIcon);
                    paused = true;
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Select a music first before playing.", "Select Music", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pausePlayButtonActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        if (clip != null && clip.isRunning()) {
            long currentPosition = clip.getMicrosecondPosition();
            long newPosition = currentPosition + 5 * 1000000; // Skip 5 seconds

            if (newPosition < clip.getMicrosecondLength()) {
                clip.setMicrosecondPosition(newPosition);
                updateLyrics();
            }
        }
    }//GEN-LAST:event_forwardButtonActionPerformed

    private void backwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardButtonActionPerformed
        if (clip != null && clip.isRunning()) {
            long currentPosition = clip.getMicrosecondPosition();
            long newPosition = currentPosition + 5 * -1000000; // Skip 5 seconds

            if (newPosition < clip.getMicrosecondLength()) {
                clip.setMicrosecondPosition(newPosition);
                updateLyrics(); // Update lyrics to match the new position
            } else {
                // Handle reaching the end of the song or desired behavior
            }
        }
    }//GEN-LAST:event_backwardButtonActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMusicButton;
    private javax.swing.JButton backwardButton;
    private javax.swing.JTextField durationText;
    private javax.swing.JButton forwardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lyricsText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel musicPlaying;
    private javax.swing.JTable musicTable;
    private javax.swing.JButton pausePlayButton;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}
