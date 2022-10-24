/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import MyLibs.*;
import java.awt.CardLayout;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    static JFrame frame = null;
    CardLayout cardLayout;
    boolean menuToggle = false;
    
    ArrayList<Routine> routineList = new ArrayList<Routine>();
    ArrayList<Exercise> tempExercises = new ArrayList<Exercise>();
    
    public Main() {
        initComponents();
        cardLayout = (CardLayout)(mainScreen.getLayout());
        menuBar.setVisible(false);
        initializeHotkeys();
        populateRoutineList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mainScreen = new javax.swing.JPanel();
        titleScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        routineScreen = new javax.swing.JPanel();
        routineContainers = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        monRoutineBtn = new javax.swing.JLabel();
        monInfoBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tuesRoutineBtn = new javax.swing.JLabel();
        tueInfoBtn = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        wedRoutineBtn = new javax.swing.JLabel();
        wedInfoBtn = new javax.swing.JLabel();
        addRoutineScreen = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        routineNameTxt = new javax.swing.JTextField();
        repsTxt = new javax.swing.JTextField();
        setsTxt = new javax.swing.JTextField();
        breakIntervalTxt = new javax.swing.JTextField();
        executionTimeTxt = new javax.swing.JTextField();
        exerciseNameTxt = new javax.swing.JTextField();
        addExerciseBtn = new javax.swing.JLabel();
        addRoutineBtn = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exercisesCount = new javax.swing.JLabel();
        activityScreen = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        exerciseNameLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        homeMenu = new javax.swing.JMenuItem();
        routineMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(32, 32, 32));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        titleBar.setBackground(new java.awt.Color(32, 32, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/close.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonClicked(evt);
            }
        });

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(17, 17, 17))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        mainScreen.setBackground(new java.awt.Color(32, 32, 32));
        mainScreen.setLayout(new java.awt.CardLayout());

        titleScreen.setBackground(new java.awt.Color(32, 32, 32));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/Group 288915.png"))); // NOI18N
        jLabel1.setText("Gym Log");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("click to start!");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout titleScreenLayout = new javax.swing.GroupLayout(titleScreen);
        titleScreen.setLayout(titleScreenLayout);
        titleScreenLayout.setHorizontalGroup(
            titleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleScreenLayout.createSequentialGroup()
                .addGroup(titleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(titleScreenLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(titleScreenLayout.createSequentialGroup()
                        .addGap(21, 180, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(137, 137, 137))
        );
        titleScreenLayout.setVerticalGroup(
            titleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleScreenLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        mainScreen.add(titleScreen, "titleScreen");

        routineScreen.setBackground(new java.awt.Color(32, 32, 32));

        routineContainers.setBackground(new java.awt.Color(32, 32, 32));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        monRoutineBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        monRoutineBtn.setForeground(new java.awt.Color(255, 255, 255));
        monRoutineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/Play.png"))); // NOI18N
        monRoutineBtn.setText("Monday Routine");
        monRoutineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        monRoutineBtn.setIconTextGap(8);
        monRoutineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineBtnClick(evt);
            }
        });

        monInfoBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        monInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/InfoIcon.png"))); // NOI18N
        monInfoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        monInfoBtn.setIconTextGap(8);
        monInfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineInfoClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(monInfoBtn)
                .addGap(25, 25, 25)
                .addComponent(monRoutineBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monInfoBtn)
                    .addComponent(monRoutineBtn))
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        tuesRoutineBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tuesRoutineBtn.setForeground(new java.awt.Color(255, 255, 255));
        tuesRoutineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/Play.png"))); // NOI18N
        tuesRoutineBtn.setText("Tuesday Routine");
        tuesRoutineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tuesRoutineBtn.setIconTextGap(8);
        tuesRoutineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineBtnClick(evt);
            }
        });

        tueInfoBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tueInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/InfoIcon.png"))); // NOI18N
        tueInfoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tueInfoBtn.setIconTextGap(8);
        tueInfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineInfoClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tueInfoBtn)
                .addGap(25, 25, 25)
                .addComponent(tuesRoutineBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tueInfoBtn)
                    .addComponent(tuesRoutineBtn))
                .addGap(20, 20, 20))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        wedRoutineBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        wedRoutineBtn.setForeground(new java.awt.Color(255, 255, 255));
        wedRoutineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/Play.png"))); // NOI18N
        wedRoutineBtn.setText("Wednesday Routine");
        wedRoutineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wedRoutineBtn.setIconTextGap(8);
        wedRoutineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineBtnClick(evt);
            }
        });

        wedInfoBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        wedInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/InfoIcon.png"))); // NOI18N
        wedInfoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wedInfoBtn.setIconTextGap(8);
        wedInfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineInfoClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(wedInfoBtn)
                .addGap(25, 25, 25)
                .addComponent(wedRoutineBtn)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wedInfoBtn)
                    .addComponent(wedRoutineBtn))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout routineContainersLayout = new javax.swing.GroupLayout(routineContainers);
        routineContainers.setLayout(routineContainersLayout);
        routineContainersLayout.setHorizontalGroup(
            routineContainersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        routineContainersLayout.setVerticalGroup(
            routineContainersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routineContainersLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout routineScreenLayout = new javax.swing.GroupLayout(routineScreen);
        routineScreen.setLayout(routineScreenLayout);
        routineScreenLayout.setHorizontalGroup(
            routineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routineScreenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(routineContainers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        routineScreenLayout.setVerticalGroup(
            routineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routineScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(routineContainers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainScreen.add(routineScreen, "routineScreen");

        addRoutineScreen.setBackground(new java.awt.Color(32, 32, 32));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Routine");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Exercises");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reps");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sets");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Break Interval");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Execution Time");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");

        routineNameTxt.setBackground(new java.awt.Color(32, 32, 32));
        routineNameTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        routineNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        routineNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        repsTxt.setBackground(new java.awt.Color(32, 32, 32));
        repsTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        repsTxt.setForeground(new java.awt.Color(255, 255, 255));
        repsTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        setsTxt.setBackground(new java.awt.Color(32, 32, 32));
        setsTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        setsTxt.setForeground(new java.awt.Color(255, 255, 255));
        setsTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        breakIntervalTxt.setBackground(new java.awt.Color(32, 32, 32));
        breakIntervalTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        breakIntervalTxt.setForeground(new java.awt.Color(255, 255, 255));
        breakIntervalTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        executionTimeTxt.setBackground(new java.awt.Color(32, 32, 32));
        executionTimeTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        executionTimeTxt.setForeground(new java.awt.Color(255, 255, 255));
        executionTimeTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        exerciseNameTxt.setBackground(new java.awt.Color(32, 32, 32));
        exerciseNameTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        exerciseNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        exerciseNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        addExerciseBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        addExerciseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/plus.png"))); // NOI18N
        addExerciseBtn.setText("Add Exercise");
        addExerciseBtn.setIconTextGap(8);
        addExerciseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addObjectButton(evt);
            }
        });

        addRoutineBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        addRoutineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/plus.png"))); // NOI18N
        addRoutineBtn.setText("Add Routine");
        addRoutineBtn.setIconTextGap(8);
        addRoutineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addObjectButton(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Exercises:");

        exercisesCount.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        exercisesCount.setText("0");

        javax.swing.GroupLayout addRoutineScreenLayout = new javax.swing.GroupLayout(addRoutineScreen);
        addRoutineScreen.setLayout(addRoutineScreenLayout);
        addRoutineScreenLayout.setHorizontalGroup(
            addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addGroup(addRoutineScreenLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(repsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(breakIntervalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(executionTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exerciseNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addRoutineScreenLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exercisesCount))
                                    .addComponent(routineNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addExerciseBtn)
                            .addComponent(addRoutineBtn))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        addRoutineScreenLayout.setVerticalGroup(
            addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(routineNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRoutineBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(exercisesCount))
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(exerciseNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakIntervalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executionTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(addExerciseBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainScreen.add(addRoutineScreen, "addRoutineScreen");

        activityScreen.setBackground(new java.awt.Color(32, 32, 32));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("00:00");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setText("Execution Time");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel17.setText("Sets");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel18.setText("0/0");

        exerciseNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        exerciseNameLabel.setText("Exercise Name");

        javax.swing.GroupLayout activityScreenLayout = new javax.swing.GroupLayout(activityScreen);
        activityScreen.setLayout(activityScreenLayout);
        activityScreenLayout.setHorizontalGroup(
            activityScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activityScreenLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addGroup(activityScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activityScreenLayout.createSequentialGroup()
                        .addGroup(activityScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exerciseNameLabel)
                            .addComponent(jLabel13))
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activityScreenLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activityScreenLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(287, 287, 287))))
        );
        activityScreenLayout.setVerticalGroup(
            activityScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activityScreenLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(exerciseNameLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(67, 67, 67)
                .addGroup(activityScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(99, 99, 99))
        );

        mainScreen.add(activityScreen, "card5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(32, 32, 32));
        menuBar.setForeground(new java.awt.Color(32, 32, 32));

        jMenu1.setBackground(new java.awt.Color(32, 32, 32));
        jMenu1.setText("Window");

        homeMenu.setText("Home");
        homeMenu.setToolTipText("");
        homeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(homeMenu);

        routineMenu.setText("Routine");
        routineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(routineMenu);

        menuBar.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(32, 32, 32));
        jMenu2.setText("About");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateRoutineList() {
        try {
            // Get routines data
            File myObj = new File(System.getProperty("user.dir") + "\\src\\Data\\Routines.txt");
            Scanner myReader = new Scanner(myObj);
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split(",");
                
                String _id = values[0];
                String _routineName = values[1];
                
                Routine routine = new Routine(_id, _routineName);
                routine.updateExercisesFromFile();
                
                routineList.add(routine);
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    private void initializeHotkeys () {
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
            .addKeyEventDispatcher(new KeyEventDispatcher() {
                @Override
                public boolean dispatchKeyEvent(KeyEvent e) {
                    if (KeyEvent.KEY_RELEASED == e.getID()) return false;
                    if (e.getKeyCode() == 18) {
                        toggleMenuBar();
                    }
                    return false;
                }
          });
    }
    
    private void toggleMenuBar() {
        menuToggle = !menuToggle;
        menuBar.setVisible(menuToggle);
    }
    
    private void closeButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonClicked
        if (frame == null) return;
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_closeButtonClicked

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        Object src = evt.getSource();
        if (src == homeMenu) {
            cardLayout.show(mainScreen, "titleScreen");
            updateFiles();
        } else if (src == routineMenu) {
            cardLayout.show(mainScreen, "routineScreen");
        }
    }//GEN-LAST:event_menuButtonActionPerformed

    private void addObjectButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addObjectButton
        Object src = evt.getSource();
        if (src == addRoutineBtn) {
            String name = exerciseNameTxt.getText();
            String reps = repsTxt.getText();
            String sets = setsTxt.getText();
            String breakInterval = breakIntervalTxt.getText();
            String execTime = executionTimeTxt.getText();
        } else if (src == addExerciseBtn) {
            String routineName = routineNameTxt.getText();
        }
    }//GEN-LAST:event_addObjectButton

    private void routineBtnClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routineBtnClick
        // TODO add your handling code here:
    }//GEN-LAST:event_routineBtnClick

    private void routineInfoClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routineInfoClicked
        Object src = evt.getSource();
        String exerDeets = "";
        if (src == monInfoBtn) {
            exerDeets = """
                        Routine Name: Monday Routine
                        Exercises: Jogging, Push-ups, Sit-ups
                        """;
        } else if (src == tueInfoBtn) {
            exerDeets = """
                        Routine Name: Tuesday Routine
                        Exercises: Jogging, Push-ups, Sit-ups
                        """;
        } else if (src == wedInfoBtn) {
            exerDeets = """
                        Routine Name: Wednesday Routine
                        Exercises: Jogging, Push-ups, Sit-ups
                        """;
        }
        
        JOptionPane.showMessageDialog(null, exerDeets);
    }//GEN-LAST:event_routineInfoClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new Main();
                frame.setVisible(true);
                frame.setShape(new RoundRectangle2D.Double(0, 0, frame.getWidth(), frame.getHeight(), 20, 20));
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                FrameDragListener frameDragListener = new FrameDragListener(frame);
                frame.addMouseListener(frameDragListener);
                frame.addMouseMotionListener(frameDragListener);
            }
        });
    }

    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }
    
    public void updateFiles() {
        String routineDataStr = "";
        String exerciseDataStr = "";
        
        // Loop through all the Routines
        for (Routine r : routineList) {
            String _routineId = r.getId();
            String _routineName = r.getName();
            
            routineDataStr += _routineId + "," + _routineName + "\n";
                
            // Loop through this routine's exercises
            for (Exercise e : r.getExercises()) {
                String typeStr = e.getType() == Exercise.Type.Reps ? 
                        "reps" : "time";
                exerciseDataStr += _routineId + "," +
                        e.getName() + "," +
                        typeStr + "," +
                        e.getBreakTime() + "," +
                        e.getTime() + "," +
                        e.getReps() + "," +
                        e.getSets() + "\n";
            }
        }
        
        // Update Exercise and Routine Files
        try {
            String path = System.getProperty("user.dir") + "\\src\\Data\\Exercises.txt";
            FileWriter myWriter = new FileWriter(path);
            
            myWriter.write(exerciseDataStr);
            myWriter.close();
            
            path = System.getProperty("user.dir") + "\\src\\Data\\Routines.txt";
            myWriter = new FileWriter(path);
            
            myWriter.write(routineDataStr);
            myWriter.close();
            
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activityScreen;
    private javax.swing.JLabel addExerciseBtn;
    private javax.swing.JLabel addRoutineBtn;
    private javax.swing.JPanel addRoutineScreen;
    private javax.swing.JTextField breakIntervalTxt;
    private javax.swing.JTextField executionTimeTxt;
    private javax.swing.JLabel exerciseNameLabel;
    private javax.swing.JTextField exerciseNameTxt;
    private javax.swing.JLabel exercisesCount;
    private javax.swing.JMenuItem homeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel monInfoBtn;
    private javax.swing.JLabel monRoutineBtn;
    private javax.swing.JTextField repsTxt;
    private javax.swing.JPanel routineContainers;
    private javax.swing.JMenuItem routineMenu;
    private javax.swing.JTextField routineNameTxt;
    private javax.swing.JPanel routineScreen;
    private javax.swing.JTextField setsTxt;
    private javax.swing.JPanel titleBar;
    private javax.swing.JPanel titleScreen;
    private javax.swing.JLabel tueInfoBtn;
    private javax.swing.JLabel tuesRoutineBtn;
    private javax.swing.JLabel wedInfoBtn;
    private javax.swing.JLabel wedRoutineBtn;
    // End of variables declaration//GEN-END:variables
}
