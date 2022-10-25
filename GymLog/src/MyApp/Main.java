/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import MyLibs.*;
import PremadeObject.RoutinePanelObject;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class Main extends javax.swing.JFrame {
    public static JFrame frame = null;
    CardLayout cardLayout;
    boolean menuToggle = false;
    
    public ArrayList<Routine> routineList = new ArrayList<>();
    
    Exercise tempExer = null;
    Routine tempRoutine = null;
    
    public Stack<String> history = new Stack();
    
    public Main() {
        initComponents();
        cardLayout = (CardLayout)(mainScreen.getLayout());
        menuBar.setVisible(false);
        initializeHotkeys();
        populateRoutineList();
        customInit();
        
        history.add("titleScreen");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainScreen = new javax.swing.JPanel();
        titleScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        routineScreen = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        divider = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        routinePanelContainer = new javax.swing.JPanel();
        addRoutineScreen = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        routineNameTxt = new javax.swing.JTextField();
        setsTxt = new javax.swing.JTextField();
        breakIntervalTxt = new javax.swing.JTextField();
        executionTimeTxt = new javax.swing.JTextField();
        exerciseNameTxt = new javax.swing.JTextField();
        addExerciseBtn = new javax.swing.JLabel();
        addRoutineBtn = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exercisesCount = new javax.swing.JLabel();
        activityScreen = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        homeMenu = new javax.swing.JMenuItem();
        routineMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GymLogger");
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/back.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonClicked(evt);
            }
        });

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)))
        );

        mainScreen.setBackground(new java.awt.Color(32, 32, 32));
        mainScreen.setLayout(new java.awt.CardLayout());

        titleScreen.setBackground(new java.awt.Color(32, 32, 32));
        titleScreen.setName("titleScreen"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/Group 288915.png"))); // NOI18N
        jLabel1.setText("Gym Log");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("press alt key to reveal the menu bar!");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout titleScreenLayout = new javax.swing.GroupLayout(titleScreen);
        titleScreen.setLayout(titleScreenLayout);
        titleScreenLayout.setHorizontalGroup(
            titleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleScreenLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(titleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleScreenLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleScreenLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(173, 173, 173))))
        );
        titleScreenLayout.setVerticalGroup(
            titleScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleScreenLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        mainScreen.add(titleScreen, "titleScreen");

        routineScreen.setBackground(new java.awt.Color(32, 32, 32));
        routineScreen.setName("routineScreen"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/plus.png"))); // NOI18N
        jLabel14.setText("add routine");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setIconTextGap(8);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRoutineClick(evt);
            }
        });

        divider.setBackground(new java.awt.Color(153, 153, 153));
        divider.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout dividerLayout = new javax.swing.GroupLayout(divider);
        divider.setLayout(dividerLayout);
        dividerLayout.setHorizontalGroup(
            dividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dividerLayout.setVerticalGroup(
            dividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jScrollPane1.setBackground(new java.awt.Color(32, 32, 32));
        jScrollPane1.setBorder(null);

        routinePanelContainer.setBackground(new java.awt.Color(32, 32, 32));

        javax.swing.GroupLayout routinePanelContainerLayout = new javax.swing.GroupLayout(routinePanelContainer);
        routinePanelContainer.setLayout(routinePanelContainerLayout);
        routinePanelContainerLayout.setHorizontalGroup(
            routinePanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        routinePanelContainerLayout.setVerticalGroup(
            routinePanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(routinePanelContainer);

        javax.swing.GroupLayout routineScreenLayout = new javax.swing.GroupLayout(routineScreen);
        routineScreen.setLayout(routineScreenLayout);
        routineScreenLayout.setHorizontalGroup(
            routineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routineScreenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(routineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routineScreenLayout.createSequentialGroup()
                        .addComponent(divider, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routineScreenLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(routineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routineScreenLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routineScreenLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))))
        );
        routineScreenLayout.setVerticalGroup(
            routineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routineScreenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainScreen.add(routineScreen, "routineScreen");

        addRoutineScreen.setBackground(new java.awt.Color(32, 32, 32));
        addRoutineScreen.setName("addRoutineScreen"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Routine");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Exercises");

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

        setsTxt.setBackground(new java.awt.Color(32, 32, 32));
        setsTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        setsTxt.setForeground(new java.awt.Color(255, 255, 255));
        setsTxt.setText("0");
        setsTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        breakIntervalTxt.setBackground(new java.awt.Color(32, 32, 32));
        breakIntervalTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        breakIntervalTxt.setForeground(new java.awt.Color(255, 255, 255));
        breakIntervalTxt.setText("0");
        breakIntervalTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        executionTimeTxt.setBackground(new java.awt.Color(32, 32, 32));
        executionTimeTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        executionTimeTxt.setForeground(new java.awt.Color(255, 255, 255));
        executionTimeTxt.setText("0");
        executionTimeTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        exerciseNameTxt.setBackground(new java.awt.Color(32, 32, 32));
        exerciseNameTxt.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        exerciseNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        exerciseNameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        addExerciseBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        addExerciseBtn.setForeground(new java.awt.Color(255, 255, 255));
        addExerciseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/plus.png"))); // NOI18N
        addExerciseBtn.setText("Add Exercise");
        addExerciseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addExerciseBtn.setIconTextGap(8);
        addExerciseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addObjectButton(evt);
            }
        });

        addRoutineBtn.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        addRoutineBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRoutineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/plus.png"))); // NOI18N
        addRoutineBtn.setText("Add Routine");
        addRoutineBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRoutineBtn.setIconTextGap(8);
        addRoutineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addObjectButton(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Exercises:");

        exercisesCount.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        exercisesCount.setForeground(new java.awt.Color(255, 255, 255));
        exercisesCount.setText("0");

        javax.swing.GroupLayout addRoutineScreenLayout = new javax.swing.GroupLayout(addRoutineScreen);
        addRoutineScreen.setLayout(addRoutineScreenLayout);
        addRoutineScreenLayout.setHorizontalGroup(
            addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addRoutineScreenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addRoutineScreenLayout.createSequentialGroup()
                        .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addComponent(executionTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(addExerciseBtn))
                    .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addGroup(addRoutineScreenLayout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(addRoutineScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(addRoutineBtn))))
                .addContainerGap(161, Short.MAX_VALUE))
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
                .addContainerGap(96, Short.MAX_VALUE))
        );

        mainScreen.add(addRoutineScreen, "addRoutineScreen");

        activityScreen.setBackground(new java.awt.Color(32, 32, 32));
        activityScreen.setName("activityScreen"); // NOI18N

        javax.swing.GroupLayout activityScreenLayout = new javax.swing.GroupLayout(activityScreen);
        activityScreen.setLayout(activityScreenLayout);
        activityScreenLayout.setHorizontalGroup(
            activityScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        activityScreenLayout.setVerticalGroup(
            activityScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        mainScreen.add(activityScreen, "activityScreen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(32, 32, 32));
        menuBar.setForeground(new java.awt.Color(32, 32, 32));

        jMenu1.setBackground(new java.awt.Color(32, 32, 32));
        jMenu1.setText("Window");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        homeMenu.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        homeMenu.setText("Home");
        homeMenu.setToolTipText("");
        homeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(homeMenu);

        routineMenu.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        routineMenu.setText("Routine");
        routineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(routineMenu);

        menuBar.add(jMenu1);

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

    private void customInit() {
        // Remove routine scroll pane horizontal scroll
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        // disable text/symbol input
        ((AbstractDocument) setsTxt.getDocument()).setDocumentFilter(new DocumentFilter() {
            Pattern regEx = Pattern.compile("\\d+");

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                Matcher matcher = regEx.matcher(text);
                if (!matcher.matches()) {
                    return;
                }
                super.replace(fb, offset, length, text, attrs);
            }
        });
        
        ((AbstractDocument) breakIntervalTxt.getDocument()).setDocumentFilter(new DocumentFilter() {
            Pattern regEx = Pattern.compile("\\d+");

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                Matcher matcher = regEx.matcher(text);
                if (!matcher.matches()) {
                    return;
                }
                super.replace(fb, offset, length, text, attrs);
            }
        });
        
        ((AbstractDocument) executionTimeTxt.getDocument()).setDocumentFilter(new DocumentFilter() {
            Pattern regEx = Pattern.compile("\\d+");

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                Matcher matcher = regEx.matcher(text);
                if (!matcher.matches()) {
                    return;
                }
                super.replace(fb, offset, length, text, attrs);
            }
        });
    }
    
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
            switchScreens("titleScreen");
        } else if (src == routineMenu) {
            switchScreens("routineScreen");
            
            updateRoutineScreen();
        }
    }//GEN-LAST:event_menuButtonActionPerformed

    private void updateRoutineScreen() {
        int yPos = 0;
            int margin = 10;
            for (Routine r : routineList) {
                RoutinePanelObject routinePanel = new RoutinePanelObject(cardLayout, mainScreen, r);
                int pnlHeight = routinePanel.getPreferredSize().height;
                int pnlWidth = routinePanel.getPreferredSize().width;
            
                routinePanelContainer.add(routinePanel);
                
                routinePanel.setBounds(0, yPos, pnlWidth, pnlHeight);
                yPos += pnlHeight + margin;
            }
            
            routinePanelContainer.setPreferredSize(new Dimension(routinePanelContainer.getPreferredSize().width, yPos));
            routinePanelContainer.repaint();
    }
    
    public void removeRoutine(Routine routine, JPanel panelObj) {
        routineList.remove(routine);
        updateFiles();
        updateRoutineScreen();
        routinePanelContainer.remove(panelObj);   
    }
    
    private void addObjectButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addObjectButton
        Object src = evt.getSource();
        
        if (src == addExerciseBtn) {
            if (!verifyInputFields(false)) {
                JOptionPane.showMessageDialog(null, "Please make sure to fill up all the fields.");
                return;
            }
            
            // Add Exercise Button
            String name = exerciseNameTxt.getText();
            int sets = Integer.parseInt(setsTxt.getText());
            float breakInterval = Float.parseFloat(breakIntervalTxt.getText());
            float execTime = Float.parseFloat(executionTimeTxt.getText());
            
            tempExer = new Exercise(name, execTime, breakInterval, sets);
            
            tempRoutine.getExercises().add(tempExer);
            
            exerciseNameTxt.setText("");
            setsTxt.setText("0");
            breakIntervalTxt.setText("0");
            executionTimeTxt.setText("0");
            
            JOptionPane.showMessageDialog(null, "Success!");
            exercisesCount.setText(Integer.toString(tempRoutine.getExercises().size()));
        } else if (src == addRoutineBtn) {
            if (!verifyInputFields(true)) {
                JOptionPane.showMessageDialog(null, "Please make sure to fill up all the fields and have at least one Exercise.");
                return;
            }
            
            // Add Routine Button
            String routineName = routineNameTxt.getText();
            tempRoutine.setName(routineName);
            
            routineNameTxt.setText("");
            routineList.add(tempRoutine);
            
            updateFiles();
            JOptionPane.showMessageDialog(null, "Success!");
        }
    }//GEN-LAST:event_addObjectButton

    private void addRoutineClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRoutineClick
        switchScreens("addRoutineScreen");
        tempRoutine = new Routine(Integer.toString(routineList.size()));
        exercisesCount.setText(Integer.toString(tempRoutine.getExercises().size()));
    }//GEN-LAST:event_addRoutineClick

    private void backButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonClicked
        backButton();
    }//GEN-LAST:event_backButtonClicked

    public void backButton() {
        if (history.size() < 2) return;
        
        if (history.get(history.size() - 1) == "activityScreen")
            activityScreen.removeAll();
        
        history.pop();
        
        if (history.get(history.size() - 1) == "routineScreen")
            updateRoutineScreen();
        
        cardLayout.show(mainScreen, history.get(history.size() - 1)) ;
    }
    
    public void switchScreens(String newScreen) {
        if (history.get(history.size() - 1) != newScreen)
            history.add(newScreen);
        
        cardLayout.show(mainScreen, newScreen);
    }
    
    public boolean verifyInputFields(boolean isRoutine) {
        // Check routine
        if (isRoutine) {
            if (routineNameTxt.getText().isEmpty()) return false;
            
            // Check if there are exercises
            if (tempRoutine.getExercises().size() < 1) return false;
        } else {
            if (exerciseNameTxt.getText().isEmpty()) return false;
            else if (setsTxt.getText().isEmpty() || setsTxt.getText().equals("0")) return false;
            else if (breakIntervalTxt.getText().isEmpty() || breakIntervalTxt.getText().equals("0")) return false;
            else if (executionTimeTxt.getText().isEmpty() || executionTimeTxt.getText().equals("0")) return false;
        }
        
        return true;
    }
    
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
                
                ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "\\src\\MyIcons\\Group 288915.png");
                frame.setIconImage(icon.getImage());
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
    
    public JPanel getActivityScreen() {
        return activityScreen;
    }
    
    public static String format(double d) {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activityScreen;
    private javax.swing.JLabel addExerciseBtn;
    private javax.swing.JLabel addRoutineBtn;
    private javax.swing.JPanel addRoutineScreen;
    private javax.swing.JTextField breakIntervalTxt;
    private javax.swing.JPanel divider;
    private javax.swing.JTextField executionTimeTxt;
    private javax.swing.JTextField exerciseNameTxt;
    private javax.swing.JLabel exercisesCount;
    private javax.swing.JMenuItem homeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem routineMenu;
    private javax.swing.JTextField routineNameTxt;
    private javax.swing.JPanel routinePanelContainer;
    private javax.swing.JPanel routineScreen;
    private javax.swing.JTextField setsTxt;
    private javax.swing.JPanel titleBar;
    private javax.swing.JPanel titleScreen;
    // End of variables declaration//GEN-END:variables
}
