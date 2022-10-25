package PremadeObject;

import MyApp.Main;
import MyLibs.Exercise;
import MyLibs.Routine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class ActivityPanelScreen extends javax.swing.JPanel {
    private Routine routine;
    private int exerciseIndex;
    private Exercise curExercise = null;
    
    public Timer timer;

    JPanel thisPanel = this;
    
    public ActivityPanelScreen(Routine routine) {
        initComponents();
        
        breakLabel.setVisible(false);
        updateLabels(routine.getExercises().get(exerciseIndex), false);
        
        this.routine = routine; 
        
        // Start Timer
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (curExercise == null)
                    curExercise = new Exercise(routine.getExercises().get(exerciseIndex));
                
                float execTime = routine.getExercises().get(exerciseIndex).getTime();
                float breakTime = routine.getExercises().get(exerciseIndex).getBreakTime();
                int setsLeft = routine.getExercises().get(exerciseIndex).getSets();
                
                if (execTime > 1) {
                    routine.getExercises().get(exerciseIndex).setTime(execTime - 1);
                    updateLabels(routine.getExercises().get(exerciseIndex), false);
                    
                    breakLabel.setVisible(false);
                } else if (breakTime > 1) {
                    routine.getExercises().get(exerciseIndex).setBreakTime(breakTime - 1);
                    updateLabels(routine.getExercises().get(exerciseIndex), true);
                    
                    breakLabel.setVisible(true);
                } else if (setsLeft > 1) {
                    routine.getExercises().get(exerciseIndex).setSets(setsLeft - 1);
                    routine.getExercises().get(exerciseIndex).setTime(curExercise.getTime());
                    routine.getExercises().get(exerciseIndex).setBreakTime(curExercise.getBreakTime());
                    
                    breakLabel.setVisible(false);
                    
                    updateLabels(routine.getExercises().get(exerciseIndex), true);
                } else exerciseIndex++;
                
                if (exerciseIndex > routine.getExercises().size() - 1) {
                    changeScreens("routineScreen");
                    timer.stop();
                }
            }
        });
        
        timer.setRepeats(true);
        timer.start();
    }
    
    private Main getMain() {
        return (Main)SwingUtilities.getAncestorOfClass(Main.class, this);
    }
    
    private void changeScreens(String screen) {
        Main mainFrame = getMain();
        
        // if mainFrame got deleted
        if (mainFrame == null) return;
        
        mainFrame.switchScreens(screen);
        timer.stop();
    }
    
    private void updateLabels(Exercise exer, boolean isBreak) {
        // Exercise name
        exerciseNameLabel.setText((exerciseIndex + 1) + " —" + exer.getName());
        
        // Time
        if (!isBreak) {
            // execution time
            executionTimeLabel.setText(Main.format(exer.getTime()));
        } else {
            // break time
            executionTimeLabel.setText(Main.format(exer.getBreakTime()));
        }
        
        // Sets
        setsNumberLabel.setText(Main.format(exer.getSets()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        setsNumberLabel = new javax.swing.JLabel();
        executionTimeLabel = new javax.swing.JLabel();
        exerciseNameLabel = new javax.swing.JLabel();
        breakLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 32, 32));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sets");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Seconds Left");

        setsNumberLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        setsNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        setsNumberLabel.setText("0/0");

        executionTimeLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        executionTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        executionTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        executionTimeLabel.setText("000");

        exerciseNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        exerciseNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        exerciseNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exerciseNameLabel.setText("0. —Exercise Name");

        breakLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        breakLabel.setForeground(new java.awt.Color(255, 255, 255));
        breakLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        breakLabel.setText("Take a break you did great!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(executionTimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(50, 50, 50)
                        .addComponent(setsNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addComponent(exerciseNameLabel))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(exerciseNameLabel)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executionTimeLabel)
                    .addComponent(jLabel19)
                    .addComponent(setsNumberLabel)
                    .addComponent(jLabel14))
                .addGap(58, 58, 58)
                .addComponent(breakLabel)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel breakLabel;
    private javax.swing.JLabel executionTimeLabel;
    private javax.swing.JLabel exerciseNameLabel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel setsNumberLabel;
    // End of variables declaration//GEN-END:variables
}