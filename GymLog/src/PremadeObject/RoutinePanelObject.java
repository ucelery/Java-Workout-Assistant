package PremadeObject;

import MyApp.Main;
import MyLibs.Exercise;
import MyLibs.Routine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RoutinePanelObject extends javax.swing.JPanel {
    private Routine routine;
    private CardLayout cardLayout;
    private JPanel mainScreen;
    
    public RoutinePanelObject(CardLayout cardLayout, JPanel mainScreen, Routine routine) {
        initComponents();
        routineNameLabel.setText(routine.getName());
        this.routine = routine;
        
        this.cardLayout = cardLayout;
        this.mainScreen = mainScreen;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        routinePlayButton = new javax.swing.JLabel();
        routineNameLabel = new javax.swing.JLabel();
        routinePlayButton1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        routinePlayButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        routinePlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/Play.png"))); // NOI18N
        routinePlayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        routinePlayButton.setIconTextGap(18);
        routinePlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineObjectButtonClicked(evt);
            }
        });

        routineNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        routineNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        routineNameLabel.setText("Routine Name");
        routineNameLabel.setIconTextGap(18);

        routinePlayButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        routinePlayButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyIcons/delete.png"))); // NOI18N
        routinePlayButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        routinePlayButton1.setIconTextGap(18);
        routinePlayButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteRoutine(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(routinePlayButton1)
                .addGap(29, 29, 29)
                .addComponent(routinePlayButton)
                .addGap(18, 18, 18)
                .addComponent(routineNameLabel)
                .addContainerGap(783, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(routinePlayButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(routineNameLabel)
                        .addGap(12, 12, 12)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(routinePlayButton1)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void routineObjectButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routineObjectButtonClicked
        Object src = evt.getSource();
        
        if (src == routinePlayButton) {
            String routineDeets = getRoutineDeets();
            int userChoice = JOptionPane.showConfirmDialog(this, routineDeets);
            
            if (userChoice == JOptionPane.YES_OPTION) {
                // move on to the next screen
                ActivityPanelScreen activityScreen = new ActivityPanelScreen(routine);
                activityScreen.setBounds(0, 0, 647, 343);
                
                Main mainFrame = (Main)SwingUtilities.getAncestorOfClass(Main.class, mainScreen);
                mainFrame.switchScreens("activityScreen");
                mainFrame.getActivityScreen().add(activityScreen);
            }
        }
    }//GEN-LAST:event_routineObjectButtonClicked

    private void deleteRoutine(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteRoutine
        int choice = JOptionPane.showConfirmDialog(mainScreen, "Are you sure you want to delete " + routine.getName() + "?", "Warning", JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            
            getMain().removeRoutine(routine, this);
        }
            
        
    }//GEN-LAST:event_deleteRoutine

    private Main getMain() {
        return (Main)SwingUtilities.getAncestorOfClass(Main.class, this);
    }
    
    private String getRoutineDeets() {
        String returnStr = "Routine: " + routine.getName() + "\n";
        for (Exercise e : routine.getExercises()) {
            returnStr += "Exercises:" + "\n" +
                    "- " + e.getName() + "\n" +
                    "— " + Main.format(e.getSets()) + " sets" + "\n" +
                    "— " + Main.format(e.getTime()) + " seconds" + "\n" +
                    "— " + Main.format(e.getTime()) + " break intervals" + "\n\n";
        }
        return returnStr;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel routineNameLabel;
    private javax.swing.JLabel routinePlayButton;
    private javax.swing.JLabel routinePlayButton1;
    // End of variables declaration//GEN-END:variables
}
